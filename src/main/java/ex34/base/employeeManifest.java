package ex34.base;

import ex32.base.App;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class employeeManifest {

    ArrayList<String> employees = new ArrayList<String>() {
        {
            add("John Smith");
            add("Jackie Jackson");
            add("Chris Jones");
            add("Amanda Cullen");
            add("Jeremy Goodwin");
        }
    };

    public ArrayList employees() {
        return employees;
    }

    public ArrayList employeeRemover(String name, ArrayList employees){
        employees.remove(name);
        return employees;
    }

}
