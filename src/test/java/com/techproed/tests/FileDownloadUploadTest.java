package com.techproed.tests;
import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.nio.file.Files;
import java.nio.file.Paths;
public class FileDownloadUploadTest extends TestBase {
    @Test
    public void dosyaVarMi(){
        // Şuanda bulunduğumuz klasörün dosya yolunu veriyor.(String olarak)
        System.out.println(   System.getProperty("user.dir")   );
        // Kullanıcın ana klasörünün dosya yolunu veriyor. (String olarak)
        System.out.println(   System.getProperty("user.home")   );
        // Java ile belirtilen adreste, aradığımız dosyanın var olup olmadığını
        // aşağıdaki kod ile yapabiliyoruz.
        // Eğer dosya varsa, TRUE  - Eğer dosya yoksa, FALSE
        // C:\Users\isimsiz\IdeaProjects\SeleniumReviewTestNG\pom.xml
        // C:\Users\isimsiz\IdeaProjects\SeleniumReviewTestNG\pom.xml
        boolean varMi = Files.exists(Paths.get("C:\\Users\\user\\IdeaProjects\\TechProEd_Selenium_B1\\SeleniumReviewTestNG\\pom.xml"));
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

        WebElement penguen=driver.findElement(By.partialLinkText("Penguins.jpg"));
        penguen.click();
        try {
            Thread.sleep(9000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        boolean varMi= Files.exists(Paths.get("C:\\Users\\user\\Downloads\\Penguins.jpg"));

        Assert.assertTrue(varMi);
    }

}