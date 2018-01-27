package com.team.gs.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.team.gs.beans.Student;
import com.team.gs.dao.StudentDao;


/**
 * Servlet implementation class RegisterStudent
 */
@WebServlet("/RegisterStudent")

public class RegisterStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String enrollmentID = request.getParameter("Enrollment-ID");
		String name = request.getParameter("namesurname");
		String email = request.getParameter("email");
		String contactNo = request.getParameter("contactNo");
		String parentContactNo = request.getParameter("parentcontactNO");
		String address = request.getParameter("address");
		String collegeID = request.getParameter("collegeId");
		String branchID = request.getParameter("branchId");
		
		/*System.out.println(enrollmentID);
		System.out.println(name);
		System.out.println(email);
		System.out.println(contactNo);
		System.out.println(parentContactNo);
		System.out.println(address);
		System.out.println(collegeID);
		System.out.println(branchID);*/
		Student s=new Student(Integer.parseInt(enrollmentID), name, email,Long.parseLong(contactNo) , Long.parseLong(parentContactNo), address, "aman.jpj", Integer.parseInt(collegeID),Integer.parseInt(branchID) );
		//System.out.println(s);
		StudentDao sd=new StudentDao();
		sd.insertStudent(s);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
}
