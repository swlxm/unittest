package com.epam.training.junit.cases;


import com.epam.tat.module4.Calculator;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CtgTest {

    private static Calculator calc;

    @BeforeClass
    public static void init() {
        calc = new Calculator();
    }

    @Test
    public void testCtgDouble() {

        Assert.assertEquals(1d, calc.ctg(45d), 0);
    }

    @AfterClass
    public static void tearDown() {
        System.out.println("Test done.");
    }
}
