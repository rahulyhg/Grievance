package com.team.gs.util;

import com.team.gs.beans.College;
import com.team.gs.dao.CollegeDao;

public class DaoTest {

	public static void main(String[] args) {
CollegeDao cd = new  CollegeDao();
cd.findAll();

/*Long a=8989468996L;
College c=new College(3,"Aman","C-41","amankhullar297@gmail.com",a);
Boolean b=cd.insertCollege(c);
System.out.println(b);*/
	}

}
