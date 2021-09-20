package com.payment.services;

import com.payment.model.Account;
import com.payment.response.Response;

public interface PaymentService {
    public Response validateAccount(Account account);
}
