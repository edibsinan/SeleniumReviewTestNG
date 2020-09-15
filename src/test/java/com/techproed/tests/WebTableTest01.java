package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class WebTableTest01 extends TestBase {

    @BeforeMethod
    public void beforeMethod() {
        driver.get("http://fhctrip-qa.com/admin/HotelroomAdmin");
        driver.findElement(By.id("UserName")).sendKeys("manager2");
        driver.findElement(By.id("Password")).sendKeys("Man1ager2!" + Keys.ENTER);
    }





@Test
public void test(){
    // sayfadaki başlıklar      :
    List<WebElement> basliklar=driver.findElements(By.xpath("//thead//th"));
    for (WebElement w:basliklar){
        System.out.println(w.getText());
    }
}
@Test
public void tumSatirlar(){
    // sayfadaki tüm satırlar   :

    List<WebElement> tumSatirlar =driver.findElements(By.xpath("//tbody/tr"));
    for (WebElement w:tumSatirlar){
        System.out.println(w.getText());
    }
}
@Test
public void sutun5() throws InterruptedException {
    // 5. sütun
Thread.sleep(5000);
    List<WebElement>besincisutun=driver.findElements(By.xpath("//tbody/tr/td[5]"));
    for (WebElement w:besincisutun){
        System.out.println(w.getText());
    }
}


@Test
public void ikincisatirbesincisutun() throws InterruptedException {
    // 2. satır 5. sütun gibi istediğimiz hücreyi yazdırma. :
    Thread.sleep(5000);
WebElement hucre=driver.findElement(By.xpath("//tbody/tr[2]/td[5]"));
    System.out.println(hucre.getText());

}

    @AfterMethod
    public void afterMethod(){
    }
}
