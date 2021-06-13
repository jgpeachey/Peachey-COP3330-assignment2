package ex30.base;

import ex29.base.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void multiplicationTable_case1() {
        //given
        ex30.base.Calculator calc = new ex30.base.Calculator();

        //when
        int[] table = new int[144];
        table = calc.multiplicationTable();
        double expected = 9;
        int actual = table[8];

        //then
        assertEquals(expected, actual);
    }

    @Test
    void multiplicationTable_case2() {
        //given
        ex30.base.Calculator calc = new ex30.base.Calculator();

        //when
        int[] table = new int[144];
        table = calc.multiplicationTable();
        double expected = 120;
        int actual = table[141];

        //then
        assertEquals(expected, actual);
    }
}