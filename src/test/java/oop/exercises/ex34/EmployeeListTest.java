package oop.exercises.ex34;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeListTest {
    @Test
    void remove_test() {
        String[] array = {"Person", "Man", "Woman", "Child"};
        EmployeeList test = new EmployeeList(array);
        test.remove("man");
        String[] expected = {"Person", "Woman", "Child"};
        array = test.getList();
        assertEquals(expected[0], array[0]);
        assertEquals(expected[1], array[1]);
        assertEquals(expected[2], array[2]);

    }

}