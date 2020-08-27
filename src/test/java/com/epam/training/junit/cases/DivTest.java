package com.epam.training.junit.cases;


import com.epam.tat.module4.Calculator;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DivTest {

    private static Calculator calc;

    @BeforeClass
    public static void init() {
        calc = new Calculator();
    }

    @Test
    public void testDiv() {

        Assert.assertEquals(2l, calc.div(4l, 2l));
    }

    @Test
    public void testDivDouble() {

        Assert.assertEquals(2d, calc.div(6d, 3d), 0);
    }


    @AfterClass
    public static void tearDown() {
        System.out.println("Test done.");
    }
}
