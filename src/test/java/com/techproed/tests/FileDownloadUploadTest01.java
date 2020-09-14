package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class FileDownloadUploadTest01 extends TestBase {
    @Test
    public void dosyavarmi(){
        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("user.home"));

        boolean varMi= Files.exists(Paths.get("S:\\TESTER\\selenium class\\selenium review\\13.GUN.pdf"));
        Assert.assertTrue(varMi);
    }
    @Test
    public void dosyaUpload(){
        driver.get("http://the-internet.herokuapp.com/upload");

        WebElement choosefile=driver.findElement(By.id("file-upload"));
        choosefile.sendKeys("C:\\Users\\user\\Pictures\\logo.png");
        driver.findElement(By.id("file-submit")).click();
    }
    @Test
    public void dosyaIndirme(){
        driver.get("http://the-internet.herokuapp.com/download");

        driver.findElement(By.partialLinkText("hello")).click();

        boolean varMi=Files.exists(Paths.get("C:\\Users\\user\\Downloads\\hello_world.txt"));
        Assert.assertTrue(varMi);

    }


}
