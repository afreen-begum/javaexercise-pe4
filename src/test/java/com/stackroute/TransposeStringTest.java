package com.stackroute;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeStringTest {

    TransposeString transpose;
    @Before
    public void setUp() throws Exception {
        transpose=new TransposeString();
    }

    @After
    public void tearDown() throws Exception {
        transpose=null;
    }

    @Test
    public void givenStringShouldReturnTheTranspose() {
        String expected="neerfa si detacided sdrawot reh krow";
        String actual=transpose.transpose("afreen is dedicated towards her work");
        assertEquals(expected,actual);
    }

    @Test
    public void givenInputShouldReturnNull() {

        String actual=transpose.transpose(null);
        assertNull(actual);
    }
    @Test
    public void givenInputShouldReturnAsNotNull() {

        String actual=transpose.transpose("afreen is dedicated towards her work");
        assertNotNull(actual);
    }
}