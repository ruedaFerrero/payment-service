package com.payment.payment;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.spring.CucumberContextConfiguration;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\Usuario\\Documents\\LucaTIC\\Material\\Proyectos\\Proyecto3\\payment-service\\src\\test\\feature"
		,glue = {"com.payment.payment"})
@SpringBootTest(classes=annotation.class)
@CucumberContextConfiguration

public class TestRunner {

}
