package com.payment.test.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import com.payment.controller.PaymentController;
import com.payment.model.Account;
import com.payment.response.Response;
import com.payment.services.PaymentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

@SpringBootTest
@ActiveProfiles("test")
@RunWith(SpringRunner.class)
public class ValidateAccountShould {
    ResponseEntity<Response> response;
    @Autowired
    private PaymentController paymentController;

    @Mock
    BindingResult a;

    @Test
    public void Return() {
        Account account = new Account("", "656", "holiii");
        
        BindingResult bindingResult = new BeanPropertyBindingResult(account, "objectName");
        response = paymentController.validatePayment(account, bindingResult);
        assertEquals(response.getStatusCode(), HttpStatus.OK);
        assertEquals(response.getBody().getStatus(), "Bad request");
    }
}

