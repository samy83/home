package com.example.demo;


import org.slf4j.LoggerFactory;

@SuppressWarnings("serial")
public class AgeException extends RuntimeException { 
	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(AgeException.class);
	   
	public AgeException(String message) {
		super(message);
		logger.error(message);
	}

}
