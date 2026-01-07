package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootTest
class SpringJenkinsApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger(SpringJenkinsApplicationTests.class);

    @Test
     void contextLoads() {
        logger.info("Test case executing...");
        logger.info("Test case executing Second log Statement...");

        assertEquals(true, true);
    }
}
