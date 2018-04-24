package com.netcompany.devops.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Date;

/* Main class of the application */
@RestController
public class MainController {

    public static final String HOME_MESSAGE = "<h3>Hello World, it's Netcompany DevOps Accelerators!</h3>";
    private static final String VERSION_FILE = "version.txt";

    /* Method to show a welcome message when running localhost:8080 */
    @RequestMapping("/")
    public String showHome(){
        return HOME_MESSAGE + getExecutionDateAndTime() + getVersion() + getBody();
    }

    private String getExecutionDateAndTime() {
        return "<p><b>Date/time of execution:</b> " + new Date() + "</p>";
    }

    private String getBody() {
        return "<p>Hello World!</p>";
    }

    private String getVersion() {
        try {
            byte[] encoded = Files.readAllBytes(Paths.get(VERSION_FILE));
            return "<p>Version: " + new String(encoded, Charset.defaultCharset()) + "</p>";
        } catch (IOException e) {
            return e.getMessage();
        }
    }
}


