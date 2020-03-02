package com.learning.springboot.springmavendemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.learning.springboot.springmavendemo.entity.ExchangeValue;
import com.learning.springboot.springmavendemo.jpa.ExchangeValueRepo;

@Controller
public class ExchnageCurrencyViewController {

	
	@Autowired
	private Environment env;
	
	@Autowired
	private ExchangeValueRepo repo;
	
	
	
	
	@RequestMapping("/exchange-currency/from/to.htm")
	public ModelAndView getExchangeValue(@RequestParam String from,@RequestParam String to) {
		
		
		ExchangeValue ev=repo.findByFromAndTo(from, to);
		
		ev.setPort(Integer.parseInt(env.getProperty("server.port")));
		
		
		System.out.println(ev);
		
		
		
		ModelAndView mav=new ModelAndView();
		mav.setViewName("show-currency");
		mav.addObject("ev",ev);
		return mav;
		
	}
}
