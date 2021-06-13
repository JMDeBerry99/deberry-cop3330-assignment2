package oop.exercises.ex32;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberGameTest {

    @Test
    void NumberGame_too_high_test() {
        String output;

        NumberGame game = new NumberGame();
        output = game.setup("1");
        output = game.guess("11");
        assertEquals("\nToo high. Guess again: ", output);
    }

    @Test
    void NumberGame_too_low_test() {
        String output;

        NumberGame game = new NumberGame();
        output = game.setup("3");
        output = game.guess("1");
        assertEquals("\nToo low. Guess again: ", output);
    }

}