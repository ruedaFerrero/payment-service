package com.payment.controller;

import com.payment.utils.Utils;
import com.payment.model.Account;
import com.payment.response.Response;
import lombok.extern.slf4j.Slf4j;
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
    @GetMapping("/")
    public ResponseEntity<Response> validatePayment(@Valid @RequestBody Account account, BindingResult result){
        log.info("Validating Account: {}", account);
        if(result.hasErrors()){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, Utils.formatBindingResult(result));
        }
        Response response = new Response();
        return ResponseEntity.ok(response);
    }


    @GetMapping("/version")
    public String getVersion() {
        return "1.0";
    }
}