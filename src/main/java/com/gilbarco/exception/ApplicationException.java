package com.gilbarco.exception;


/**
*
* @author sohan.lal
* 
*/

public class ApplicationException extends BaseException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1981935928489317130L;

	public ApplicationException() {
		// TODO Auto-generated constructor stub
	}
	
	public ApplicationException(Throwable rootCause) {
		super(rootCause);
	}
	
	public ApplicationException(ErrorCodes errorCode,Throwable rootCause) {
		super(rootCause);
	}
	public ApplicationException(ErrorCodes errorCode, String message) {
		super(errorCode, message);
	}

	public ApplicationException(ErrorCodes errorCode, String message, String[] dynamicValues) {
		super(errorCode, message, dynamicValues);
	}

}
