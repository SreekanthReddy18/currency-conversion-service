package com.srikanth.microservices.currencyconversionservice;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.srikanth.microservices.currencyconversionservice.bean.CurrencyConversionBean;

@RestController
public class CurrencyConversionController {

	@GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean convertConversion(@PathVariable String from, 
			@PathVariable String to, @PathVariable BigDecimal quantity) {
		return new CurrencyConversionBean(1000L, from, to, BigDecimal.ONE, quantity,quantity, 100);
	}
}
