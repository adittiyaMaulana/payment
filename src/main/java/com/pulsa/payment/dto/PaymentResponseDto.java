package com.pulsa.payment.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaymentResponseDto {
	
	private String phoneNumber;
	
	private String provider;
	
	private String product;
	
	private int price;
}
