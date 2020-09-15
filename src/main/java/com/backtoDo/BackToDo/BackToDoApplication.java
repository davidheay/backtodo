package com.backtoDo.BackToDo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class BackToDoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackToDoApplication.class, args);
	}

}

@RestController
class a {
	@GetMapping("/")
	String hello() {
		return "a";
	}
}
