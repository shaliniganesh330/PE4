package com.stackroute.PE4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeOfTheStringTest {
    TransposeOfTheString stringob;
    @Before
    public void setUp() throws Exception {
        stringob = new TransposeOfTheString();
    }

    @After
    public void tearDown() throws Exception {
    stringob=null;
    }

    @Test
    public void testTransposingTheStringSuccess() {
        String expected = "a kciuq nworb xof spmuj revo eht yzal god";
        String actual = stringob.transpose("a quick brown fox jumps over the lazy dog");
        assertEquals(expected,actual);
    }
    @Test
    public void testTransposingTheStringFailure() {
        String expected = "a kciuq  xof spmuj revo eht yzal god";
        String actual = stringob.transpose("a quick brown fox jumps over the lazy dog");
        assertNotEquals(expected,actual);
    }
    @Test
    public void testTransposingTheStringInvalid() {
        String expected = "";
        String actual = stringob.transpose("");
        assertNotNull(actual);
    }
}