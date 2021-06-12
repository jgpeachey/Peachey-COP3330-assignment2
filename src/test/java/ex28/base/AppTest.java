package ex28.base;

import ex27.base.InputValidation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void counter() {
        //given
        App a = new App();

        //when
        double input[] = new double[]{1, 2, 3, 4, 5};

        double expected = 15.0;
        double actual = a.counter(input);

        //then
        assertEquals(expected, actual);
    }
}