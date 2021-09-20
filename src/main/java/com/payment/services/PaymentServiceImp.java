package com.payment.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.payment.model.Account;

public class PaymentServiceImp implements PaymentService{

	@Autowired
	private Response response;
	
	@Override
	public Reponse validate(Account account) {
		
		return response;
	}

}
