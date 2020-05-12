package com.axa.boot;

import org.springframework.boot.SpringApplication;

import com.axa.config.BootConfig;

public class Booter {

	public static void main(String[] args) {

		SpringApplication.run(BootConfig.class, args);

	}

}
