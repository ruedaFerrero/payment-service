package com.payment.response;

import java.io.Serializable;

import lombok.Data;

@Data
public class Response implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String status;

	
}
