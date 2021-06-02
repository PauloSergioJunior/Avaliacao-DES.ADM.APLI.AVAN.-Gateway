package br.com.ci;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MsEmpregadoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsEmpregadoApplication.class, args);
	}

}
