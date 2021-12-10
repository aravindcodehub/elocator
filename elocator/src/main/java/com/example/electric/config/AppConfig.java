package com.example.electric.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.electric.model.City;



@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.example.electric"})
public class AppConfig {

	@Bean(name="city")
	public City createState() {
		return new City();
	}
	
}
