package com.techproed.tests;

import com.techproed.pages.GlbKitPage01;
import com.techproed.utilities.ConfigurationReader;
import com.techproed.utilities.Driver;
import org.testng.annotations.Test;

public class GlbKitTest01 {

    @Test
    public void test(){
        Driver.getDriver().get(ConfigurationReader.getProperty("glb_kitchen"));
        GlbKitPage01 glbKitPage01=new GlbKitPage01();
        glbKitPage01.urunlinki.click();
        glbKitPage01.aciklama.getText();
        glbKitPage01.baslik.getText();
        glbKitPage01.fiyat.getText();

        System.out.println(glbKitPage01.aciklama.getText());
        System.out.println(glbKitPage01.baslik.getText());
        System.out.println(glbKitPage01.fiyat.getText());
    }
}
