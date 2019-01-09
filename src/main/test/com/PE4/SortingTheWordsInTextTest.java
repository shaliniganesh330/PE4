package com.PE4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortingTheWordsInTextTest {
    SortingTheWordsInText ob;
    @Before
    public void setUp() throws Exception {
        ob = new SortingTheWordsInText();
    }

    @After
    public void tearDown() throws Exception {ob = null;
    }

    @Test
    public void sortingsuccess() {
        String []expected =  {"array", "in", "list" ,"sorted", "the"};
        String [] input = {"sorted", "array","in", "the", "list"};
        String[] actual = ob.sorting(input);
        assertArrayEquals(expected,actual);
    }
    @Test
    public void sortingfailure() {
        String[] expected = null;
        String []input = {};
        String []actual = ob.sorting(input);
        assertArrayEquals(expected,actual);
    }
}