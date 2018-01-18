package com.team.gs.util;

import com.team.gs.beans.College;
import com.team.gs.beans.Student;
import com.team.gs.dao.CollegeDao;
import com.team.gs.dao.StudentDao;

public class DaoTest {

	public static void main(String[] args) {
		Long a=8989468996L;
		Long b=8989468996L;
		Student s=new Student(101,"aman","aman.khullar297@gmail.com",a,b,"C-41","aman.jpj",1,1);
		StudentDao sd=new StudentDao();
		System.out.println(sd.insertStudent(s));

/*Long a=8989468996L;
College c=new College(3,"Aman","C-41","amankhullar297@gmail.com",a);
Boolean b=cd.insertCollege(c);
System.out.println(b);*/
	}

}
