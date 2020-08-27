package com.epam.training.junit.cases;


import com.epam.tat.module4.Calculator;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TgTest {

    private static Calculator calc;

    @BeforeClass
    public static void init() {
        calc = new Calculator();
    }

    @Test
    public void testTgDouble() {
        double d = Math.toRadians(0);
        Assert.assertEquals(0, calc.tg(d), 0);
    }

    @Test
    public void testTgDouble2() {
        double d = Math.toRadians(45);
        Assert.assertEquals(1d, calc.tg(d), 0);
    }

    @AfterClass
    public static void tearDown() {
        System.out.println("Test done.");
    }
}
