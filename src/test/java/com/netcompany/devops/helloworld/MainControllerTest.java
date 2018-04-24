package com.netcompany.devops.helloworld;


import com.netcompany.devops.helloworld.controller.MainController;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/* JUnit for MainController */
public class MainControllerTest {

    private MainController mainController;

    @Before
    public void setup() {
        mainController = new MainController();
    }

    @Test
    public void testHomeMessage() {
        String homeMessage = mainController.showHome();
        assertTrue(homeMessage.contains(MainController.HOME_MESSAGE));
    }

    /* This test when run (not ignored) will fail intentionally. The purpose is showing how it works in the reports in Jenkins */
    @Test
    @Ignore
    public void testCompleteHomeMessage() {
        String homeMessage = mainController.showHome();
        assertTrue(homeMessage.equals(MainController.HOME_MESSAGE));
    }
}


