package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class Classification_Tests {

    @ParameterizedTest
    @ValueSource(ints = {2,5,12})
    void testU12(int value){
        String expected = "U, PG & 12 films are available.";
        String result = FilmClassifications.availableClassifications(value);
        assertEquals(expected, result);
    }
    @ParameterizedTest
    @ValueSource(ints = {13, 14, 15})
    void testU15(int value){
        String expected = "U, PG, 12 & 15 films are available.";
        String result = FilmClassifications.availableClassifications(value);
        assertEquals(expected, result);
    }
    @ParameterizedTest
    @ValueSource(ints = {19,44,82})
    void testO18(int value){
        String expected = "All films are available.";
        String result = FilmClassifications.availableClassifications(value);
        assertEquals(expected, result);
    }

//    void availableClassifications() {
//    }
//
//    @Test
//    @ParameterizedTest
//    @ValueSource(ints = {1, 10, 12, 15, 19,44,82})
//    @DisplayName("Give the film is univeral for all")
//    void GivenAnyAge_whenFilmIsUniversal(int value){
//        String expected = "All films are available.";
//        String result = FilmClassifications.availableClassifications(value);
//        assertEquals(expected, result);
//    }
//    @Test
//    @ParameterizedTest
//    @ValueSource(ints = {1, 10, 12, 15, 19,44,82})
//    @DisplayName("Give the film is univeral for all")
//    void GivenAnyAge_whenFilmIsPG(int value){
//        String expected = "All films are available.";
//        String result = FilmClassifications.availableClassifications(value);
//        assertEquals(expected, result);
//    }

}