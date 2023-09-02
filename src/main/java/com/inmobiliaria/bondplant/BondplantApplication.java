package com.inmobiliaria.bondplant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BondplantApplication {

    private static final Logger logger = LoggerFactory.getLogger(BondplantApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(BondplantApplication.class, args);
        logger.info("=================== Inmobiliaria BONDPLANT ========================");
    }

}
