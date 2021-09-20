package com.payment.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.CreditCardNumber;

import lombok.Data;

@Data
public class Account {
	
	@CreditCardNumber(ignoreNonDigitCharacters = true)
	@NotNull
	private String number;
	@Size(min=3, max=3)
	@NotNull
	private String ccv;
	@NotNull
	private String titular;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(String number, String ccv, String titular) {
		super();
		this.number = number;
		this.ccv = ccv;
		this.titular = titular;
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Account [number=");
		builder.append(number);
		builder.append(", ccv=");
		builder.append(ccv);
		builder.append(", titular=");
		builder.append(titular);
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
