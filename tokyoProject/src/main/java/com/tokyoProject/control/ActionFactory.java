package com.tokyoProject.control;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tokyoProject.action.*;

public class ActionFactory{
	
	private static ActionFactory instance;
	
	public ActionFactory() {}
	
	public static synchronized ActionFactory getInstance() {
		if(instance == null) {
			instance = new ActionFactory();
		}
		return instance;
	}
	
	public Action getAction(String cmd) {
		Action action = null;
		switch (cmd) {

		case "main":
			action = new MainAction();
			break;
		
		case "test":
			action = new TestAction();
			break;
			
		default:
			action = new MainAction();
			break;
		}
		return action;
	}
 	
}
