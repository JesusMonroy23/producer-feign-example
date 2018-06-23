package com.producer;

import java.util.Date;

// Respuesta que envia cuando se proudce una excepcion
public class ExceptionResponse {
	private Date date;
	private String message;
	private String moreInfo;
	
	public ExceptionResponse(Date date, String message, String moreInfo) {
		super();
		this.date = date;
		this.message = message;
		this.moreInfo = moreInfo;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMoreInfo() {
		return moreInfo;
	}

	public void setMoreInfo(String moreInfo) {
		this.moreInfo = moreInfo;
	}
	
	
	
	

}
