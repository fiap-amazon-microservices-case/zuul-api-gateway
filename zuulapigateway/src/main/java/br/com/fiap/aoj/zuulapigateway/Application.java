package br.com.fiap.aoj.zuulapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

import static br.com.fiap.aoj.zuulapigateway.Application.BASE_PACKAGE;

@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = { BASE_PACKAGE })
public class Application {

	static final String BASE_PACKAGE = "br.com.fiap.aoj";

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}