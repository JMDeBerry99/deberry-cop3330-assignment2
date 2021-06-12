package oop.exercises.ex27;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {

    @Test
    void validateInput_with_all_errors() {
        Validator test = new Validator();
        String actual = test.validateInput("J", "", "ABCDE", "A12-1234");
        assertEquals("\nThe first name must be at least 2 characters long." +
                "\nThe last name must be at least 2 characters long." +
                "\nThe last name must be filled in." +
                "\nThe zipcode must be a 5 digit number." +
                "\nThe employee ID must be in the format of AA-1234.", actual);
    }

    @Test
    void validateInput_with_some_errors() {
        Validator test = new Validator();
        String actual = test.validateInput("J", "DeBerry", "12345", "A12-1234");
        assertEquals("\nThe first name must be at least 2 characters long." +
                "\nThe employee ID must be in the format of AA-1234.", actual);
    }

    @Test
    void validateInput_with_no_errors() {
        Validator test = new Validator();
        String actual = test.validateInput("Jacob", "DeBerry", "12345", "AB-1234");
        assertEquals("\nThere were no errors found.", actual);
    }

    @Test
    void validateFirstName_empty() {
        Validator test = new Validator();
        String actual = test.validateFirstName("");
        assertEquals("\nThe first name must be at least 2 characters long.\nThe first name must be filled in.", actual);
    }

    @Test
    void validateFirstName_less_than_two_characters() {
        Validator test = new Validator();
        String actual = test.validateFirstName("J");
        assertEquals("\nThe first name must be at least 2 characters long.", actual);
    }

    @Test
    void validateFirstName_full_name() {
        Validator test = new Validator();
        String actual = test.validateFirstName("Jacob");
        assertEquals("", actual);
    }

    @Test
    void validateLastName_empty() {
        Validator test = new Validator();
        String actual = test.validateLastName("");
        assertEquals("\nThe last name must be at least 2 characters long.\nThe last name must be filled in.", actual);
    }

    @Test
    void validateLastName_less_than_two_characters() {
        Validator test = new Validator();
        String actual = test.validateLastName("D");
        assertEquals("\nThe last name must be at least 2 characters long.", actual);
    }

    @Test
    void validateLastName_full_name() {
        Validator test = new Validator();
        String actual = test.validateLastName("DeBerry");
        assertEquals("", actual);
    }

    @Test
    void validateZIP_empty() {
        Validator test = new Validator();
        String actual = test.validateZIP("");
        assertEquals("\nThe zipcode must be a 5 digit number.", actual);
    }

    @Test
    void validateZIP_letters() {
        Validator test = new Validator();
        String actual = test.validateZIP("sfDGE");
        assertEquals("\nThe zipcode must be a 5 digit number.", actual);
    }

    @Test
    void validateZIP_too_long() {
        Validator test = new Validator();
        String actual = test.validateZIP("54613264");
        assertEquals("\nThe zipcode must be a 5 digit number.", actual);
    }

    @Test
    void validateZIP_too_short() {
        Validator test = new Validator();
        String actual = test.validateZIP("465");
        assertEquals("\nThe zipcode must be a 5 digit number.", actual);
    }

    @Test
    void validateZIP_correct() {
        Validator test = new Validator();
        String actual = test.validateZIP("45167");
        assertEquals("", actual);
    }

    @Test
    void validateID_empty() {
        Validator test = new Validator();
        String actual = test.validateID("");
        assertEquals("\nThe employee ID must be in the format of AA-1234.", actual);
    }

    @Test
    void validateID_wrong_format_1() {
        Validator test = new Validator();
        String actual = test.validateID("ad-a652");
        assertEquals("\nThe employee ID must be in the format of AA-1234.", actual);
    }

    @Test
    void validateID_wrong_format_2() {
        Validator test = new Validator();
        String actual = test.validateID("ada6-52");
        assertEquals("\nThe employee ID must be in the format of AA-1234.", actual);
    }

    @Test
    void validateID_correct_format() {
        Validator test = new Validator();
        String actual = test.validateID("ad-6552");
        assertEquals("", actual);
    }
}