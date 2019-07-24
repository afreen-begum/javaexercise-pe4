package com.stackroute;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SearchingANameTest {
    SearchingAName searchName;
    @Before
    public void setUp() throws Exception {
        searchName=new SearchingAName();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void givenStringShouldReturnAsTrue() {
        boolean expected=true;
        boolean actual=searchName.isHarryHere("This is harry.");
        assertEquals(expected,actual);

    }
    @Test
    public void givenStringShouldReturnAsFalse() {
        boolean expected=false;
        boolean actual=searchName.isHarryHere("This is afreen.");
        assertEquals(expected,actual);

    }
    @Test
    public void givenStringShouldReturnANotNull() {

        boolean actual=searchName.isHarryHere("This is afreen.");
        assertNotNull(actual);

    }
}