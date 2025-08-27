package day40;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException {

		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\testdata\\ForAutomation.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");

		int totalRow = sheet.getLastRowNum();
		int totalCell = sheet.getRow(1).getLastCellNum();

		System.out.println(totalCell);
		System.out.println(totalRow);

		for (int r = 0; r <= totalRow; r++) {

			XSSFRow currentRow = sheet.getRow(r);

			for (int c = 0; c < totalCell; c++) {

				XSSFCell cell = currentRow.getCell(c);
				System.out.print(cell.toString() + "\t");

			}
			System.out.println();
		}
		workbook.close();
		file.close();
	}
}
