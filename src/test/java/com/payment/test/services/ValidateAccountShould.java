package com.payment.test.services;

import static org.junit.Assert.assertEquals;

import com.payment.services.PaymentServiceImp;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.payment.model.Account;
import com.payment.response.Response;
import com.payment.services.PaymentService;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@ActiveProfiles("test")
@RunWith(SpringRunner.class)
public class ValidateAccountShould {
	Response response;
	@Autowired
	private PaymentService service;
	
	@Test
	public void ReturnMensageWhenCvvEqualsTo007() {
		Account account = new Account("4916585815127134", "007", "holiii");
		response = service.validateAccount(account);
		assertEquals(response.getStatus(),"cvv not valid");
	}
}
