package com.niuniu.webapp.action;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloAction extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8511975422286766344L;

	public void doGet(HttpServletRequest req, HttpServletResponse resp){
		try {
			resp.getWriter().print("hello world! Rambo!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
