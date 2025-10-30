package com.example.mylib;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MylibApplication {
	private static final Logger log = LoggerFactory.getLogger(MylibApplication.class);

    public void printHi() {
        class LocalPrinter {
            void say() {
                log.info("hi");
            }
        }
        LocalPrinter p = new LocalPrinter();
        p.say();
    }

}
