package com.epam.training.junit;

import com.epam.training.junit.cases.CalcBugsTest;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory(BugTest.class)
@Suite.SuiteClasses(CalcBugsTest.class)
public class BugTestCategory {
}
