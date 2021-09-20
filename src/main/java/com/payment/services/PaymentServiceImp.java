package com.payment.services;

import org.springframework.stereotype.Service;

import com.payment.model.Account;
import com.payment.response.Response;

@Service
public class PaymentServiceImp implements PaymentService{
	
	@Override
	public Response validateAccount(Account account) {
		
		Response response = new Response();
		
		if (account.getCvv().equals("007"))
			response.setStatus("cvv not valid");
		else if (account.getNumber().startsWith("4"))
			response.setStatus("Credit card number not valid");
		else if (account.getTitular().startsWith("E"))
			response.setStatus("Titular not valid");
		else
			response.setStatus("Valid account");
					
		return response;
	}
	
	

}
