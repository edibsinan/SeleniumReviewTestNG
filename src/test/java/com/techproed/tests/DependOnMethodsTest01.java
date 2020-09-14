package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class DependOnMethodsTest01 extends TestBase {
    @Test (priority = 3)
    public void test1() {
        System.out.println("Test1");
    }

    @Test (priority = 1)
    public void test2(){
        System.out.println("Test2");
    }

    @Test (priority = 2,dependsOnMethods = "test2")
    public void test3(){
        System.out.println("Test3");
    }

}
