package com.richo.test.gradle;
import org.junit.Test;

import static org.junit.Assert.*;


public class MainTest
{
    @Test
    public void testMain() throws Exception {
        final String result = new Main().getString("Richo");
        assertEquals("Returned wrong string", "Hello Richo", result);
    }

    @Test(expected = NullPointerException.class)
    public void testNull() throws Exception {
        final String result = new Main().getString(null);
        assertEquals("Returned wrong string", "Hello", result);
    }
}