package com.PE4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckOccuranceOfCharTest {
    CheckOccuranceOfChar ob;
    @Before
    public void setUp() throws Exception {
        ob = new CheckOccuranceOfChar();
    }

    @After
    public void tearDown() throws Exception {ob = null;
    }

    @Test
    public void checkoccurenceofcharsuccess() {
        int expected = 4;
        int actual = ob.checkoccurenceofchar("java java");
        assertEquals(expected,actual);
    }
    @Test
    public void checkoccurenceofcharfailure() {
        int expected = 5;
        int actual = ob.checkoccurenceofchar("java javaaa");
        assertNotEquals(expected,actual);
    }
    @Test
    public void checkoccurenceofcharfailure1() {
        int expected = 4;
        int actual = ob.checkoccurenceofchar("codeblocks");
        assertNotEquals(expected,actual);
    }
    @Test
    public void checkoccurenceofcharfailure2() {
        int expected = 0;
        int actual = ob.checkoccurenceofchar("");
        assertEquals(expected,actual);
    }
}