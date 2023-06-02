package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void yieldTrue_whenCalledWith12345678() {

        boolean actual = Main.validateLength("12345678");

        assertTrue(actual);
    }
    @Test
    void yieldFalse_whenCalledWithabc(){
        boolean actual=Main.validateWithNumber("abc");
        assertFalse(actual);
    }
    @Test
    void yieldTrue_whenCalledWithabc1(){
        boolean actual=Main.validateWithNumber("abc1");
        assertTrue(actual);
    }
    @Test
    void yieldTrue_whenCalledWithabC(){
        boolean actual=Main.validateWithSmallAndBig("abC");
        assertTrue(actual);
    }
    @Test
    void yieldTrue_whenCalledWithabc() {
        boolean actual = Main.validateWithSmallAndBig("abc");
        assertFalse(actual);
    }

}