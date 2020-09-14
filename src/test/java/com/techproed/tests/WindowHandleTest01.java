package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowHandleTest01 extends TestBase {
     /*
        1. Adım : the-internet.herokuapp.com/windows bu sayfaya gittiğimizde,
                  sayfanın WindowHandle'ını alalım.
        2. Adım : Click Here linkine tıklayalım.
        3. Adım : Gittiğimiz sayfadan, the-internet.herokuapp.com/windows sayfasına
                  window handle'ını kullanarak geçiş yapalım.
     */

    @Test
    public void test() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/windows");


        String anaSayfaWindosHandle=driver.getWindowHandle();
        System.out.println(anaSayfaWindosHandle);

        //<a href="/windows/new" ,="" target="_blank">Click Here</a>
        // tagName , xpath, cssSelector , linkText, partialLinkText
        /*WebElement clickHereLinki = driver.findElement(By.partialLinkText("Click Here"));
        clickHereLinki.click();*/
        driver.findElement(By.partialLinkText("Click Here")).click();
        Thread.sleep(3000);

        driver.switchTo().window(anaSayfaWindosHandle);
        String ikinciSayfaWinHandle="";

        Set<String> tumWinHandlellar=driver.getWindowHandles();
        for (String handle:tumWinHandlellar){
            if (!handle.equals(anaSayfaWindosHandle)){
                ikinciSayfaWinHandle=handle;
            }
            System.out.println(handle);
        }
        Thread.sleep(3000);

        driver.switchTo().window(ikinciSayfaWinHandle);

///////////////// Set<String> i Array'e çevirme /////////////////

        Object[] windowHandleDegerleri=tumWinHandlellar.toArray();
        System.out.println(windowHandleDegerleri[0].toString());
        System.out.println(windowHandleDegerleri[1].toString());


    }


}
