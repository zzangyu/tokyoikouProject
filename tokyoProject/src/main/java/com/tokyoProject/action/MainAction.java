package com.tokyoProject.action;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tokyoProject.control.ActionForward;

public class MainAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		return new ActionForward("/pjt/main.jsp", false);
	}

}
