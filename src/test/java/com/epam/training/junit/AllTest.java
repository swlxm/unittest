package com.epam.training.junit;

import com.epam.training.junit.cases.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                CalcWithParamsTest.class,
                CosTest.class,
                CtgTest.class,
                DivTest.class,
                IsNegativeTest.class,
                IsPositiveTest.class,
                MultTest.class,
                PowTest.class,
                SinTest.class,
                SqrtTest.class,
                SubTest.class,
                SumTest.class,
                TgTest.class
        }
)
public class AllTest {
}
