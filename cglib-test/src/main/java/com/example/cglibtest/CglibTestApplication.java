package com.example.cglibtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cglib.core.DebuggingClassWriter;

@SpringBootApplication
public class CglibTestApplication {

    public static void main(String[] args) {
        System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles","true");
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,System.getProperty("user.dir"));
        SpringApplication.run(CglibTestApplication.class, args);
    }

}
