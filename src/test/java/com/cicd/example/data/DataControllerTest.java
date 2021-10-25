package com.cicd.example.data;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DataControllerTest {

        @Autowired
        DataController dataController;

        @Test
        void version() {
                assertEquals( "The actual version app is 1.0.0", dataController.version());
        }

        @Test
        void booksLength() {
                Integer booksLength = dataController.getRandomBooks().size();
                assertEquals(10, booksLength);
        }

}