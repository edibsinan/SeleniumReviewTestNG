package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JSAlertTest01 extends TestBase {

    @Test
    public void test() throws InterruptedException {

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
         }

         @Test
    public void test1() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
      driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();

       Thread.sleep(3000);
       driver.switchTo().alert().accept();
         }

         @Test
    public void test2(){
             driver.get("https://the-internet.herokuapp.com/javascript_alerts");
           WebElement prompt= driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
           prompt.click();
           driver.switchTo().alert().sendKeys("merhaba");

         }
}
