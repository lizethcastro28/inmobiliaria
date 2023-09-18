package com.inmobiliaria.bondplant.utilities;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 *
 * @author Lorena
 */
@Component
@Order(1)
public class ApplicationR implements ApplicationRunner {

    private static final Logger logger
            = LoggerFactory.getLogger(ApplicationR.class);

    @Override
    public void run(ApplicationArguments args) throws Exception {
        logger.info("=============1=========================");
        logger.info("Prueba de Application Runner " + args.getOptionNames().size());
        logger.info("=======================================");
    }

}
