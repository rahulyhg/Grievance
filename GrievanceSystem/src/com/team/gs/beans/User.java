package com.team.gs.beans;

import java.util.Date;

public class User {
	String email;
	String password;
	Character role;
	Date lastScreen;
	Integer collegeId;
	public User(String email, String password, Character role, Date lastScreen, Integer collegeId) {
		super();
		this.email = email;
		this.password = password;
		this.role = role;
		this.lastScreen = lastScreen;
		this.collegeId = collegeId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Character getRole() {
		return role;
	}
	public void setRole(Character role) {
		this.role = role;
	}
	public Date getLastScreen() {
		return lastScreen;
	}
	public void setLastScreen(Date lastScreen) {
		this.lastScreen = lastScreen;
	}
	public Integer getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(Integer collegeId) {
		this.collegeId = collegeId;
	}
	@Override
	public String toString() {
		return "User [email=" + email + ", password=" + password + ", role=" + role + ", lastScreen=" + lastScreen
				+ ", collegeId=" + collegeId + "]";
	}
	

}
