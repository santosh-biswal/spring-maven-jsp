package com.learning.springboot.springmavendemo.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.springboot.springmavendemo.entity.ExchangeValue;

@Repository
public interface ExchangeValueRepo extends JpaRepository<ExchangeValue, Long>{

	
	ExchangeValue findByFromAndTo(String from,String to);
}
