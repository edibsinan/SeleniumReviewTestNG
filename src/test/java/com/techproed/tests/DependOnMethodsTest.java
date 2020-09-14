package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.testng.annotations.Test;

public class DependOnMethodsTest extends TestBase {
    @Test(priority = 1)
    public void test01(){
        System.out.println("test01");
    }

    @Test (priority = 2, dependsOnMethods = "test01")
    public void test02(){
        System.out.println("test02");
    }
    @Test (priority = 3)
    public void test03(){
        System.out.println("test3~");
    }


}
