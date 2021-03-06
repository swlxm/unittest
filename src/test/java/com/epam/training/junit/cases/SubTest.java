package com.epam.training.junit.cases;


import com.epam.tat.module4.Calculator;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubTest {

    private static Calculator calc;

    @BeforeClass
    public static void init() {
        calc = new Calculator();
    }

    @Test
    public void testSub() {

        Assert.assertEquals(1l, calc.sub(3l, 2l));
    }

    @Test
    public void testSubDouble() {

        Assert.assertEquals(4d, calc.sub(7d, 3d), 0);
    }

    @AfterClass
    public static void tearDown() {
        System.out.println("Test done.");
    }
}
