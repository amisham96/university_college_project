package com.myapp.universitycollege.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.myapp.universitycollege.entity.College;
import com.myapp.universitycollege.exception.service.UniversityCollegeServiceException;

@Service
public interface CollegeService {
	
	College addNewCollege(College college);
	
	List<College> getAllCollege() throws UniversityCollegeServiceException;
	
	String deleteCollegeById(int collegeId);
	
	College updateExistingCollege(College college, int collegeId);
	
	College getCollegeById(int collegeId);
	
}
