package com.facebookweb.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.facebookweb.entity.FacebookUser;
import com.facebookweb.service.ServiceClass;
import com.facebookweb.service.ServiceInterface;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServiceInterface si;
	 public LoginServlet()
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
		
		
		//sending response
		response.setContentType("text/html");
		
		//wants to write on browser
		PrintWriter out = response.getWriter();
		
		out.println("<html><body>");
			out.println("Your name is :"+n1 );
			out.println("</br>Your password is :"+n2 );
			
		
		
		FacebookUser fu = new FacebookUser();
	
		fu.setName(n1);
		fu.setPassword(n2);
		
		boolean i = si.loginProfile(fu);
		if(true)
		{
			HttpSession ss=request.getSession(true);
			ss.setAttribute("userid", n1);
			ss.setAttribute("pass", n2);
			
			out.println("welcome "+n1+"   <a href=TimeLine>timeline</a>   <a href=FriendList>friendlist</a>");
	

		}
		else
		{
			out.println("Invalid id and password");
			RequestDispatcher rd=getServletContext().getRequestDispatcher("/login.html");
			rd.include(request, response);

		}
		out.println("</body></head>");
	}

}
