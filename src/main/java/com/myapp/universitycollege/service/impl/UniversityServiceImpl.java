package com.myapp.universitycollege.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myapp.universitycollege.entity.University;
import com.myapp.universitycollege.exception.custom.NoUniversityPresentException;
import com.myapp.universitycollege.exception.custom.UniversityAlreadyExistException;
import com.myapp.universitycollege.exception.service.UniversityCollegeServiceException;
import com.myapp.universitycollege.repository.UniversityRepository;
import com.myapp.universitycollege.service.UniversityService;

@Service
public class UniversityServiceImpl implements UniversityService {
	
	@Autowired
	UniversityRepository universityRepository;

	@Override
	public University addNewUniversity(University university) throws UniversityCollegeServiceException {
		// TODO Auto-generated method stub
		if(universityRepository.findByUniversityName(university.getUniversityName()).isPresent()) {
			throw new UniversityAlreadyExistException("University By This Name Already Present");
		}
		return universityRepository.save(university);
	}

	@Override
	public List<University> getAllUniversity() throws NoUniversityPresentException {
		// TODO Auto-generated method stub
		if(universityRepository.findAll().isEmpty()) {
			throw new NoUniversityPresentException("No University Present in the Database");
		}
		return universityRepository.findAll();
	}

	@Override
	public void deleteUniversityById(int universityId) {
		// TODO Auto-generated method stub
		universityRepository.deleteById(universityId);
	}

	@Override
	public University updateExistingUniversity(University university, int universityId) {
		// TODO Auto-generated method stub
		University presentUniversity = universityRepository.findById(universityId).get();
		presentUniversity.setUniversityName(university.getUniversityName());
		presentUniversity.setUniversityCity(university.getUniversityCity());
		presentUniversity.setUniversityState(university.getUniversityState());
		presentUniversity.setUniversityZip(university.getUniversityZip());
		return universityRepository.save(presentUniversity);
	}

	@Override
	public University getUniversityById(int universityId) {
		// TODO Auto-generated method stub
		return universityRepository.findById(universityId).get();
	}

}
