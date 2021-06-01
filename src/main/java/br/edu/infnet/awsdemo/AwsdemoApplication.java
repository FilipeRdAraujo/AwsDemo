package br.edu.infnet.awsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class AwsdemoApplication extends SpringBootServletInitializer {
	public static void main(String[] args) {
		SpringApplication.run(AwsdemoApplication.class, args);
	}

}
