package com.mum.studentmis;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
//@EnableDiscoveryClient
public class StudentmisApplication{

//	@Autowired
//	private PaymentDao paymentDao;

	@Value("${testing}")
	private String myname;

	public static void main(String[] args) {
		SpringApplication.run(StudentmisApplication.class, args);
	}


}
