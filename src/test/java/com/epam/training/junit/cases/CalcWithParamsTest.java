package com.epam.training.junit.cases;


import com.epam.tat.module4.Calculator;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CalcWithParamsTest {

    private long num1, num2;
    private long sum;
    private static Calculator calc;

    public CalcWithParamsTest(long num1, long num2, long sum) {
        this.num1 = num1;
        this.num2 = num2;
        this.sum = sum;
    }

    @BeforeClass
    public static void init() {
        calc = new Calculator();
    }

    @Test
    public void testSumWithParams() {
        assertEquals(sum, calc.sum(num1, num2));
    }

    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][] {
                {3, 4, 7},
                {4, 5, 9}
        };
    }

    @AfterClass
    public static void tearDown() {
        System.out.println("Test done.");
    }
}
