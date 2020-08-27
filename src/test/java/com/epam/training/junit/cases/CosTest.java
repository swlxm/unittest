package com.epam.training.junit.cases;


import com.epam.tat.module4.Calculator;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CosTest {

    private static Calculator calc;

    @BeforeClass
    public static void init() {
        calc = new Calculator();
    }

    @Test
    public void testCosDouble() {
        double b = Math.toRadians(0);
        Assert.assertEquals("The cosine value of 0 degree is 1", 1, calc.cos(b), 0);
    }

    @Test
    public void testCosDouble2() {
        double d = Math.toRadians(90);
        Assert.assertEquals("The cosine value of 90 degree is 0", 0, calc.cos(d), 0);
    }

    @AfterClass
    public static void tearDown() {
        System.out.println("Test done.");
    }
}
