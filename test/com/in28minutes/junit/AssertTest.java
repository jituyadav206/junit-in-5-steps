package com.in28minutes.junit;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
import static junit.framework.Assert.assertEquals;

public class AssertTest {


    @Test
    public void test(){
        boolean cond = true;
        assertEquals(true,true);
        assertTrue(cond);
       // assertFalse(cond);
    }
}
