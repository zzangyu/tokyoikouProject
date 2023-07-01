package com.tokyoProject.action;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tokyoProject.control.ActionForward;
import com.tokyoProject.model.MemberDAO;
import com.tokyoProject.model.MemberVO;

public class RegProcAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		request.setCharacterEncoding("utf-8");
		
		MemberDAO dao = MemberDAO.getInstance();
		
		MemberVO vo = new MemberVO(
				request.getParameter("acountCheck"),
				request.getParameter("nickNameCheck"),
				request.getParameter("passwordCheck"),
				request.getParameter("passwordCheck2"),
				request.getParameter("familyNameCheck"),
				request.getParameter("firstNameCheck"),
				request.getParameter("yearCheck"),
				request.getParameter("monthCheck"),
				request.getParameter("dateCheck"),
				request.getParameter("phone1Check"),
				request.getParameter("phone2Check"),
				request.getParameter("phone3Check")
				);
		
		boolean flag = dao.insertMember(vo);
		request.setAttribute("flag", flag);
		System.out.println(flag);
		
		return new ActionForward("/pjt/regProc.jsp", false);
	}
}
