package com;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
 
@SpringBootApplication(scanBasePackages = { "com.controller", "com.model", "com.service" })
public class TmsApplication {
 
	public static void main(String[] args) {
		SpringApplication.run(TmsApplication.class, args);
	}
 
}