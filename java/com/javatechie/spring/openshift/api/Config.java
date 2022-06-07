package com.javatechie.spring.openshift.api;

import java.io.Serializable;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Configuration
@ConfigurationProperties(prefix = "myconfig")

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Config implements Serializable {

    private String message = "a message that can be changed live";

    private static final long serialVersionUID = -8900976432592584351L;

}