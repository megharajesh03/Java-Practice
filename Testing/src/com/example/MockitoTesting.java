package com.example;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;
import org.mockito.Mockito;

public class MockitoTesting {

    @Test
    public void testAddOperation() {
        System.out.println("**--- Test testAddOperation executed ---**");

        CalculatorService calculatorServiceMock = Mockito.mock(CalculatorService.class);

        Calculator calculator = new Calculator(calculatorServiceMock);

        int num1 = 11;
        int num2 = 12;
        int expected = 23;

        when(calculatorServiceMock.add(num1, num2)).thenReturn(expected);

        int actual = calculator.addOperation(num1, num2);

        System.out.println("Expected: " + expected);
        System.out.println("Actual: " + actual);

        verify(calculatorServiceMock).add(num1, num2);

        assertThat(actual, is(expected)); 
    }
}
