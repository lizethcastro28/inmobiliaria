package com.inmobiliaria.bondplant.utilities;

import com.inmobiliaria.bondplant.service.OficinaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 *
 * @author Lorena
 */
@Component
@Order(2)
public class RunnerCL implements CommandLineRunner {

    private static final Logger logger
            = LoggerFactory.getLogger(RunnerCL.class);

    @Override
    public void run(String... args) throws Exception {
        logger.info("=============2===============");
        logger.info("Prueba de CommandLineRunner");
        logger.info("=============================");
    }

}
