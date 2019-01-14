package com.infosys.infytel.plan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
//@EnableEurekaClient
@EnableDiscoveryClient
@EnableResourceServer
public class InfytelPlanApplication {

	public static void main(String[] args) {
		SpringApplication.run(InfytelPlanApplication.class, args);
	}

}

