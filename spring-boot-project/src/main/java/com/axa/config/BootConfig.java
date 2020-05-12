package com.axa.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.axa.controller", "com.axa.dao", "com.axa.service" })
public class BootConfig {

}
