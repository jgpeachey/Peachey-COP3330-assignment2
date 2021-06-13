package ex31.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void targetHeartRate_case1() {
        //given
        ex31.base.Calculator calc = new ex31.base.Calculator();

        //when
        double[] table = new double[18];
        double[] input = new double[]{65, 22};

        table = calc.targetHeartRate(input);
        double expected = 138;
        double actual = Math.round(table[1]);

        //then
        assertEquals(expected, actual);
    }

    @Test
    void targetHeartRate_case2() {
        //given
        ex31.base.Calculator calc = new ex31.base.Calculator();

        //when
        double[] table = new double[18];
        double[] input = new double[]{65, 22};

        table = calc.targetHeartRate(input);
        double expected = 191;
        double actual = Math.round(table[17]);

        //then
        assertEquals(expected, actual);
    }
}