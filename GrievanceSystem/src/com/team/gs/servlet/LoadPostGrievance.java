package com.team.gs.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.team.gs.beans.GrievanceSubject;
import com.team.gs.beans.SessionBean;
import com.team.gs.dao.GrievanceSubjectDao;

@WebServlet("/LoadPostGrievance")
public class LoadPostGrievance extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		GrievanceSubjectDao grievanceSubjectDao = new GrievanceSubjectDao();
		SessionBean sessionBean= (SessionBean) request.getSession().getAttribute("sessionBean");
		if(sessionBean!=null)
		{
		List<GrievanceSubject> subjectList=grievanceSubjectDao.findAllByCollegeId(sessionBean.getUser().getCollegeId());
		System.out.println(subjectList);
		request.setAttribute("subjectList", subjectList);
		RequestDispatcher rd  = request.getRequestDispatcher("post_grievance.jsp");
		rd.forward(request, response);
		}else
		{
			RequestDispatcher rd  = request.getRequestDispatcher("signin.jsp");
			rd.forward(request, response);
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
