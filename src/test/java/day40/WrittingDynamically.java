package day40;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WrittingDynamically {
	
	public static void main(String[] args) throws IOException {
		
        FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myfile1.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("Data1");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number of Row :- ");
		int noOfRows = sc.nextInt();
		
		System.out.println("Enter Number of Cells");
		int noOfCells = sc.nextInt();
		
		for(int r = 0; r<= noOfRows; r++) {
			XSSFRow row=sheet.createRow(r);
			for(int c = 0; c < noOfCells; c++) {
			XSSFCell cell=row.createCell(c);
			cell.setCellValue(sc.next());
			}
		}
		workbook.write(file);
		workbook.close();
		file.close();
		
		System.out.println("File is created");
		
	}

}
