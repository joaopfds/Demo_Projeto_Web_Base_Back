package com.example.demo_proc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class DemoTeste2Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoTeste2Application.class, args);
	}

}
