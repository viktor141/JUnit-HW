package org.example;

import org.hamcrest.Matcher;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

public class CalculatorHamcrestTest {

    @Test
    public void testOnZeroDivide() {

        final int firstArgument = 5, secondArgument = 0, expectedValue = Integer.MIN_VALUE;

        Calculator calc = Calculator.instance.get();
        final int result = calc.devide.apply(firstArgument, secondArgument);

        assertThat(result, Matchers.equalTo(expectedValue));
    }

    @Test
    public void testIsPositiveMethod() {
        Calculator calc = Calculator.instance.get();
        final boolean result = calc.isPositive.test(-4);

        assertThat(result, Matchers.is(false));
    }

    @Test
    public void testABS() {
        final int argument = -542;
        final int expected = argument * -1;

        Calculator calc = Calculator.instance.get();
        final int result = calc.abs.apply(argument);


        assertThat(result, Matchers.is(expected));
    }


    @Test
    public void anotherTestABS() {
        final int argument = -5;

        Calculator calc = Calculator.instance.get();
        final int result = calc.abs.apply(argument);


        assertThat(result, Matchers.greaterThan(0));
    }

    @Test
    public void testCalculatorCall() {
       Calculator calculator = Calculator.instance.get();
        assertThat(calculator, Matchers.notNullValue());
    }


}
