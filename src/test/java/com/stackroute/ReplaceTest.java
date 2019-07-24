package com.stackroute;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceTest {

    Replace replace;

    @Before
    public void setUp() throws Exception {
        replace = new Replace();
    }

    @After
    public void tearDown() throws Exception {
        replace = null;
    }

    @Test
    public void givenInputShouldReplaceCharacters() {
        String expexted = "faity fry";
        String actual = replace.replaceCharacters("daily dry");
        assertEquals(expexted, actual);

    }

    @Test
    public void givenInputShouldReplaceCharactersAndReturnAsNotNull() {
        String actual = replace.replaceCharacters("daily dry");
        assertNotNull(actual);

    }

    @Test
    public void givenInputShouldReplaceCharactersAndReturnNull() {
        String actual = replace.replaceCharacters(null);
        assertNull(actual);

    }
}
