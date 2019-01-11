package com.stackroute.PE4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplacingCharactersInTheStringTest {
    ReplacingCharactersInTheString characterob;
    @Before
    public void setUp() throws Exception {
        characterob=new ReplacingCharactersInTheString();
    }

    @After
    public void tearDown() throws Exception {
        characterob = null;
    }

    @Test
    public void testReplacingCharactersSuccess() {
        String expected = "faity fry";
        String actual = characterob.replacingCharacters("daily dry");
        assertEquals(expected,actual);
    }
    @Test
    public void testReplacingCharactersFailure() {
        String expected = null;
        String actual = characterob.replacingCharacters("daily dry");
        assertNotEquals(expected,actual);
    }
    @Test
    public void testReplacingCharactersInvalid() {
        String expected = null;
        String actual = characterob.replacingCharacters("");
        assertNull(expected,actual);
    }
}