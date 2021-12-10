package com.example.electric;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.example.electric.config.AppConfig;

@SpringBootApplication
@Import(AppConfig.class)
public class ElocatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElocatorApplication.class, args);
	}

}
