package com.javatechie.spring.openshift.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringExampleApplication {

    @Autowired
    private Config config;

    @GetMapping("/")
    public String welcome() {
	System.out.println("The message is: " + config.getMessage());

	return "Welcome to java.Message from config map:" + config.getMessage();
    }

    @GetMapping("/{input}")
    public String congrats(@PathVariable String input) {
	return "hi " + input + "  Your application deployed successfully....";

    }

    public static void main(String[] args) {
	SpringApplication.run(SpringExampleApplication.class, args);
    }
}
