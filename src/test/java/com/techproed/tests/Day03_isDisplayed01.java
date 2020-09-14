package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Day03_isDisplayed01 extends TestBase {
    @Test
    public void test() {
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        WebElement baslik = driver.findElement(By.xpath("//*[.='Dynamic Controls']"));
        boolean baslikGoruluyorMu = baslik.isDisplayed();
    }

    @Test
    public void isSelected() {
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        WebElement secimElementi=driver.findElement(By.xpath("//input[@type='checkbox']"));

        boolean secilimi=secimElementi.isSelected();

        System.out.println("secili mi = "+secilimi);

        secimElementi.click();

        boolean secilimi2=secimElementi.isSelected();
        System.out.println("Secim elementi2 = "+secilimi2);

    }
}
