package com.techproed.excelautomation;
import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;
public class ReadExcel {
    @Test
    public void test() throws IOException {
        String dosyaAdresi = "src/test/resources/ULKELER.xlsx";
        // JAVA'da herhangi bir dosyanın açılabilmesi için, FileInputStream
        // class'ından bir tane nesne oluşturulur. Ve parametre olarak,
        // açılmak istenen dosyanın adresi eklenir.
        FileInputStream fileInputStream = new FileInputStream(dosyaAdresi);
        // Excel dosyasını okumak için Workbook kullanıyoruz.
        Workbook workbook = WorkbookFactory.create(fileInputStream);
        //Excel   == Workbook
        //Sayfa   == Sheet
        //Satır   == Row
        //Hücre   == Cell
        //SAYFA (sheet) SEÇİMİ ( index 0'dan başlıyor )
        Sheet sayfa1 = workbook.getSheetAt(0);
        //SATIR (row) SEÇİMİ (index 0'dan başlıyor )
        Row satir1 = workbook.getSheetAt(0).getRow(0); //Row satir1 = sayfa1.getRow(0);
        //HÜCRE (cell) SEÇİMİ (index 0'dan başlıyor )
        Cell satir1hucre1 = workbook.getSheetAt(0).getRow(0).getCell(0); // satir1.getCell(0);
        // Excel dosyasını kapatmak için bu kodları kullanabiliriz.

//        System.out.println(satir1hucre1);
//
//        System.out.println(workbook.getSheetAt(0).getRow(2).getCell(1));

        int sonSatirinIndexsi=workbook.getSheetAt(0).getLastRowNum();

//        for (int i=0;i<sonSatirinIndexsi;i++){
//            System.out.println(workbook.getSheetAt(0).getRow(i).getCell(0));
//        }
//
//
//        for (int i=0;i <=sonSatirinIndexsi;i++){
//            System.out.println(workbook.getSheetAt(0).getRow(i).getCell(1));
//        }

//        for (int i=0; i<=sonSatirinIndexsi;i++){
//            System.out.println(workbook.getSheetAt(0).getRow(i).getCell(2));
//        }

        int sonSutun=workbook.getSheetAt(0).getRow(0).getLastCellNum();

        for (int i=0; i<sonSutun;i++){
            System.out.println(workbook.getSheetAt(0).getRow(3).getCell(i));
        }








        workbook.close();
        fileInputStream.close();
    }
}