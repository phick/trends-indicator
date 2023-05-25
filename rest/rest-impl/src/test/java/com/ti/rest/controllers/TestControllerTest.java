package com.ti.rest.controllers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;


@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = TestConfig.class)
class TestControllerTest {

    @Autowired
    private TestController testController;


    @Test
    public void testHello() {

        String response = testController.testHello();
        Assertions.assertEquals("Hello", response);
    }

}