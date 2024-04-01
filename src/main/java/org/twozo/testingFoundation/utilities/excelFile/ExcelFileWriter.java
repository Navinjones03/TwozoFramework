package org.twozo.testingFoundation.utilities.excelFile;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class ExcelFileWriter {

    private static final String sheetName = "Sheet1";
    private static ExcelFileWriter excelFileWriter;

    ExcelFileWriter() {
    }

    public static ExcelFileWriter getInstance() {
        if (excelFileWriter == null) {
            excelFileWriter = new ExcelFileWriter();
        }
        return excelFileWriter;
    }

    public String[][] writeTestResults(final String path, final String[][] testData) throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream(path);
             Workbook workbook = new XSSFWorkbook(fileInputStream)) {
             Sheet sheet = workbook.getSheet(sheetName);

            for (int rowIndex = 0; rowIndex < testData.length; rowIndex++) {
                final Row row = sheet.getRow(rowIndex);

                final Cell cell = row.createCell(2);
                cell.setCellValue(testData[rowIndex][1]);

            }

            try(FileOutputStream outputStream = new FileOutputStream(path)) {
                workbook.write(outputStream);
            }
            catch (IOException e) {
                e.printStackTrace();
            }


        }

        return testData;
    }
}

