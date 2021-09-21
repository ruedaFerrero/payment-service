package com.payment.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.CreditCardNumber;

import lombok.Data;

@Data
public class Account {
	
	@CreditCardNumber(ignoreNonDigitCharacters = true)
	@NotNull
	private String creditCard;
	@Size(min=3, max=3)
	@NotNull
	private String cvv;
	@Size(min=1)
	@NotNull
	private String creditCardOwner;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(String creditCard, String cvv, String creditCardOwner) {
		super();
		this.creditCard = creditCard;
		this.cvv = cvv;
		this.creditCardOwner = creditCardOwner;
	}

	public String getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCcv(String cvv) {
		this.cvv = cvv;
	}

	public String getCreditCardOwner() {
		return creditCardOwner;
	}

	public void setCreditCardOwner(String creditCardOwner) {
		this.creditCardOwner = creditCardOwner;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Account [creditCard=");
		builder.append(creditCard);
		builder.append(", cvv=");
		builder.append(cvv);
		builder.append(", creditCardOwnerr=");
		builder.append(creditCardOwner);
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
