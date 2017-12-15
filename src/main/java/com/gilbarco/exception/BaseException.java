package com.gilbarco.exception;


import java.util.Arrays;

public class BaseException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3324046943497485477L;
	/**
	 * 
	 */
	
	private ErrorCodes errorCode;
	private String message;
	private String[] dynamicValues;
	
	public BaseException() {
		// TODO Auto-generated constructor stub
	}
	
	public BaseException(ErrorCodes errorCode,Throwable rootCause) {
		super(rootCause);
		this.errorCode = errorCode;
	}
	
	public BaseException(Throwable rootCause) {
		super(rootCause);
	}
	
	public BaseException(ErrorCodes errorCode, String message) {
		this.message = message;
		ErrorCodes ec = new ErrorCodes(errorCode.getErrorCode().longValue());
		ec.parameters = errorCode.parameters;
		ec.detailMessage=message;
		this.errorCode = ec;
	}

	public BaseException(ErrorCodes errorCode, String message, String[] dynamicValues) {
		ErrorCodes ec = new ErrorCodes(errorCode.getErrorCode().longValue());
		ec.detailMessage=message;
		ec.parameters = Arrays.asList(dynamicValues);
		this.errorCode = ec;
		this.message = message;
		this.dynamicValues = dynamicValues;
	}
	
	public ErrorCodes getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(ErrorCodes errorCode) {
		this.errorCode = errorCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public String[] getDynamicValues() {
		return dynamicValues;
	}

	public void setDynamicValues(String[] dynamicValues) {
		this.dynamicValues = dynamicValues;
	}
}
