package com.example.demo;

import org.apache.logging.log4j.LogManager;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements ApplicationRunner {
    private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(DemoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        logger.debug("Oprisk: Debugging log");
        logger.info("Oprisk: Info log");
        logger.warn("Oprisk: Hey, This is a warning!");
        logger.error("Oprisk: Oops! We have an Error. OK");
        logger.fatal("Oprisk: Damn! Fatal error. Please fix me.");
    }
}
