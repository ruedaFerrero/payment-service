package com.payment.services;

import com.payment.model.Account;

public interface PaymentService {
	
	public Response validate(Account account);

}
