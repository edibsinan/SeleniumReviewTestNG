package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ornek_HotelRoomCreation01 extends TestBase {

    @BeforeMethod
    public void giris(){
    driver.get("http://fhctrip-qa.com/admin/HotelroomAdmin/Create");
    driver.findElement(By.id("UserName")).sendKeys("manager2");
    driver.findElement(By.id("Password")).sendKeys("Man1ager2!"+ Keys.ENTER);
//    driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
    }
    @Test
    public void odaEkle() throws InterruptedException {

        WebElement idHotel      =driver.findElement(By.id("IDHotel"));
        WebElement code         =driver.findElement(By.id("Code"));
        WebElement name         =driver.findElement(By.id("Name"));
        WebElement location     =driver.findElement(By.id("Location"));
        WebElement descKutusu   =driver.findElement(By.xpath("(//textarea)[2]"));
        WebElement price        =driver.findElement(By.id("Price"));
        WebElement fiyat500     =driver.findElement(By.partialLinkText("500"));
        WebElement roomType     =driver.findElement(By.id("IDGroupRoomType"));
        WebElement maxAdultCount=driver.findElement(By.id("MaxAdultCount"));
        WebElement maxChildCount=driver.findElement(By.id("MaxChildCount"));
        WebElement btnSubmit    =driver.findElement(By.id("btnSubmit"));

        Select select=new Select(idHotel);
        select.selectByIndex(2);

        code.sendKeys("12345");
        name.sendKeys("Deneme");
        location.sendKeys("athens");
        descKutusu.sendKeys("iki kisilik yer");

        Actions actions=new Actions(driver);
        actions.dragAndDrop(fiyat500,price).perform();

        Select select1=new Select(roomType);
        select1.selectByIndex(3);

        maxAdultCount.sendKeys("2");
        maxChildCount.sendKeys("2");

        btnSubmit.click();







    }



}
