package com.stackroute.PE4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindMultipleOccuranceOfWordsTest {
    FindMultipleOccuranceOfWords findMultipleOccuranceOfWords;
    @Before
    public void setUp() throws Exception {
        findMultipleOccuranceOfWords =new FindMultipleOccuranceOfWords();
    }

    @After
    public void tearDown() throws Exception {findMultipleOccuranceOfWords=null;
    }

    @Test
    public void testFindMultipleOccuranceOfWordTestSuccess()
    {
        String input="She sells seashells by the seashore";
       String expected ="Found at: 4-6Found at: 10-12Found at: 27-29";
       String actual =findMultipleOccuranceOfWords.findMultipleOccuranceOfWords(input);
       assertEquals(expected,actual);
    }
    @Test
    public void testFindMultipleOccuranceOfWordsFailure()
    {
        String input="She sells seashells by the seashore";
        String expected ="Found at: 4-3Found at: 18-12Found at: 27-29";
        String actual = findMultipleOccuranceOfWords.findMultipleOccuranceOfWords(input);
        assertNotEquals(expected,actual);
    }
    @Test
    public void testFindMultipleOccuranceOfWordsTestFailure()
    {
        String input=null;
        String expected ="Null input is not expected";
        String actual = findMultipleOccuranceOfWords.findMultipleOccuranceOfWords(input);
        assertEquals(expected,actual);
    }
}