package org.twozo.util.excel;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelFileReader {

    private static final String path = "C:\\Users\\snjon\\Downloads\\userDetail.xlsx";
    private static final String sheetName = "Sheet1";
    private static ExcelFileReader excelFileReader;

    ExcelFileReader() {
    }

    public static ExcelFileReader getInstance() {
        if (excelFileReader == null) {
            excelFileReader = new ExcelFileReader();
        }

        return excelFileReader;
    }

    public String[][] readExcel(final String filepath, final String sheetName) {
        String[][] testData = null;

        try (FileInputStream fileInputStream = new FileInputStream(filepath);
             Workbook workbook = WorkbookFactory.create(fileInputStream)) {
            final Sheet sheet = workbook.getSheet(sheetName);
            final int rowCount = sheet.getPhysicalNumberOfRows();
            final int colCount = sheet.getRow(0).getLastCellNum();

            testData = new String [rowCount][colCount];

            for (int i = 1; i < rowCount; i++) {
                final Row row = sheet.getRow(i);

                for (int j = 0; j < colCount; j++) {
                    final Cell cell = row.getCell(j);

                    testData[i][j] = cell.getStringCellValue();
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return testData;
    }
}

