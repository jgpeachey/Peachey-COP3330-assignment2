package ex25.base;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordTesterTest {

    @Test
    @DisplayName("all numbers")
    void returns_int_depending_on_strength_of_password_case1() {
        //given
        PasswordTester test = new PasswordTester();

        //when
        int expected = 1;
        int actual = test.passwordValidator("12345");

        //then
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("all letters")
    void returns_int_depending_on_strength_of_password_case2() {
        //given
        PasswordTester test = new PasswordTester();

        //when
        int expected = 2;
        int actual = test.passwordValidator("abcdef");

        //then
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("letters + numbers")
    void returns_int_depending_on_strength_of_password_case3() {
        //given
        PasswordTester test = new PasswordTester();

        //when
        int expected = 3;
        int actual = test.passwordValidator("abc123xyz");

        //then
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("everything")
    void returns_int_depending_on_strength_of_password_case4() {
        //given
        PasswordTester test = new PasswordTester();

        //when
        int expected = 4;
        int actual = test.passwordValidator("1337h@xor!");

        //then
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("nums in password")
    void returns_amount_of_nums_in_password() {
        //given
        PasswordTester test = new PasswordTester();

        //when
        int expected = 5;
        int actual = test.hasNums("12a3ca4w9");

        //then
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("special character")
    void returns_whether_password_has_special_character() {
        //given
        PasswordTester test = new PasswordTester();

        //when
        boolean expected = true;
        boolean actual = test.hasSpecial("1337h@xor!");

        //then
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("no special character")
    void returns_whether_password_has_special_character_case2() {
        //given
        PasswordTester test = new PasswordTester();

        //when
        boolean expected = false;
        boolean actual = test.hasSpecial("1337hxor");

        //then
        assertEquals(expected, actual);
    }
}