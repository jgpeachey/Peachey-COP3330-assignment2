package ex27.base;

import ex26.base.PaymentCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InputValidationTest {

    @Test
    void nameValid() {
        //given
        InputValidation validator = new InputValidation();

        //when
        String a = "John";

        int expected = 1;
        int actual = validator.nameValid(a);

        //then
        assertEquals(expected, actual);
    }

    @Test
    void zipCodeValid() {
        //given
        InputValidation validator = new InputValidation();

        //when
        String a = "55555";

        int expected = 1;
        int actual = validator.zipCodeValid(a);

        //then
        assertEquals(expected, actual);
    }

    @Test
    void employeeValid() {
        //given
        InputValidation validator = new InputValidation();

        //when
        String a = "AA-1234";

        int expected = 1;
        int actual = validator.employeeValid(a);

        //then
        assertEquals(expected, actual);
    }
}