package com.team.gs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.team.gs.beans.College;
import com.team.gs.beans.GrievanceSubject;
import com.team.gs.util.DBConnection;

public class GrievanceSubjectDao {
	
	boolean insertCollege(GrievanceSubject gs) {
		Connection conn;

		try {
			conn = DBConnection.getConnection();
			PreparedStatement ps = conn.prepareStatement("insert into m_grievances_subject values(?,?,?)");
			ps.setInt(1, gs.getId());
			ps.setString(2, gs.getName());
			ps.setInt(3, gs.getCollegeId());
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

		return true;

	}



}
