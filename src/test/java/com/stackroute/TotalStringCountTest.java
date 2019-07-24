package com.stackroute;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
public class TotalStringCountTest {
    TotalStringCount totalStringCount;
    @Before
    public void setUp() {
        totalStringCount = new TotalStringCount();
    }
    @After
    public void tearDown() {
        totalStringCount = null;
    }
    @Test
    public void givenInputShouldReturnTheStringCount() {
        assertEquals(10,totalStringCount.charData("java is a java and java is java",'a'));
    }
    @Test
    public void givenInputShouldReturnTheStringCountFailure() {
        assertNotEquals(11,totalStringCount.charData("java is a java and java is java",'j'));
    }
    @Test
    public void givenInputShouldNotReturnNull() {
        assertNotNull(totalStringCount.charData("java is a java and java is java",'j'));
    }

}
