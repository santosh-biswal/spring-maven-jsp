package com.learning.springboot.springmavendemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.learning.springboot.springmavendemo.entity.ExchangeValue;
import com.learning.springboot.springmavendemo.jpa.ExchangeValueRepo;

@Controller
public class CurrencyServiceController {

	@Autowired
	private Environment env;
	
	@Autowired
	private ExchangeValueRepo repo;
	
	@GetMapping("/exchange-currency/from/{from}/to/{to}")
	public ResponseEntity<ExchangeValue> exchangeCurrency(@PathVariable String from,@PathVariable String to) {
		
		ExchangeValue ev=repo.findByFromAndTo(from, to);
		
		ev.setPort(Integer.parseInt(env.getProperty("local.server.port")));
		
		
		System.out.println(ev);
		
		ResponseEntity<ExchangeValue> respo=ResponseEntity.ok(ev);
		return respo;
	}
}
