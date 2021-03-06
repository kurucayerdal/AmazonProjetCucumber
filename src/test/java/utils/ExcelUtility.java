package utils;

import cucumber.api.Scenario;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExcelUtility {

    public static List<List<String>> getListData(String path, String sheetName, int columnCount) {

        List<List<String>> returnList = new ArrayList<>();
        Workbook workbook = null;
        try {
            FileInputStream inputStream = new FileInputStream(path);
            workbook = WorkbookFactory.create(inputStream);
        } catch (Exception e) {
        }
        Sheet sheet = workbook.getSheet(sheetName);
        int rowCount = sheet.getPhysicalNumberOfRows();

        for (int i = 0; i < rowCount; i++) {
            // Her okunan satırdaki hücreler rowList e ekleniyor
            List<String> rowList = new ArrayList<>();
            Row row = sheet.getRow(i);

            for (int j = 0; j < columnCount; j++) {
                rowList.add(row.getCell(j).toString());
            }
            // Daha sonra rowList 2 boyutlu List'e ekleniyor.
            returnList.add(rowList);
        }
        return returnList;
    }

    public static void writeExcel(String path, Scenario scenario, String browserName, String time) {

        File f = new File(path);  // dosya kontrolü için bir dosya değişkeni oluşturuldu, sadece varlık kontrolü için
        String sheetName = "Page1";

        if (!f.exists()) // dosya yok ise
        {
            // hafızada  yeni workbook oluştur, sonra sheet oluştur, sonra row oluştur, sonra cell oluştur.
            XSSFWorkbook workbook = new XSSFWorkbook();// hazfızada workbook oluştur.
            XSSFSheet sheet = workbook.createSheet(sheetName);// hazıfazda sheet oluştur

            Row row = sheet.createRow(0);// satır oluştur

            Cell cell = row.createCell(0);
            cell.setCellValue(scenario.getId());

            cell = row.createCell(1);
            cell.setCellValue(scenario.getStatus());

            cell = row.createCell(2);
            cell.setCellValue(browserName);

            cell = row.createCell(3);
            cell.setCellValue(time);

            // dosyayı oluşturduk.
            FileOutputStream outputStream = null;
            try {
                outputStream = new FileOutputStream(path);
                workbook.write(outputStream);// içine hafızadaki bilgileri yazdık.
                workbook.close(); // hafızayı boşalttık
                outputStream.close();// dosyayı kapattık.
            } catch (IOException e) {
                e.printStackTrace();
            }

        } else {  // dosya var ise
            // en son satır sayısını bulup bir fazlasını verip row oluşturup oraya yazıcam

            FileInputStream inputStream = null;
            Workbook workbook = null;
            try {
                inputStream = new FileInputStream(path);
                workbook = WorkbookFactory.create(inputStream);
            } catch (IOException e) {
                e.printStackTrace();
            }

            Sheet sheet = workbook.getSheet(sheetName);

            // calisma sayfasındaki toplam satır sayısını veriyor.
            int rowCount = sheet.getPhysicalNumberOfRows();

            Row row = sheet.createRow(rowCount);// var olan bir excel'e yazdığımız iiçim kaldığı  satırdan
            // devam ederek oluşturması için satır sayısından yani rowCount
            //değişkeninden itibaren hücre oluşturuyoruz.
            Cell cell = row.createCell(0);
            cell.setCellValue(scenario.getId());

            cell = row.createCell(1);
            cell.setCellValue(scenario.getStatus());

            cell = row.createCell(2);
            cell.setCellValue(browserName);

            cell = row.createCell(3);
            cell.setCellValue(time);

            // dosyayı oluşturduk.
            FileOutputStream outputStream = null;
            try {
                inputStream.close();
                outputStream = new FileOutputStream(path);
                workbook.write(outputStream);// içine hafızadaki bilgileri yazdık.
                workbook.close(); // hafızayı boşalttık
                outputStream.close();// dosyayı kapattık.
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
