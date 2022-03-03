package com.myapp.universitycollege.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.myapp.universitycollege.entity.University;
import com.myapp.universitycollege.exception.custom.NoUniversityPresentException;
import com.myapp.universitycollege.exception.service.UniversityCollegeServiceException;

@Service
public interface UniversityService {
	
	University addNewUniversity(University university) throws UniversityCollegeServiceException;
	
	List<University> getAllUniversity() throws NoUniversityPresentException;
	
	void deleteUniversityById(int universityId);
	
	University getUniversityById(int universityId);

	University updateExistingUniversity(University university, int universityId);
	
}
