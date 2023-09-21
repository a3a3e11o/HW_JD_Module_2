package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SumCalculatorTest {

    private SumCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new SumCalculator();
    }

    @Test
    void testSumWithN1() {
        assertEquals(1, calculator.sum(1));
    }

    @Test
    void testSumWithN3() {
        assertEquals(6, calculator.sum(3));
    }

    @Test
    void testSumWithN0() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.sum(0);
        });
    }
}
