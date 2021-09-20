package com.payment.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.payment.model.Account;
import com.payment.response.AccountResponse;

public class PaymentServiceImp implements PaymentService{

	@Autowired
	private Response response;
	
	@Override
	public Response validate(Account account) {
		
		return response;
	}

}
