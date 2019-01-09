package com.PE4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckOccurenceOfNameTest {
    CheckOccurenceOfName ob;

    @Before
    public void setUp() throws Exception {
        ob = new CheckOccurenceOfName();
    }

    @After
    public void tearDown() throws Exception {ob = null;
    }

    @Test
    public void findHarryInGivenString() {
//        String inputString = "This is Harry.";
        String expected = "Is Harry here ? true";
        String actual = ob.findHarryInGivenString("This is Harry.");
        assertEquals(expected,actual);
    }
    @Test
    public void findHarryInGivenStringFailure() {
        String expected = "Is Harry here ? false";
        String actual = ob.findHarryInGivenString("");
        assertEquals(expected,actual);
    }


    @Test
    public void findHarryInGivenStringFailure1() {
        String expected = "Is Harry here ? false";
        String actual = ob.findHarryInGivenString("Potter");
        assertEquals(expected,actual);
    }
}