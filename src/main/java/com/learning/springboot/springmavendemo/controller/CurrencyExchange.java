package com.learning.springboot.springmavendemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CurrencyExchange{

	
	@RequestMapping("/currency-exchange.htm")
	public String get() {
		
		return "currency-exchange";
	}
	
	
	@RequestMapping("/success.htm")
	public String getsuccess() {
		
		return "success";
	}
	
	
}
