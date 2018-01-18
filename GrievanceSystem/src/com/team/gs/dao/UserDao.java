package com.team.gs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Date;

import com.team.gs.beans.GrievanceChat;
import com.team.gs.beans.User;
import com.team.gs.util.DBConnection;

public class UserDao {

	boolean insertUser(User u) {
		Connection conn;

		try {
			conn = DBConnection.getConnection();
			PreparedStatement ps = conn.prepareStatement("insert into user values(?,?,?,?,?)");
			ps.setString(1, u.getEmail());
			ps.setString(2, u.getPassword());
			ps.setString(3, ""+u.getRole());
			Date d=u.getLastScreen();
			String s=d.toString();
			ps.setString(4, s);
			ps.setInt(5,u.getCollegeId());
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

		return true;

	}


}
