package com.tokyoProject.model;

public class MemberVO {
	private String m_id;
	private String m_nick;
	private String m_password;
	private String m_passwordCheck;
	private String m_myoji;
	private String m_name; 
	private String m_year;
	private String m_month;
	private String m_date;
	private String m_phone1;
	private String m_phone2;
	private String m_phone3;
	
	public MemberVO(String m_id, String m_nick, String m_password, String m_passwordCheck, String m_myoji,
			String m_name, String m_year, String m_month, String m_date, String m_phone1, String m_phone2,
			String m_phone3) {
		super();
		this.m_id = m_id;
		this.m_nick = m_nick;
		this.m_password = m_password;
		this.m_passwordCheck = m_passwordCheck;
		this.m_myoji = m_myoji;
		this.m_name = m_name;
		this.m_year = m_year;
		this.m_month = m_month;
		this.m_date = m_date;
		this.m_phone1 = m_phone1;
		this.m_phone2 = m_phone2;
		this.m_phone3 = m_phone3;
	}
	public String getM_id() {
		return m_id;
	}
	public void setM_id(String m_id) {
		this.m_id = m_id;
	}
	public String getM_nick() {
		return m_nick;
	}
	public void setM_nick(String m_nick) {
		this.m_nick = m_nick;
	}
	public String getM_password() {
		return m_password;
	}
	public void setM_password(String m_password) {
		this.m_password = m_password;
	}
	public String getM_passwordCheck() {
		return m_passwordCheck;
	}
	public void setM_passwordCheck(String m_passwordCheck) {
		this.m_passwordCheck = m_passwordCheck;
	}
	public String getM_myoji() {
		return m_myoji;
	}
	public void setM_myoji(String m_myoji) {
		this.m_myoji = m_myoji;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public String getM_year() {
		return m_year;
	}
	public void setM_year(String m_year) {
		this.m_year = m_year;
	}
	public String getM_month() {
		return m_month;
	}
	public void setM_month(String m_month) {
		this.m_month = m_month;
	}
	public String getM_date() {
		return m_date;
	}
	public void setM_date(String m_date) {
		this.m_date = m_date;
	}
	public String getM_phone1() {
		return m_phone1;
	}
	public void setM_phone1(String m_phone1) {
		this.m_phone1 = m_phone1;
	}
	public String getM_phone2() {
		return m_phone2;
	}
	public void setM_phone2(String m_phone2) {
		this.m_phone2 = m_phone2;
	}
	public String getM_phone3() {
		return m_phone3;
	}
	public void setM_phone3(String m_phone3) {
		this.m_phone3 = m_phone3;
	}
	
}