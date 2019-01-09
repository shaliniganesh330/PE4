package com.PE4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplacingCharactersInTheStringTest {
    ReplacingCharactersInTheString ob;
    @Before
    public void setUp() throws Exception {
        ob=new ReplacingCharactersInTheString();
    }

    @After
    public void tearDown() throws Exception {
    ob = null;
    }

    @Test
    public void replacingcharacterssuccess() {
        String expected = "faity fry";
        String actual = ob.replacingcharacters("daily dry");
        assertEquals(expected,actual);
    }
    @Test
    public void replacingcharactersfailure() {
        String expected = null;
        String actual = ob.replacingcharacters("");
        assertEquals(expected,actual);
    }
}