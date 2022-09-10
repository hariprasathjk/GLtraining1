package com.Servlet.basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MultiplyServlet extends GenericServlet {

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
	if (request.getParameter("Number1")!=null && request.getParameter("Number2")!=null && request.getParameter("Number3")!=null) {
		Long num1=Long.parseLong(request.getParameter("Number1"));
		Long num2=Long.parseLong(request.getParameter("Number2"));
		Long num3=Long.parseLong(request.getParameter("Number3"));
		
		out.println("Result of the multiplication is"+(num1 * num2 * num3));
		
	} else {
		out.println("Enter the valid input");

	}	
	
	

}}
