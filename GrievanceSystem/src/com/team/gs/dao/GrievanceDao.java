package com.team.gs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.team.gs.beans.College;
import com.team.gs.beans.Grievance;
import com.team.gs.util.DBConnection;
import java.util.Date;

public class GrievanceDao {
	
	boolean insertCollege(Grievance g) {
		Connection conn;

		try {
			conn = DBConnection.getConnection();
			PreparedStatement ps = conn.prepareStatement("insert into grievance values(?,?,?,?,?,?,?,?)");
			ps.setInt(1, g.getId());
			ps.setInt(2, g.getSubjectId());
			ps.setString(3, g.getDescription());
			ps.setString(4, g.getFile());
			Date d=g.getDate();
			String s=d.toString();
			ps.setString(5, s);
			ps.setString(6, " "+g.getStatus());
			ps.setInt(7, g.getCollegeId());
			ps.setInt(8, g.getSubjectId());
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

		return true;

	}

	

}
