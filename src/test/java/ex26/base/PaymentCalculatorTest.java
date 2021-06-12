package ex26.base;

import ex25.base.PasswordTester;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    @DisplayName("case 1")
    void gives_proper_amount_of_months_case1() {
        //given
        PaymentCalculator calc = new PaymentCalculator();

        //when
        double[] bap = new double[3];
        bap[0] = 5000;
        bap[1] = 0.12;
        bap[2] = 100;

        double expected = 70.0;
        double actual = calc.calculateMonthsUntilPaidOff(bap);

        //then
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("case 2")
    void gives_proper_amount_of_months_case2() {
        //given
        PaymentCalculator calc = new PaymentCalculator();

        //when
        double[] bap = new double[3];
        bap[0] = 983.4;
        bap[1] = 0.07;
        bap[2] = 9.37;

        double expected = 162.0;
        double actual = calc.calculateMonthsUntilPaidOff(bap);

        //then
        assertEquals(expected, actual);
    }
}