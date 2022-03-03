package com.myapp.universitycollege.dto;

import javax.validation.constraints.NotNull;

public class CollegeDTO {

	public CollegeDTO() {
		// TODO Auto-generated constructor stub
	}
	
	@NotNull
	private String collegeName;
	
	@NotNull
	private int totalStudents;

	public CollegeDTO(@NotNull String collegeName, @NotNull int totalStudents) {
		super();
		this.collegeName = collegeName;
		this.totalStudents = totalStudents;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public int getTotalStudents() {
		return totalStudents;
	}

	public void setTotalStudents(int totalStudents) {
		this.totalStudents = totalStudents;
	}

}
