package com.facebookweb.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.facebookweb.entity.FacebookUser;
import com.facebookweb.service.ServiceClass;
import com.facebookweb.service.ServiceInterface;

/**
 * Servlet implementation class RegistrationServlet
 */
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServiceInterface si;
	 public RegistrationServlet()
	{
		si = new ServiceClass();
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String n1= request.getParameter("name");
		String n2= request.getParameter("password");
		String n3= request.getParameter("email");
		String n4= request.getParameter("address");
		
		//sending response
		response.setContentType("text/html");
		
		//wants to write on browser
		PrintWriter out = response.getWriter();
		
		out.println("<html><body>");
			out.println("Your name is :"+n1 );
			out.println("</br>Your password is :"+n2 );
			out.println("</br>Your email is :"+n3 );
			out.println("</br>Your addr is :"+n4 );
			out.println("</br>Your login is successful<a href=login.html>Continue...</a>");
		out.println("</body></html>");
		
		
		FacebookUser fu = new FacebookUser();
		fu.setAddress(n4);
		fu.setEmail(n3);
		fu.setName(n1);
		fu.setPassword(n2);
		
		try {
			int i = si.addservice(fu);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
