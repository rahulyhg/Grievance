package com.team.gs.util;

import com.team.gs.beans.Admin;
import com.team.gs.beans.Branch;
import com.team.gs.beans.College;
import com.team.gs.beans.Grievance;
import com.team.gs.beans.GrievanceChat;
import com.team.gs.beans.GrievanceSubject;
import com.team.gs.beans.Student;
import com.team.gs.beans.User;
import com.team.gs.dao.AdminDao;
import com.team.gs.dao.BranchDao;
import com.team.gs.dao.CollegeDao;
import com.team.gs.dao.GChatDao;
import com.team.gs.dao.GrievanceDao;
import com.team.gs.dao.GrievanceSubjectDao;
import com.team.gs.dao.StudentDao;
import com.team.gs.dao.UserDao;
import com.team.gs.util.*;

public class DaoTest {

	public static void main(String[] args) {
		
		
		User a=new User("aman.khullar5@gmail.com","aman","aman",'a',DateConversionUtil.dateToLong("06/07/1996"),3);
		UserDao sd=new UserDao();
		//sd.insertUser(a);
		//sd.findAll();
		//sd.findByEmail("aman.khullar297@gmail.com");
		//Grievance g=new Grievance(102, 1, "Aman", "aman", DateConversionUtil.dateToLong("06/07/1996"), 'a', 3, 102);
		//GrievanceDao gd=new GrievanceDao();
		GrievanceChat gc=new GrievanceChat(111, 122, "aman", "ved", 'a', DateConversionUtil.dateToLong("06/07/1997"), 3);
		GChatDao gd=new GChatDao();
		//System.out.println(gd.insertGrievanceChat(gc));
	gd.findAll();
	}
	

}
