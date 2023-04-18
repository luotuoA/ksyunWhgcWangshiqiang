package com.ksyun.whgc.wangshiqiang.secondQuestion;

import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CollectionPrinter {
    public static <T> void printToExcel(List<T> list, String fileName) {
        try (Workbook workbook = new XSSFWorkbook();
             FileOutputStream outputStream = new FileOutputStream(fileName)) {
            Sheet sheet = workbook.createSheet("Sheet1");
            Row headerRow = sheet.createRow(0);
            int colIndex = 0;
            for (Field field : list.get(0).getClass().getDeclaredFields()) {
                FieldName fieldName = field.getAnnotation(FieldName.class);
                if (fieldName != null) {
                    Cell cell = headerRow.createCell(colIndex);
                    cell.setCellValue(fieldName.value());
                    colIndex++;
                }
            }
            int rowIndex = 1;
            for (T obj : list) {
                Row row = sheet.createRow(rowIndex);
                colIndex = 0;
                for (Field field : obj.getClass().getDeclaredFields()) {
                    FieldName fieldName = field.getAnnotation(FieldName.class);
                    if (fieldName != null) {
                        field.setAccessible(true);
                        Cell cell = row.createCell(colIndex);
                        Object value = field.get(obj);
                        if (value instanceof String) {
                            cell.setCellValue((String) value);
                        } else if (value instanceof Number) {
                            cell.setCellValue(((Number) value).doubleValue());
                        } else if (value instanceof Date) {
                            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                            cell.setCellValue(format.format((Date) value));
                        }
                        colIndex++;
                    }
                }
                rowIndex++;
            }
            workbook.write(outputStream);
        } catch (IOException | IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println("输出完成");
    }
}
