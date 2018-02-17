package com.team.gs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.team.gs.beans.College;
import com.team.gs.beans.Grievance;
import com.team.gs.beans.User;
import com.team.gs.util.DBConnection;
import com.team.gs.util.DateConversionUtil;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GrievanceDao {
	
	public boolean insertGrievance(Grievance g) {
		Connection conn;

		try {
			conn = DBConnection.getConnection();
			PreparedStatement ps = conn.prepareStatement("insert into grievance(subject_id,description,file,date,status,college_id,student_id) values(?,?,?,?,?,?,?)");
			ps.setInt(1, g.getSubjectId());
			ps.setString(2, g.getDescription());
			ps.setString(3, g.getFile());
			ps.setString(4, ""+g.getDate());
			ps.setString(5, ""+g.getStatus());
			ps.setInt(6, g.getCollegeId());
			ps.setInt(7, g.getStudentId());
			ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

		return true;

	}

	public List<Grievance>  findAll() {
		Connection conn;
		ResultSet rs= null;
		List<Grievance> listGrievance=new ArrayList<Grievance>();

		try {
			conn = DBConnection.getConnection();
			PreparedStatement ps = conn.prepareStatement("select * from grievance");
			rs= ps.executeQuery();
			
while(rs.next())	
{
	Grievance c = new Grievance(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),DateConversionUtil.dateToLong("rs.getLong(5)"),rs.getString(6).charAt(0),rs.getInt(7),rs.getInt(8));
	System.out.println(c);
	listGrievance.add(c);
     
}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

		return listGrievance;

	}
	
	public Grievance  findById(Integer id) {
		Connection conn;
		ResultSet rs= null;
		Grievance c=null;
		

		try {
			conn = DBConnection.getConnection();
			PreparedStatement ps = conn.prepareStatement("select * from grievance where id=?");
			ps.setInt(1, id);
			rs= ps.executeQuery();
			
if(rs.next())	
{
	 c = new Grievance(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),DateConversionUtil.dateToLong("rs.getLong(5)"),rs.getString(6).charAt(0),rs.getInt(7),rs.getInt(8));
	System.out.println(c);
	
     
}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

		return c;

	}

}
