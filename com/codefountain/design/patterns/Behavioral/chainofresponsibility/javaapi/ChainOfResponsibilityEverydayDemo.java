package com.codefountain.design.patterns.Behavioral.chainofresponsibility.javaapi;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChainOfResponsibilityEverydayDemo {

    private static final Logger logger = Logger.getLogger(ChainOfResponsibilityEverydayDemo.class.getName());

    public static void main(String[] args) {

        logger.setLevel(Level.FINER);
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.FINER);
        logger.addHandler(consoleHandler);

        /**
         * logger.finest will be skipped as logger level is set to Finer.
         * It will pass on and finer will be hit.
         */
        logger.finest("Finest level of logging");

        /**
         * As finer matches to the logging level, it will log the event
         */
        logger.finer("Finer level, but not as fine as finest");

        /**
         * Fine will also match as this is down the chain and is lower than
         * Finer. This too will catch the event and print the log message
         */
        logger.fine("Fine level, but not as fine as finer");
    }
}
