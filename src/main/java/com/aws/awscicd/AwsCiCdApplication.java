package com.aws.awscicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
public class AwsCiCdApplication {
	@GetMapping("/getMessage")
	public String getMessage(){
		return "Hello World";

	}
	public static void main(String[] args) {
		SpringApplication.run(AwsCiCdApplication.class, args);
	}

}
