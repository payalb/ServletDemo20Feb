package com.java.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/validate")
public class ValidateController extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		resp.addCookie(new Cookie("username", username));
		resp.addCookie(new Cookie("password", password));
		PrintWriter writer=resp.getWriter();
		writer.println("Welcome"+ username);
		writer.println("<a href='./welcome.jsp' >Welcome Page</a>");
	}
}
