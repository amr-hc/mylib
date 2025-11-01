package com.example.mylib.printer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Small helper class placed in a separate package so library consumers can import it easily.
 */
public class HiPrinter {
    private static final Logger log = LoggerFactory.getLogger(HiPrinter.class);

    public void printHix() {
        log.info("hi");
    }
}
