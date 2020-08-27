package com.epam.training.testng;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.*;

public class CalcTestWithParamsNG {

    private Calculator calc;

    @BeforeClass(groups = {"negative", "positive", "bug"})
    public void init() {
        System.out.println("Test started...");
        calc = new Calculator();
    }

    @Test(groups = "positive")
    @Parameters({"num1", "num2", "sum"})
    public void testSumWithParams(long num1, long num2, long sum) {

        Assert.assertEquals(calc.sum(num1, num2), sum);
    }

    @AfterClass(groups = {"negative", "positive", "bug"})
    public void tearDown() {
        System.out.println("Test done.");
    }
}
