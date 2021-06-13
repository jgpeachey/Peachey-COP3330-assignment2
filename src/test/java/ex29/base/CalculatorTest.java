package ex29.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void yearsToDouble_case1() {
        //given
        Calculator calc = new Calculator();

        //when
        double expected = 18;
        double actual = calc.yearsToDouble(4);

        //then
        assertEquals(expected, actual);
    }

    @Test
    void yearsToDouble_case2() {
        //given
        Calculator calc = new Calculator();

        //when
        double expected = 1;
        double actual = calc.yearsToDouble(72);

        //then
        assertEquals(expected, actual);
    }
}