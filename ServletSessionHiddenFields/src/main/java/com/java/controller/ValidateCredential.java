package com.java.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/validate")
public class ValidateCredential extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		
		PrintWriter writer=resp.getWriter();
		writer.println("<form action='welcome.jsp' method='post'>");
		writer.println("username is"+ username);
		writer.println("<input type='hidden' value="+username+ " name= 'username'>");
		writer.println("<input type='submit'>");
		writer.println("</form>");
		
		//resp.sendRedirect("welcome.jsp");
	/*	req.getRequestDispatcher("welcome.jsp").forward(req, resp);*/
	}
}
