package com.payment.test.services;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.payment.model.Account;
import com.payment.response.Response;
import com.payment.services.PaymentService;

@SpringBootTest
@ActiveProfiles("test")
public class ValidateAccountShould {

	@Autowired
	Response response;
	@Autowired
	PaymentService service;
	
	@Test
	public void ReturnMensageWhenCvvEqualsTo007() {
		
		Account account = new Account("4916585815127134", "007", "holiii");
		
		response = service.validateAccount(account);
		
		assertEquals(response.getStatus(),"cvv not valid");
	}
	
}
