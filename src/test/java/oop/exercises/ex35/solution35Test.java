package oop.exercises.ex35;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class solution35Test {

    @Test
    void pickWinner() {
        ArrayList<String> people = new ArrayList<>();
        people.add("Donny Martin");
        String winner = solution35.pickWinner(people);
        assertEquals("Donny Martin", winner);
    }
}