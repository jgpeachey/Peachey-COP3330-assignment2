package ex33.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class eightBallTest {

    @Test
    void randNum() {
        //given
        EightBall orb = new EightBall();

        //when
        int min = 1;
        int max = 4;

        double mynum = orb.randNum();

        //then
        assertTrue(min <= (int) mynum && (int) mynum <= max);
    }
}