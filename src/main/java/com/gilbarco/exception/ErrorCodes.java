package com.gilbarco.exception;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;



/**
*
* @author sohan.lal
* 
*/

public class ErrorCodes implements Serializable {
	


	/**
	 * 
	 */
	private static final long serialVersionUID = -3668483154404922276L;
	
	
	public static final ErrorCodes DUMMY_ERROR_CODE =  new ErrorCodes(-2);
	
	
	private Long errorCode =  new Long(-1);
	public List<String> parameters = new ArrayList<String>();
	public String detailMessage;
	public ErrorCodes(){}
	
	public ErrorCodes(long errorCode) {
		this.errorCode = new Long(errorCode);
	}
	
		
	public Long getErrorCode() {
		return this.errorCode;
	}
	public void setErrorCode(Long errorCode) {
		this.errorCode = errorCode;
	}

	public List<String> getParameters() {
		return parameters;
	}

	public void setParameters(List<String> parameters) {
		this.parameters = parameters;
	}

	public String getDetailMessage() {
		return detailMessage;
	}

	public void setDetailMessage(String detailMessage) {
		this.detailMessage = detailMessage;
	}
	
}
