package com.example.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestCicdApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test void successTest(){
        boolean a = true;
        Assertions.assertTrue(a);
    }
//
//    @Test void FailTest(){
//        boolean a = true;
//        Assertions.assertTrue(!a);
//    }

}
