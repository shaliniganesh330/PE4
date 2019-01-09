package com.PE4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeOfTheStringTest {
    TransposeOfTheString ob;
    @Before
    public void setUp() throws Exception {
        ob = new TransposeOfTheString();
    }

    @After
    public void tearDown() throws Exception {
    ob=null;
    }

    @Test
    public void transposingthestring() {
        String expected = "a kciuq nworb xof spmuj revo eht yzal god";
        String actual = ob.transpose("a quick brown fox jumps over the lazy dog");
        //            System.out.println(transpose(input));
        assertEquals(expected,actual);
    }
}