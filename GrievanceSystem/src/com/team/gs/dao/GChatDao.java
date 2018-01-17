package com.team.gs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Date;

import com.team.gs.beans.Grievance;
import com.team.gs.beans.GrievanceChat;
import com.team.gs.util.DBConnection;

public class GChatDao {
	
	boolean insertCollege(GrievanceChat gc) {
		Connection conn;

		try {
			conn = DBConnection.getConnection();
			PreparedStatement ps = conn.prepareStatement("insert into gchat values(?,?,?,?,?,?,?)");
			ps.setInt(1, gc.getId());
			ps.setInt(2, gc.getGrievanceId());
			ps.setString(3, gc.getFile());
			ps.setString(4, gc.getChat());
			ps.setString(5, " "+gc.getRole());
			Date d=gc.getDate();
			String s=d.toString();
			ps.setString(6, s);
			ps.setInt(7, gc.getCollegeId());
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

		return true;

	}

	

}
