package com.example.model;

import java.io.Serializable;
/**
 * 
 * @author sohan.lal
 *
 */

public class CounterModel implements  Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -986467358006020926L;
	private String timestamp;
	private Integer calls;
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public Integer getCalls() {
		return calls;
	}
	public void setCalls(Integer calls) {
		this.calls = calls;
	}



}
