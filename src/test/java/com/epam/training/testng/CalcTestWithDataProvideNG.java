package com.epam.training.testng;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.*;

public class CalcTestWithDataProvideNG {

    private Calculator calc;

    @BeforeClass(groups = {"positive"})
    public void init() {
        System.out.println("Test started...");
        calc = new Calculator();
    }

    @Test(groups = "positive", dataProvider = "sumData")
    public void testSumWithDataProvider(long num1, long num2, long sum) {
        
        Assert.assertEquals(calc.sum(num1, num2), sum);

    }

    @DataProvider(name = "sumData")
    public Object[][] readDataFromExcel() {
        return new Object[][] {
                {3, 4, 7},
                {2, 8, 10}
        };
    }

    @AfterClass(groups = {"positive"})
    public void tearDown() {
        System.out.println("Test done.");
    }
}
