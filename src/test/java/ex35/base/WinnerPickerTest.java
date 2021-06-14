package ex35.base;

import ex33.base.EightBall;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WinnerPickerTest {

    @Test
    void randNum() {
        //given
        WinnerPicker pick = new WinnerPicker();

        //when
        int min = 1;
        int max = 10;

        double mynum = pick.randNum(10);

        //then
        assertTrue(min <= (int) mynum && (int) mynum <= max);
    }
}