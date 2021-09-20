package com.payment.response;

import java.io.Serializable;

import com.payment.model.Account;

//Trabaja de DTO
public class AccountResponse implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String number;
	private String ccv;
	private String titular;
	
	public static AccountResponse of(Account account) {
		AccountResponse accountResponse = new AccountResponse();
		
		accountResponse.setNumber(account.getNumber());
		accountResponse.setCcv(account.getCcv());
		accountResponse.setTitular(account.getTitular());
		
		return accountResponse;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getCcv() {
		return ccv;
	}

	public void setCcv(String ccv) {
		this.ccv = ccv;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	
	
	
}
