package com.pati.spring2704webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Spring2704webappApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring2704webappApplication.class, args);
	}
	@GetMapping("/message")
	public String getMessage(){
		return "Hello Sourav.!!";
	}

}
