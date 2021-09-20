package com.payment.controller;

import com.payment.model.Account;
import com.payment.services.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;

@Slf4j
@RestController
@RequestMapping("/")
class paymentController {
    @Autowired
    private PaymentService serviceLayer;

    public ResponseEntity<Response> validatePayment(@Valid @RequestBody Account account, BindingResult result){
        log.info("Validating Account: {}", account);
        if(result.hasErrors()){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "");
        }
        Response response = serviceLayer.validate(account);
        return ResponseEntity.ok(response);
    }
}
