package com.myapp.universitycollege.exception.custom;

import com.myapp.universitycollege.exception.service.UniversityCollegeServiceException;

public class UniversityAlreadyExistException extends UniversityCollegeServiceException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UniversityAlreadyExistException() {
		// TODO Auto-generated constructor stub
	}

	public UniversityAlreadyExistException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public UniversityAlreadyExistException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public UniversityAlreadyExistException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public UniversityAlreadyExistException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
