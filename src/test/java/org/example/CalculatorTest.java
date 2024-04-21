package org.example;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

/*
 * Student number: B201202059
 * First name and last name: Elif Nur Tabaklı
 * Course name and homework Info: SWE 202 SOFTWARE VERIFICATION AND VALIDATION , HOMEWORK 1
 * GitHub repository address: https://github.com/elllliif/TDDExample2
 */
class CalculatorTest {

    @ParameterizedTest
    @CsvSource({
            "10, 2, 5",
            "10, 4, 2.5",
            "12.5, 2.5, 5",
            "10, 2.5, 4",
            "12.5, 5, 2.5"
    })
    void testDivision(float dividend, float divisor, float expectedResult) {
        assertEquals(expectedResult, Calculator.divide(dividend, divisor));
    }

    @Test
    void testDivisionByZero() {
        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> Calculator.divide(12.5f, 0),
                "IllegalArgumentException expected."
        );

        assertEquals("Illegal Argument Exception.", exception.getMessage());
    }
}