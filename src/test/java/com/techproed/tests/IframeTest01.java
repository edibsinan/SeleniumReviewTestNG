package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class IframeTest01 extends TestBase {
    // https://the-internet.herokuapp.com/iframe
    // 1. Adım : Sayfadaki iframe'i bulacağız.
    // 2. Adım : O iframe'in içerisindeki "p" tag name'ine sahip webelementi bulacağız.
    // 3. Adım : İçerisine "Selamlar IFRAME" yazdıracağız.
    // 4. Adım : Iframe'den çıkış yapıp, sayfamıza döneceğiz (defaultContent)
    // 5. Adım : "Elemental Selenium" linkini bulup, tıklayacağız.

    @Test
    public void test(){
        driver.get("https://the-internet.herokuapp.com/iframe");
        WebElement iframe=driver.findElement(By.id("mce_0_ifr"));
        driver.switchTo().frame(iframe);

        WebElement yazibolumu=driver.findElement(By.tagName("p"));
        yazibolumu.clear();
        yazibolumu.sendKeys("merhaba");

        driver.switchTo().defaultContent();
        driver.findElement(By.partialLinkText("Elemental Selenium")).click();



    }
}
