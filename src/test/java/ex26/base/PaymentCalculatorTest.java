package ex26.base;

import ex25.base.PasswordTester;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    @DisplayName("case 1")
    void gives_proper_amount_of_months() {
        //given
        PaymentCalculator calc = new PaymentCalculator();

        //when
        double[] bap = new double[]{5000.0, 12.0, 100.0};
        double expected = 70.0;
        double actual = calc.calculateMonthsUntilPaidOff(bap);

        //then
        assertEquals(expected, actual);
    }
}