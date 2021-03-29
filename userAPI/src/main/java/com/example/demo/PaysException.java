package com.example.demo;

import org.slf4j.LoggerFactory;

@SuppressWarnings("serial")
public class PaysException extends RuntimeException {
	
	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(PaysException.class);
	   
	public PaysException(String message) {
		super(message);
		logger.error(message);
	}
}
