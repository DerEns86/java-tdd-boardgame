package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerCharacterTest {

    @BeforeEach
    void resetXandYToZero(){
        PlayerCharacter.x = 0;
        PlayerCharacter.y = 0;
    }


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
    void returnY1_WhenKeyW() {
        //Given
        char arg = 'w';
        //When
        int actual = PlayerCharacter.move(arg);
        //Then
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void returnYMinus1_WhenKeyS() {
        //Given
        char arg = 's';
        //When
        int actual = PlayerCharacter.move(arg);
        //Then
        int expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    void returnXMinus1_WhenKeyA() {
        //Given
        char arg = 'a';
        //When
        int actual = PlayerCharacter.move(arg);
        //Then
        int expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    void returnX1_WhenKeyD() {
        //Given
        char arg = 'd';
        //When
        int actual = PlayerCharacter.move(arg);
        //Then
        int expected = 1;
        assertEquals(expected, actual);
    }
}


