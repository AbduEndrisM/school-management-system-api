package com.mum.studentmisserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class StudentmisserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentmisserverApplication.class, args);
	}

}
