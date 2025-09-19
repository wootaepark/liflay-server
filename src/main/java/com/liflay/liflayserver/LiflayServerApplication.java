package com.liflay.liflayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiflayServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LiflayServerApplication.class, args);
		System.out.println("Test Message");
	}

}
