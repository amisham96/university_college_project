package com.myapp.universitycollege.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myapp.universitycollege.entity.College;
import com.myapp.universitycollege.exception.custom.NoCollegeRecordPresentException;
import com.myapp.universitycollege.exception.service.UniversityCollegeServiceException;
import com.myapp.universitycollege.repository.CollegeRepository;
import com.myapp.universitycollege.service.CollegeService;

@Service
public class CollegeServiceImpl implements CollegeService {
	
	@Autowired
	CollegeRepository collegeRepository;

	@Override
	public College addNewCollege(College college) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<College> getAllCollege() throws UniversityCollegeServiceException {
		// TODO Auto-generated method stub
		if(collegeRepository.findAll().isEmpty()) {
			throw new NoCollegeRecordPresentException("No College Record Found in Database");
		}
		return collegeRepository.findAll();
	}

	@Override
	public String deleteCollegeById(int collegeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public College updateExistingCollege(College college, int collegeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public College getCollegeById(int collegeId) {
		// TODO Auto-generated method stub
		return null;
	}

}
