package com.PE4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindMultipleOccuranceOfWordsTest {
    FindMultipleOccuranceOfWords ob;
    @Before
    public void setUp() throws Exception {
    ob =new FindMultipleOccuranceOfWords();
    }

    @After
    public void tearDown() throws Exception {ob=null;
    }

    @Test
    public void findmultipleoccuranceofwordsuccess()
    {
        String input="She sells seashells by the seashore";
       String expected ="Found at: 4-6Found at: 10-12Found at: 27-29";
       String actual = ob.findmultipleoccuranceofwords(input);
       assertEquals(expected,actual);
    }
    @Test
    public void findmultipleoccuranceofwordsfailure()
    {
        String input=null;
        String expected ="Null input is not expected";
        String actual = ob.findmultipleoccuranceofwords(input);
        assertEquals(expected,actual);
    }
}