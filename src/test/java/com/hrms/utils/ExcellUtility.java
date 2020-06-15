package com.hrms.utils;

import java.io.*;
import java.io.IOException;
import java.util.*;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

public class ExcellUtility {

	private static FileInputStream fis;
	private static Workbook workbook;
	private static Sheet sheet;

	public static void openExcel(String filePath) {
		try {
			fis = new FileInputStream(filePath);
			workbook = new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void loadSheet(String sheetName) {
		sheet = workbook.getSheet(sheetName);
	}

	public static int rowCount() {
		return sheet.getPhysicalNumberOfRows();
	}

	public static int colCount(int rownum) {
		return sheet.getRow(rownum).getLastCellNum();
	}

	public static String cellData(int rowIndex, int colIndex) {
		return sheet.getRow(rowIndex).getCell(colIndex).toString();
	}

	/**
	 * This Method is for converting Excel data into List of Maps
	 * @param filePath of Excel Data File
	 * @param sheetName of Excel Data File
	 * @return List of Map as a String
	 */
	public static List<Map<String, String>> excelInToMapList(String filePath, String sheetName) {

		openExcel(filePath);
		loadSheet(sheetName);

		List<Map<String, String>> listMap = new ArrayList<>();
		Map<String, String> mapExcel;

		for (int row = 1; row < rowCount(); row++) {
			mapExcel = new LinkedHashMap<>();

			for (int col = 0; col < colCount(row); col++) {
				String key = cellData(0, col);
				String value = cellData(row, col);

				mapExcel.put(key, value);
			}
			listMap.add(mapExcel);
		}

		return listMap;

	}

}
