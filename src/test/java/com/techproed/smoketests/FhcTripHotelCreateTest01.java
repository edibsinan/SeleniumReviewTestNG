package com.techproed.smoketests;

import com.techproed.pages.FhcTripHotelCreatePage;
import com.techproed.pages.FhcTripHotelCreatePage01;
import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FhcTripHotelCreateTest01 extends TestBase {

    @BeforeMethod
    public void beforeMethod(){
        driver.get("http://fhctrip-qa.com/admin/HotelAdmin/Create");
        driver.findElement(By.id("UserName")).sendKeys("manager2");
        driver.findElement(By.id("Password")).sendKeys("Man1ager2!" + Keys.ENTER);
    }
    @Test
    public void test(){
        // Tüm webelementlere veri göndermeniz gerekiyor.
        // Save butonuna tıklamnız gerekiyor.
        // Assert işlemi ile "Hotel was inserted successfully" yazısını doğrulayın
        FhcTripHotelCreatePage01 createPage1=new FhcTripHotelCreatePage01(driver);
        createPage1.code.sendKeys("12345");
        createPage1.name.sendKeys("salih");
        createPage1.address.sendKeys("athens");
        createPage1.phone.sendKeys("111");
        createPage1.email.sendKeys("eee");

        Select select=new Select(createPage1.idgroup);
        select.selectByIndex(2);

        createPage1.btnSubmit.click();

        WebDriverWait wait=new WebDriverWait(driver,30);
        boolean esitMi = wait.until(ExpectedConditions.textToBe( By.className("bootbox-body"),"Hotel was inserted successfully"));
        Assert.assertTrue(esitMi);


    }
}
