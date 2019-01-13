package com.stackroute.PE4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortingTheWordsInTextTest {
    SortingTheWordsInText sortingob;
    @Before
    public void setUp() throws Exception {
        sortingob = new SortingTheWordsInText();
    }

    @After
    public void tearDown() throws Exception {sortingob = null;
    }

    @Test
    public void testSortingSuccess() {
        String []expected =  {"array", "in", "list" ,"sorted", "the"};
        String [] input = {"sorted", "array","in", "the", "list"};
        String[] actual = sortingob.sorting(input);
        assertArrayEquals(expected,actual);
    }
    @Test
    public void testSortingFailure() {
        String[] expected = null;
        String []input = {""};
        String []actual = sortingob.sorting(input);
        assertNotEquals(expected,actual);
    }
    @Test
    public void testSortingTestFailure() {
        String[] expected = {"array", "list", "in" ,"sorted", "the"};
        String []input = {"sorted","array","in","the","list"};
        String []actual = sortingob.sorting(input);
        assertNotEquals(expected,actual);
    }
}