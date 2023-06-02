package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void yieldTrue_whenCalledWith12345678() {

        boolean actual = Main.validateLength();

        assertTrue(actual);
    }

}