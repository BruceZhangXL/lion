package org.lion.domain;

import java.io.Serializable;
import java.util.Date;

public class HelloDomain implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1610371568560384798L;
	
	private String name;
	
	private String message;
	
	private Date rightTime;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getRightTime() {
		return rightTime;
	}

	public void setRightTime(Date rightTime) {
		this.rightTime = rightTime;
	}
	
	
}
