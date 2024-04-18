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
}
