package com.epam.training.testng;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.*;

public class CalcTestNG {

    private Calculator calc;

    @BeforeClass(groups = {"negative", "positive", "bug"})
    public void init() {
        System.out.println("Test started...");
        calc = new Calculator();
    }

    @Test(expectedExceptions = {NumberFormatException.class}, groups = {"negative"})
    public void testException() {

        calc.div(2l, 0);
    }

    @Test(groups = "positive")
    public void testSum() {

        Assert.assertEquals(calc.sum(3l, 2l), 5l);
    }

    @Test(groups = "positive")
    @Parameters({"num1", "num2", "sum"})
    public void testSumWithParams(long num1, long num2, long sum) {

        Assert.assertEquals(calc.sum(num1, num2), sum);
    }

    @Test(groups = "positive", dataProvider = "sumData")
    public void testSumWithDataProvider(long num1, long num2, long sum) {
        
        Assert.assertEquals(calc.sum(num1, num2), sum);

    }

    @Test(groups = "positive")
    public void testSumDouble() {
        
        Assert.assertEquals(4d, calc.sum(1d, 3d), 0);
    }

    @Test(groups = "positive")
    public void testSub() {
        
        Assert.assertEquals(1l, calc.sub(3l, 2l));
    }

    @Test(groups = "positive")
    public void testSubDouble() {
        
        Assert.assertEquals(4d, calc.sub(7d, 3d), 0);
    }

    @Test(groups = "positive")
    public void testMult() {
        
        Assert.assertEquals(6l, calc.mult(3l, 2l));
    }

    @Test(groups = "positive")
    public void testMultDouble() {
        
        Assert.assertEquals(21d, calc.mult(7d, 3d), 0);
    }


    @Test(groups = "positive")
    public void testDiv() {
        
        Assert.assertEquals(2l, calc.div(4l, 2l));
    }

    @Test(groups = "positive")
    public void testDivDouble() {
        
        Assert.assertEquals(2d, calc.div(6d, 3d), 0);
    }


    @Test(groups = "positive")
    public void testPowDouble() {
        
        Assert.assertEquals(8d, calc.pow(2d, 3d), 0);
    }

    @Test(groups = "positive")
    public void testSqrtDouble() {
        
        Assert.assertEquals(3d, calc.sqrt(9d), 0);
    }

    @Test(groups = "positive")
    public void testTgDouble() {
        
        Assert.assertEquals(1d, calc.tg(45d), 0);
    }

    @Test(groups = "positive")
    public void testCtgDouble() {
        
        Assert.assertEquals(1d, calc.ctg(45d), 0);
    }

    @Test(groups = "bug")
    public void testCosDouble() {
        double d = calc.cos(0d);
        Assert.assertEquals(d, 1, "The cosine value of 0 degree is 1******");
    }

    @Test(groups = "bug")
    public void testCosDouble2() {
        double d = calc.cos(90d);
        Assert.assertEquals(d, 0, "The cosine value of 90 degree is 0******");
    }

    @Test(groups = "positive")
    public void testSinDouble() {
        
        Assert.assertEquals(0, calc.sin(0d), "The sine value of 0 degree is 0");
    }

    @Test(groups = "bug")
    public void testSinDouble2() {
        double d = calc.sin(90d);
        Assert.assertEquals(d, 1, "The sine value of 90 degrees is 1******");
    }

    @Test(groups = "positive")
    public void testIsPositive() {
        
        Assert.assertTrue(calc.isPositive(3l));
    }

    @Test(groups = "positive")
    public void testIsNegative() {
        
        Assert.assertFalse(calc.isNegative(3l));
    }

    @DataProvider(name = "sumData")
    public Object[][] readDataFromExcel() {
        return new Object[][] {
                {3, 4, 7},
                {2, 8, 10}
        };
    }

    @AfterClass(groups = {"negative", "positive", "bug"})
    public void tearDown() {
        System.out.println("Test done.");
    }
}
