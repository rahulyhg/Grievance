package com.team.gs.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.omg.CORBA.Request;

import com.team.gs.beans.User;
import com.team.gs.dao.UserDao;

/**
 * Servlet implementation class ValidationServlet
 */
@WebServlet("/ValidationServlet")
public class ValidationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println(username);
		System.out.println(password);
		UserDao ud = new UserDao();
	User loginUser=ud.validateUser(username, password);
	if(loginUser!=null)
	{
		RequestDispatcher rd = request.getRequestDispatcher("dashboard.jsp");
		rd.forward(request, response);
		//session
		HttpSession session=request.getSession();
		session.setAttribute("email", loginUser.getEmail());
	}
	else
	{
		request.setAttribute("message", "Invalid username and password");
		RequestDispatcher rd = request.getRequestDispatcher("signin.jsp");
		rd.forward(request, response);
	}
	}

}
