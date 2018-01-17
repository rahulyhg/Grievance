package com.team.gs.beans;

import java.util.Date;

public class Grievance {
	Integer id;
	Integer subjectId;
	String description;
	String file;
	Date date;
	Character status;
	Integer collegeId;
	Integer studentId;
	public Grievance(Integer id, Integer subjectId, String description, String file, Date date, Character status,
			Integer collegeId, Integer studentId) {
		super();
		this.id = id;
		this.subjectId = subjectId;
		this.description = description;
		this.file = file;
		this.date = date;
		this.status = status;
		this.collegeId = collegeId;
		this.studentId = studentId;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(Integer subjectId) {
		this.subjectId = subjectId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Character getStatus() {
		return status;
	}
	public void setStatus(Character status) {
		this.status = status;
	}
	public Integer getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(Integer collegeId) {
		this.collegeId = collegeId;
	}
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	@Override
	public String toString() {
		return "Grievance [id=" + id + ", subjectId=" + subjectId + ", description=" + description + ", file=" + file
				+ ", date=" + date + ", status=" + status + ", collegeId=" + collegeId + ", studentId=" + studentId
				+ "]";
	}

}
