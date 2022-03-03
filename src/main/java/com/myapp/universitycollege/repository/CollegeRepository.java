package com.myapp.universitycollege.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myapp.universitycollege.entity.College;

@Repository
public interface CollegeRepository extends JpaRepository<College, Integer> {
	
}
