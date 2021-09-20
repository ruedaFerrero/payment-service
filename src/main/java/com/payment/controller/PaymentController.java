package com.payment.controller;
import com.payment.services.PaymentService;
import com.payment.utils.Utils;
import com.payment.model.Account;
import com.payment.response.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;

@Slf4j
@RestController
public class PaymentController {
    @Autowired
    PaymentService service;

    @GetMapping("/")
    public ResponseEntity<Response> validatePayment(@Valid @RequestBody Account account, BindingResult result){
        log.info("Validating Account: {}", account);
        Response response = new Response();
        if(result.hasErrors()){
            response.setStatus("Bad request");
        }
        else {
            response = service.validateAccount(account);
            log.error("Holi22");

        }
        return ResponseEntity.ok(response);
    }
}
