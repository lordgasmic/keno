package com.lordgasmic.keno;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Application {

    public static void main(final String[] args) throws Exception {
        SpringApplication.run(Application.class);
    }
}
