package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class Day03_Dropdown01 extends TestBase {

    @Test
            public void dropDown() throws InterruptedException {
        driver.get("https://www.amazon.com/");
        WebElement dropDown=driver.findElement(By.id("searchDropdownBox"));
       Select select=new Select(dropDown);

       select.selectByVisibleText("Baby");
       Thread.sleep(3000);

       select.selectByIndex(5);
       Thread.sleep(3000);

       select.selectByValue("search-alias=arts-crafts-intl-ship");

        List<WebElement> tumSecenekler=select.getOptions();
        for (WebElement w:tumSecenekler){
            System.out.println(w.getText());
        }
        System.out.println("\nTum kategori sayisi= " +tumSecenekler.size());

        WebElement secili=select.getFirstSelectedOption();
        System.out.println("Su an secili olan = "+secili.getText());


    }

}
