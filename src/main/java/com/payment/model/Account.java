package com.payment.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.CreditCardNumber;

import lombok.Data;

@Data
public class Account {
	
	@CreditCardNumber
	@NotNull
	private String number;
	@Size(min=3, max=3)
	@NotNull
	private String cvv;
	@NotNull
	private String titular;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(String number, String cvv, String titular) {
		super();
		this.number = number;
		this.cvv = cvv;
		this.titular = titular;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCcv(String cvv) {
		this.cvv = cvv;
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
		builder.append(", cvv=");
		builder.append(cvv);
		builder.append(", titular=");
		builder.append(titular);
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
