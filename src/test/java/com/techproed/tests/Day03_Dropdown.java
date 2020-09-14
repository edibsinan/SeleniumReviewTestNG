package com.techproed.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Day03_Dropdown {
   static WebDriver driver;
    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void dropdown2() throws InterruptedException {
        driver.get("http://amazon.com");
        WebElement dropDown =driver.findElement(By.id("searchDropdownBox"));
        Select select = new Select(dropDown);

        select.selectByVisibleText("Baby");
        Thread.sleep(2000);

        select.selectByIndex(5);
        Thread.sleep(2000);

        select.selectByValue("search-alias=arts-crafts-intl-ship");

        List<WebElement> tumSecenekler=select.getOptions();
        for (WebElement w: tumSecenekler){
            System.out.println(w.getText());
        }

        System.out.println("Toplam kategori sayisi= "+tumSecenekler.size());

        WebElement secili=select.getFirstSelectedOption();
        System.out.println("Su an secili olan= " +secili.getText());
    }

    @AfterClass
    public void kapat() throws InterruptedException {

        Thread.sleep(10000);
        driver.quit();

    }
}
