package ex24.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramDetectorTest {

    @Test
    void is_an_anagram_case1() {
        //given
        AnagramDetector ad = new AnagramDetector();

        //when
        boolean expected = true;
        boolean actual = ad.isAnagram("dog", "god");

        //then
        assertEquals(expected, actual);
    }

    @Test
    void is_an_anagram_case2() {
        //given
        AnagramDetector ad = new AnagramDetector();

        //when
        boolean expected = true;
        boolean actual = ad.isAnagram("hamood", "doomah");

        //then
        assertEquals(expected, actual);
    }

    @Test
    void is_an_anagram_case3() {
        //given
        AnagramDetector ad = new AnagramDetector();

        //when
        boolean expected = true;
        boolean actual = ad.isAnagram("racecar", "carrace");

        //then
        assertEquals(expected, actual);
    }

    @Test
    void is_not_an_anagram_case1() {
        //given
        AnagramDetector ad = new AnagramDetector();

        //when
        boolean expected = false;
        boolean actual = ad.isAnagram("difo", "god");

        //then
        assertEquals(expected, actual);
    }

    @Test
    void is_not_an_anagram_case2() {
        //given
        AnagramDetector ad = new AnagramDetector();

        //when
        boolean expected = false;
        boolean actual = ad.isAnagram("pepper", "popper");

        //then
        assertEquals(expected, actual);
    }
}