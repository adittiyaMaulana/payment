package com.pulsa.payment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.pulsa.payment.dto.PaymentRequestDto;
import com.pulsa.payment.dto.PaymentResponseDto;
import com.pulsa.payment.entity.Provider;
import com.pulsa.payment.repository.ProviderRepository;

@Service
public class PaymentService {

	@Autowired
	ProviderRepository providerRepository;
	
	public ResponseEntity<PaymentResponseDto> xlPayment(PaymentRequestDto paymentRequestDto){
		
		Provider provider = new Provider();
		if (paymentRequestDto.getProduct().equals("10k")) {
			provider.setProduct("10k");
			provider.setPrice(11000);
		}else if (paymentRequestDto.getProduct().equals("20k")) {
			provider.setProduct("20k");
			provider.setPrice(21000);
		}else if (paymentRequestDto.getProduct().equals("25k")) {
			provider.setProduct("25k");
			provider.setPrice(27000);
		}else if (paymentRequestDto.getProduct().equals("50k")) {
			provider.setProduct("50k");
			provider.setPrice(51000);
		}else if (paymentRequestDto.getProduct().equals("100k")) {
			provider.setProduct("100k");
			provider.setPrice(110000);
		}else {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		provider.setPhoneNumber(paymentRequestDto.getPhoneNumber());
		provider.setProvider("XL");
		providerRepository.save(provider);
		
		PaymentResponseDto paymentResponseDto = new PaymentResponseDto();
		paymentResponseDto.setProduct(provider.getProduct());
		paymentResponseDto.setPrice(provider.getPrice());
		
		return new ResponseEntity<>(paymentResponseDto, HttpStatus.OK);
	}
	
	public ResponseEntity<PaymentResponseDto> telkomselPayment(PaymentRequestDto paymentRequestDto){
		
		Provider provider = new Provider();
		if (paymentRequestDto.getProduct().equals("10k")) {
			provider.setProduct("10k");
			provider.setPrice(11000);
		}else if (paymentRequestDto.getProduct().equals("20k")) {
			provider.setProduct("20k");
			provider.setPrice(21000);
		}else if (paymentRequestDto.getProduct().equals("25k")) {
			provider.setProduct("25k");
			provider.setPrice(27000);
		}else if (paymentRequestDto.getProduct().equals("50k")) {
			provider.setProduct("50k");
			provider.setPrice(51000);
		}else if (paymentRequestDto.getProduct().equals("100k")) {
			provider.setProduct("100k");
			provider.setPrice(110000);
		}else {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		provider.setPhoneNumber(paymentRequestDto.getPhoneNumber());
		provider.setProvider("Telkomsel");
		providerRepository.save(provider);
		
		PaymentResponseDto paymentResponseDto = new PaymentResponseDto();
		paymentResponseDto.setProduct(provider.getProduct());
		paymentResponseDto.setPrice(provider.getPrice());
		
		return new ResponseEntity<>(paymentResponseDto, HttpStatus.OK);
	}
}
