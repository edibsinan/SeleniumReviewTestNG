package com.techproed.tests;

import com.techproed.pages.GlbPantsPage01;
import com.techproed.utilities.ConfigurationReader;
import com.techproed.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class GlbPantsTest01 {
 @Test
 public void test(){
     Driver.getDriver().get(ConfigurationReader.getProperty("glb_pantolon"));
     GlbPantsPage01 glbPantsPage01=new GlbPantsPage01();

     for (WebElement w:glbPantsPage01.basliklar){
         System.out.println(w.getText());
     }
 }
}
