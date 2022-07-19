package com.pulsa.payment.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pulsa.payment.dto.PaymentRequestDto;
import com.pulsa.payment.dto.PaymentResponseDto;
import com.pulsa.payment.service.PaymentService;

@RestController
public class PaymentController {

	@Autowired
	PaymentService paymentService;
	
	@PostMapping("/xl/payment")
	public ResponseEntity<PaymentResponseDto> xlPayment(@Valid @RequestBody PaymentRequestDto paymentRequestDto){
		return paymentService.xlPayment(paymentRequestDto);
	}
	
	@PostMapping("/telkomsel/payment")
	public ResponseEntity<PaymentResponseDto> telkomselPayment(@Valid @RequestBody PaymentRequestDto paymentRequestDto){
		return paymentService.telkomselPayment(paymentRequestDto);
	}
}
