package com.secuity.Oauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OauthApplication {

	@GetMapping("/testing")
	public String testing(){
		return "testing";
	}
	@GetMapping("/yes")
	public String testing1(){
		return "yes it is done and it is working!!!!";

	public static void main(String[] args) {
		SpringApplication.run(OauthApplication.class, args);
	}



}
