package com.tokyoProject.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.NamingException;

public class MemberDAO {
	private static MemberDAO instance = null;

	static Connection conn = null;
	
	private MemberDAO() {	}
	
	public static MemberDAO getInstance() {
		if(instance == null) {
			synchronized (MemberDAO.class) {
				instance = new MemberDAO();
			}
		}
		return instance;
	}
	
	private Connection getConnection() {

		try {
			conn = ConnUtil.getConnection();
		} catch (Exception e) {
			System.out.println("Connection ERROR");
			e.printStackTrace();
		}
		return conn;
	}
	
	public boolean insertMember(MemberVO vo) {
		boolean flag = false;
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			
			conn = getConnection();
			
			String strQuery = "insert into member values"
					+ "(?,?,?,?,?,?,?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(strQuery);
			
			pstmt.setString(1, vo.getM_id());
			pstmt.setString(2, vo.getM_nick());
			pstmt.setString(3, vo.getM_password());
			pstmt.setString(4, vo.getM_passwordCheck());
			pstmt.setString(5, vo.getM_myoji());
			pstmt.setString(6, vo.getM_name());
			pstmt.setString(7, vo.getM_year());
			pstmt.setString(8, vo.getM_month());
			pstmt.setString(9, vo.getM_date());
			pstmt.setString(10, vo.getM_phone1());
			pstmt.setString(11, vo.getM_phone2());
			pstmt.setString(12, vo.getM_phone3());
			
			int count = pstmt.executeUpdate();
			
			if(count > 0) {
				flag = true;
			}
			
		}catch(SQLException s1) {	
			s1.printStackTrace();
		
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try{rs.close();}catch(SQLException s1){}
			if(pstmt != null) try{pstmt.close();}catch(SQLException s2){}
			if(conn != null) try{conn.close();}catch(SQLException s3){}		
		}
		
		return flag;
	}
	
}
