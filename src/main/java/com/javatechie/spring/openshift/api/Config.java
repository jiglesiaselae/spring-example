package com.javatechie.spring.openshift.api;

import java.io.Serializable;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "bean")

public class Config implements Serializable {

    private String message = "a message that can be changed live";

    public String getMessage() {
	return message;
    }

    public void setMessage(String message) {
	this.message = message;
    }

    private static final long serialVersionUID = -8900976432592584351L;

}