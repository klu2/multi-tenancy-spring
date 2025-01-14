package com.multitenant.multitenancy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class MultiTenancyApplication {

  public static void main(String[] args) {
    SpringApplication.run(MultiTenancyApplication.class, args);
  }

}
