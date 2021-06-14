package ex34.base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class employeeManifestTest {

    @Test
    void employeeRemover_case1() {
        //given
        employeeManifest list = new employeeManifest();

        ArrayList<String> employees = new ArrayList<String>() {
            {
                add("John Smith");
                add("Jackie Jackson");
                add("Chris Jones");
                add("Amanda Cullen");
                add("Jeremy Goodwin");
            }
        };

        //when
        list.employeeRemover("Chris Jones", employees);

        int expected = 4;
        int actual = employees.size();

        //then
        assertEquals(expected, actual);
    }

    @Test
    void employeeRemover_case2() {
        //given
        employeeManifest list = new employeeManifest();

        ArrayList<String> employees = new ArrayList<String>() {
            {
                add("John Smith");
                add("Jackie Jackson");
                add("Chris Jones");
                add("Amanda Cullen");
                add("Jeremy Goodwin");
            }
        };

        //when
        list.employeeRemover("Chris Jones", employees);
        list.employeeRemover("Amanda Cullen", employees);

        int expected = 3;
        int actual = employees.size();

        //then
        assertEquals(expected, actual);
    }
}