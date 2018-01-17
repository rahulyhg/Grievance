package com.team.gs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.team.gs.beans.Branch;
import com.team.gs.util.DBConnection;

public class BranchDao {
	
	boolean insertCollege(Branch b) {
		Connection conn;

		try {
			conn = DBConnection.getConnection();
			PreparedStatement ps = conn.prepareStatement("insert into m_branch values(?,?,?)");
			ps.setInt(1, b.getId());
			ps.setString(2, b.getName());
			ps.setInt(3, b.getCollegeId());
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

		return true;

	}


}
