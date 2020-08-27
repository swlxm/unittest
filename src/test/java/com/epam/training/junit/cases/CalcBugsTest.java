package com.epam.training.junit.cases;


import com.epam.tat.module4.Calculator;
import com.epam.training.junit.BugTest;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertEquals;

public class CalcBugsTest {

    private static Calculator calc;

    @BeforeClass
    public static void init() {
        calc = new Calculator();
    }

    @Test
    @Category(BugTest.class)
    public void testCosDouble() {
        double d = Math.toRadians(0);
        Assert.assertEquals("The cosine value of 0 degree is 1", 1, calc.cos(d), 0);
    }

    @Test
    @Category(BugTest.class)
    public void testCosDouble2() {
        double d = Math.toRadians(90);
        Assert.assertEquals("The cosine value of 90 degrees is 0", 0, calc.cos(d), 0);
    }

    @Test
    @Category(BugTest.class)
    public void testTgDouble() {
        double d = Math.toRadians(0);
        Assert.assertEquals(0, calc.tg(d), 0);
    }

    @AfterClass
    public static void tearDown() {
        System.out.println("Test done.");
    }
}
