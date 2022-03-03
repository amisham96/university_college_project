package com.myapp.universitycollege.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myapp.universitycollege.entity.University;

@Repository
public interface UniversityRepository extends JpaRepository<University, Integer> {
	
	Optional<University> findByUniversityName(String existingUniversity);
	
}
