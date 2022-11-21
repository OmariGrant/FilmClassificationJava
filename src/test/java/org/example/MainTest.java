package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class MainTest {

    @Test
    @DisplayName("first test")
    void firstTest(){
assertTrue(5==5);
    }

    @Test
    @DisplayName("morning")
    void morningTest(){
        int time = 6;
        String expected = "morning";
        String result = Main.greeting(time);

        assertEquals(expected, result);
    }
    @Test
    @DisplayName("afternoon")
    void afternoonTest(){
        int time = 13;
        String expected = "afternoon";
        String result = Main.greeting(time);

        assertEquals(expected, result);
    }
    @Test
    @DisplayName("evening")
    void eveniingTest(){
        int time = 19;
        String expected = "evening";
        String result = Main.greeting(time);

        assertEquals(expected, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {5,6,7,10,11,12})
    void bulkMorningTest(int value){

        String expected = "morning";
        String result = Main.greeting(value);

        assertEquals(expected, result);
    }
    @ParameterizedTest
    @ValueSource(ints = {13,14,15,17,18})
    void bulkAfternoonTest(int value){

        String expected = "afternoon";
        String result = Main.greeting(value);

        assertEquals(expected, result);
    }
    @ParameterizedTest
    @ValueSource(ints = {19,20,21,22,23})
    void bulkEveningTest(int value){

        String expected = "evening";
        String result = Main.greeting(value);

        assertEquals(expected, result);
    }
}