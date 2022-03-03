package com.myapp.universitycollege.exception.custom;

import com.myapp.universitycollege.exception.service.UniversityCollegeServiceException;

public class NoUniversityPresentException extends UniversityCollegeServiceException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NoUniversityPresentException() {
		// TODO Auto-generated constructor stub
	}

	public NoUniversityPresentException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public NoUniversityPresentException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public NoUniversityPresentException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public NoUniversityPresentException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
