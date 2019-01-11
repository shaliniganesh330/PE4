package com.stackroute.PE4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckOccuranceOfCharTest {
    CheckOccuranceOfChar characterob;
    @Before
    public void setUp() throws Exception {
        characterob = new CheckOccuranceOfChar();
    }

    @After
    public void tearDown() throws Exception {characterob = null;
    }

    @Test
    public void testCheckOccurenceOfCharSuccess() {
        int expected = 4;
        int actual = characterob.checkOccurenceofchar("java java");
        assertEquals(expected,actual);
    }
    @Test
    public void testCheckOccurenceOfCharFailure() {
        int expected = 5;
        int actual = characterob.checkOccurenceofchar("java javaaa");
        assertNotEquals(expected,actual);
    }
    @Test
    public void testCheckOccurenceOfCharFailure1() {
        int expected = 4;
        int actual = characterob.checkOccurenceofchar("codeblocks");
        assertNotEquals(expected,actual);
    }
    @Test
    public void testCheckOccurenceOfcharFailure2() {
        int expected = 0;
        int actual = characterob.checkOccurenceofchar("");
        assertEquals(expected,actual);
    }
}