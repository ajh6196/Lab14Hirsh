package com.company;

import org.junit.*;
import org.junit.Assert.*;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class Test {

    @org.junit.Test
    public void additionUnitTestTrue() {
        assertTrue(Main.addition(5, 5) == 10);

    }

    @org.junit.Test
    public void additionUnitTestFalse() {
        assertFalse(Main.addition(5, 5) == 7);

    }
}
