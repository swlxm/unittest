package com.epam.training.testng;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.*;

public class CalcBugsTestNG {

    private Calculator calc;

    @BeforeClass(groups = {"bug"})
    public void init() {
        System.out.println("Test started...");
        calc = new Calculator();
    }

    @Test(groups = "bug")
    public void testCosDouble() {
        double d = Math.toRadians(0);
        Assert.assertEquals(calc.cos(d), 1, "The cosine value of 0 degree is 1");
    }

    @Test(groups = "bug")
    public void testCosDouble2() {
        double d = calc.cos(90d);
        Assert.assertEquals(d, 0, "The cosine value of 90 degree is 0");
    }

    @Test(groups = "bug")
    public void testCosDouble3() {
        double d = calc.cos(45d);
        Assert.assertEquals(d, 0.7071, "The cosine value of 45 degrees is 0.7071");
    }

    @AfterClass(groups = {"bug"})
    public void tearDown() {
        System.out.println("Test done.");
    }
}
