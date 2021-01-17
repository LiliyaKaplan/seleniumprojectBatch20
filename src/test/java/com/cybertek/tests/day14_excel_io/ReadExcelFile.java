package com.cybertek.tests.day14_excel_io;

import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

public class ReadExcelFile {

    public static void main(String[] args) throws IOException {

    String path = "vytrack_testusers.xlsx";
    File file = new File(path);
        // step1: create excel file object
        Workbook workbook = WorkbookFactory.create(file);
        int numOfSheets = workbook.getNumberOfSheets();
        System.out.println("Number of Sheets: "+ numOfSheets);
        // step2: create object of spreadsheet
        Sheet sheet = workbook.getSheet("QA3-short");
        // step3: read a row
        Row row1 = sheet.getRow(0);
        // step4: read a cell
        Cell cell1 = row1.getCell(0);
        // step5: extract value
        String value1 = cell1.getStringCellValue();
        // step6: use value
        System.out.println("Value of 1st column is: "+value1);
        //get all spreadsheet names
        //sh - temporary variable
        workbook.forEach(sh -> System.out.println(sh.getSheetName()));
        // how do we get a data from entire row?
               Iterator<Cell> cellIterator = row1.cellIterator();
                while (cellIterator.hasNext()) {
                   String value = cellIterator.next().getStringCellValue();
                    System.out.print(value + " ");
                }
              System.out.println("\n####################");
                //return iterator of rows
                Iterator<Row> rowIterator = sheet.rowIterator();
                while (rowIterator.hasNext()) {
                    Iterator<Cell> tempCellIterator = rowIterator.next().cellIterator();
                    while (tempCellIterator.hasNext()) {
                        String value = tempCellIterator.next().getStringCellValue();
                        System.out.print(value + " ");
                    }
                    System.out.println();
                }

    }
}
