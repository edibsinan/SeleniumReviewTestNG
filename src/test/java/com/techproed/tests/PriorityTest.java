package com.techproed.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PriorityTest {

    @BeforeMethod
    public void setUp(){
        System.out.println("setUp");
    }

    @Test(priority = 1)
    public void amazonTest(){
        System.out.println("amazonTest");    }
    @Test(priority = 2)
    public void googleTest(){
        System.out.println("googleTest");    }
    @Test(priority = 3)
    public void faccebookTest(){
        System.out.println("faccebookTest"); }
    @Test(priority = 4)
    public void appleTest(){
        System.out.println("appleTest");    }


}
