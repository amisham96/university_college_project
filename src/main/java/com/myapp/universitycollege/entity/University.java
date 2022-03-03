package com.myapp.universitycollege.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_university")
public class University {

	public University() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "university_id")
	private int universityId;
	
	@Column(name = "university_name")
	private String universityName;
	
	@Column(name = "university_city")
	private String universityCity;
	
	@Column(name = "university_state")
	private String universityState;
	
	@Column(name = "university_zip")
	private String universityZip;
	
	@OneToMany(mappedBy = "university", fetch = FetchType.EAGER)
	private List<College> college;

	public University(int universityId, String universityName, String universityCity, String universityState,
			String universityZip, List<College> college) {
		super();
		this.universityId = universityId;
		this.universityName = universityName;
		this.universityCity = universityCity;
		this.universityState = universityState;
		this.universityZip = universityZip;
		this.college = college;
	}

	public int getUniversityId() {
		return universityId;
	}

	public void setUniversityId(int universityId) {
		this.universityId = universityId;
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

	public List<College> getCollege() {
		return college;
	}

	public void setCollege(List<College> college) {
		this.college = college;
	}

	@Override
	public String toString() {
		return "University [universityId=" + universityId + ", universityName=" + universityName + ", universityCity="
				+ universityCity + ", universityState=" + universityState + ", universityZip=" + universityZip
				+ ", college=" + college + "]";
	}

}
