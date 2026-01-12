package javabasics;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerDemo {
    public static final Logger logger = Logger.getLogger(LoggerDemo.class.getName());
    public static void main(String[] args) {
        logger.info("Enter a Number: ");


        logger.log(Level.WARNING," Keep your password");

        logger.setLevel(Level.ALL);
        logger.info("Hello Logger");
        logger.config("Configuration errors");
        logger.severe("severe errors");
        logger.warning("Warning errors");
        logger.fine("fine statements");
        logger.finer("finer statements some depth than fine");
        logger.finest("finest statements more depth than finer");



        logger.setLevel(Level.WARNING);
        logger.fine("fine statements");
        /*
            multithreading
            Thread
            Creating of thread with Thread Class And Runnable Interface
            Thread life cycle
            wait() and sleep()
            start() run()
            can we call run()
            synchronised
            volatile

         */
    }
}
