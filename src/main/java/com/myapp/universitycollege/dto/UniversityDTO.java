package com.myapp.universitycollege.dto;

import javax.validation.constraints.NotNull;

public class UniversityDTO {

	public UniversityDTO() {
		// TODO Auto-generated constructor stub
	}
	
	@NotNull
	private String universityName;
	
	@NotNull
	private String universityCity;
	
	@NotNull
	private String universityState;
	
	@NotNull
	private String universityZip;

	public UniversityDTO(@NotNull String universityName, @NotNull String universityCity,
			@NotNull String universityState, @NotNull String universityZip) {
		super();
		this.universityName = universityName;
		this.universityCity = universityCity;
		this.universityState = universityState;
		this.universityZip = universityZip;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public String getUniversityCity() {
		return universityCity;
	}

	public void setUniversityCity(String universityCity) {
		this.universityCity = universityCity;
	}

	public String getUniversityState() {
		return universityState;
	}

	public void setUniversityState(String universityState) {
		this.universityState = universityState;
	}

	public String getUniversityZip() {
		return universityZip;
	}

	public void setUniversityZip(String universityZip) {
		this.universityZip = universityZip;
	}


}
