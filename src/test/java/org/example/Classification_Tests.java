package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Classification_Tests {

    @ParameterizedTest
    @ValueSource(doubles = {1.00, 5.00, 11.99})
    @DisplayName("Given the user is under 12, only U and PG films are available")
    void GivenUnder12YearsOld(double value){
        String expected = "U & PG films are available.";
        String result = FilmClassifications.availableClassifications(value);
        assertEquals(expected, result);
    }
    @ParameterizedTest
    @ValueSource(doubles = {12.00, 13.00, 14.99})
    @DisplayName("Given the user is over 12 and under 15, over 12 films are available")
    void GivenO12AndU15_12FilmsAvailable(double value){
        String expected = "U, PG & 12 films are available.";
        String result = FilmClassifications.availableClassifications(value);
        assertEquals(expected, result);
    }
    @ParameterizedTest
    @ValueSource(doubles = {15.00, 16.00, 17.99})
    @DisplayName("Given the user is over 15 and under 18, over 15 films are available")
    void GivenO15AndU18_15FilmsAvailable(double value){
        String expected = "U, PG, 12 & 15 films are available.";
        String result = FilmClassifications.availableClassifications(value);
        assertEquals(expected, result);
    }
    @ParameterizedTest
    @ValueSource(doubles = {19.00,44.00,82.99})
    @DisplayName("Given the user is over 18, all films are available")
    void testO18(double value){
        String expected = "All films are available.";
        String result = FilmClassifications.availableClassifications(value);
        assertEquals(expected, result);
    }


}