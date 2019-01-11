package com.stackroute.PE4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckOccurenceOfNameTest {
    CheckOccurenceOfName characterob;

    @Before
    public void setUp() throws Exception {
        characterob = new CheckOccurenceOfName();
    }

    @After
    public void tearDown() throws Exception {characterob = null;
    }

    @Test
    public void testFindHarryInGivenStringSuccess() {
//        String inputString = "This is Harry.";
        String expected = "Is Harry here ? true";
        String actual = characterob.findHarryInGivenString("This is Harry.");
        assertEquals(expected,actual);
    }
    @Test
    public void testFindHarryInGivenStringFailure() {
        String expected = "Is Harry here ? false";
        String actual = characterob.findHarryInGivenString("Is garry here");
        assertNotEquals(expected,actual);
    }


    @Test
    public void testFindHarryInGivenStringFailure1() {
        String expected = "Is Harry here ? false";
        String actual = characterob.findHarryInGivenString("Potter");
        assertEquals(expected,actual);
    }

//    @Test
//    public void testFindHarryInGivenStringInvalid() {
//        String expected = "";
//        String actual = characterob.findHarryInGivenString("");
//        assertNull(expected,actual);
//    }
}