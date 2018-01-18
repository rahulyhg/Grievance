package com.team.gs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.team.gs.beans.Admin;
import com.team.gs.beans.Student;
import com.team.gs.util.DBConnection;

public class StudentDao {
	
	public boolean insertStudent(Student s) {
		Connection conn;

		try {
			conn = DBConnection.getConnection();
			PreparedStatement ps = conn.prepareStatement("insert into student values(?,?,?,?,?,?,?,?,?)");
			ps.setInt(1, s.getEnrollmentId());
			ps.setString(2,s.getName());
			ps.setString(3, s.getEmail());
			ps.setLong(4, s.getContactNo());
			ps.setLong(5,s.getParentContact());
			ps.setString(6, s.getAddress());
			ps.setString(7, s.getProfilePic());
			ps.setInt(8, s.getCollegeId());
			ps.setInt(9, s.getBranchId());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

		return true;

	}



}
