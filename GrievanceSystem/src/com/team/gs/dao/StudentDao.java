package com.team.gs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.team.gs.beans.Admin;
import com.team.gs.beans.College;
import com.team.gs.beans.Student;
import com.team.gs.util.DBConnection;

public class StudentDao {

	public boolean insertStudent(Student s) {
		Connection conn;

		try {
			conn = DBConnection.getConnection();
			PreparedStatement ps = conn.prepareStatement("insert into student values(?,?,?,?,?,?,?,?,?,?)");
			ps.setInt(1, s.getEnrollmentId());
			ps.setString(2, s.getName());
			ps.setString(3, s.getEmail());
			ps.setLong(4, s.getContactNo());
			ps.setLong(5, s.getParentContact());
			ps.setString(6, s.getAddress());
			ps.setString(7, s.getProfilePic());
			ps.setInt(8, s.getCollegeId());
			ps.setInt(9, s.getBranchId());
			ps.setString(10, s.getStatus() + "");
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

		return true;

	}

	public List<Student> findAll() {
		Connection conn;
		ResultSet rs = null;
		List<Student> listStudent = new ArrayList<Student>();

		try {
			conn = DBConnection.getConnection();
			PreparedStatement ps = conn.prepareStatement("select * from student");
			rs = ps.executeQuery();

			while (rs.next()) {
				Student c = new Student(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getLong(4), rs.getLong(5),
						rs.getString(6), rs.getString(7), rs.getInt(8), rs.getInt(9));
				System.out.println(c);
				listStudent.add(c);

			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

		return listStudent;

	}

	public List<Student> findById(Integer id) {
		Connection conn;
		ResultSet rs = null;
		List<Student> listStudent = new ArrayList<Student>();

		try {
			conn = DBConnection.getConnection();
			PreparedStatement ps = conn.prepareStatement("select * from student where enroll_id=?");
			ps.setInt(1, id);
			rs = ps.executeQuery();

			while (rs.next()) {
				Student c = new Student(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getLong(4), rs.getLong(5),
						rs.getString(6), rs.getString(7), rs.getInt(8), rs.getInt(9));
				c.setStatus(rs.getString(10).charAt(0));
				System.out.println(c);
				listStudent.add(c);

			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

		return listStudent;

	}

	public List<Student> findAll(String status,int college_id) {
		Connection conn;
		ResultSet rs = null;
		List<Student> listStudent = new ArrayList<Student>();

		try {
			conn = DBConnection.getConnection();
			PreparedStatement ps = conn.prepareStatement("select * from student where status =? AND college_id= ?");
			ps.setString(1, status);
			ps.setInt(2, college_id);
			rs = ps.executeQuery();

			while (rs.next()) {
				Student c = new Student(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getLong(4), rs.getLong(5),
				rs.getString(6), rs.getString(7), rs.getInt(8), rs.getInt(9));
				System.out.println(c);
				c.setStatus(rs.getString(10).charAt(0));
				listStudent.add(c);

			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

		return listStudent;

	}

}
