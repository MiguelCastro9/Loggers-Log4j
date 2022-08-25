package com.loggers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoggersApplication {

    private static Logger logger = LogManager.getLogger(LoggersApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(LoggersApplication.class, args);

        logger.debug("log [debug] gerado ...");
        logger.info("log [info] gerado ...");
        logger.warn("log [warn] gerado ...");
        logger.error("log [error] gerado ...");
        logger.fatal("log [fatal] gerado ...");

        int numero = 6;
        logger.debug("valor do numero - " + numero);
        if (numero == 6) {
            logger.info("numero igual a 6");
        } else if (numero > 6) {
            logger.warn("numero maior que 6");
        } else {
            logger.error("numero menor que 6");
        }

        try {
            int x = 1 / 0;
        } catch (Exception e) {
            logger.fatal("valor infinito " + e.getMessage());
        }
    }
}
