package com.techproed.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Day03_isDisplayed {
    static WebDriver driver;
    @BeforeClass
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }


    @Test
    public void isDisplayed(){
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        WebElement baslik=driver.findElement(By.xpath("//*[.='Dynamic Controls']"));
        boolean goruluyorMu=baslik.isDisplayed();  //true false
        System.out.println("Gorunuyor mu : "+goruluyorMu);
    }

    @Test
    public void isSelected(){
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        WebElement secimElementi=driver.findElement(By.xpath("//input[@type='checkbox']"));

        boolean secilimi=secimElementi.isSelected();
        System.out.println("Secili mi 1= "+ secilimi);

        secimElementi.click();

        boolean secilimi2=secimElementi.isSelected();
        System.out.println("Secili mi 2= "+secilimi2);


    }






    @AfterClass
    public void kapat() throws InterruptedException {

        Thread.sleep(10000);
        driver.quit();

    }
}
