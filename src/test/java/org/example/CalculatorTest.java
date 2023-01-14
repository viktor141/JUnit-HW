package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testOnZeroDivide() {

        final int firstArgument = 5, secondArgument = 0, expectedValue = Integer.MIN_VALUE;

        Calculator calc = Calculator.instance.get();
        final int result = calc.devide.apply(firstArgument, secondArgument);

        Assertions.assertEquals(expectedValue, result);

    }

    @Test
    public void testIsPositiveMethod() {

        Calculator calc = Calculator.instance.get();
        final boolean result = calc.isPositive.test(-4);

        Assertions.assertFalse(result);
    }

    @Test
    public void testABS() {
        final int argument = -542;
        final int expected = argument * -1;

        Calculator calc = Calculator.instance.get();
        final int result = calc.abs.apply(argument);

        Assertions.assertEquals(expected, result);

    }
}
