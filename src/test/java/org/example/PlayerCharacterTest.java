package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerCharacterTest {

    @Test
    void getXInitiallyReturnIntZero(){
        // Given
        int x = 0;
        // When
        int actual = PlayerCharacter.getX();
        // Then
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void getYInitiallyReturnIntZero(){
        // Given
        int y = 0;
        // When
        int actual = PlayerCharacter.getY();
        // Then
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void whenMovePlayerWithArgumentW_ThenYOneIsTrue() {
        //Given
        char arg = 'w';
        //When
        boolean actual = PlayerCharacter.move(arg);
        //Then
        boolean expected = true;
        assertEquals(expected, actual);
    }
}


/*Write a test that ensures that when the method move in the class PlayerCharacter is called with the argument "W",
the game character moves one position up (after the movement, Y = 1 should be true).


Attention: for now, only write the test, do not change anything in src/main/java.
* */
