package com.team.gs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.team.gs.beans.Admin;
import com.team.gs.util.DBConnection;

public class AdminDao {

	boolean insertAdmin(Admin a) {
		Connection conn;

		try {
			conn = DBConnection.getConnection();
			PreparedStatement ps = conn.prepareStatement("insert into admin values(?,?,?,?,?,?)");
			ps.setInt(1, a.getId());
			ps.setString(2, a.getName());
			ps.setString(3, a.getEmail());
			ps.setLong(4, a.getContactNo());
			ps.setInt(5,a.getCollegeId());
			ps.setString(6, a.getProfilePic());
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

		return true;

	}
	

}
