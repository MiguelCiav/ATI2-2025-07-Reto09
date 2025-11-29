package com.laboratorio3.ati2.microservicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ati2microservicioEurekaServerApplicationTests {

	public static void main(String[] args) {
		SpringApplication.run(ati2microservicioEurekaServerApplicationTests.class, args);
	}

}
