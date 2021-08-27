package Seleniumadva.Seleniumadva;

import java.awt.AWTException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.read.biff.BiffException;

public class Apachewrite {
	

	public static void main(String[] args) throws InterruptedException, IOException, AWTException, BiffException {

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");

		WebDriver d1;

		d1=new ChromeDriver();

		d1.manage().window().maximize();

		String filepath=("C:\\Users\\edavelli.poojareddy\\OneDrive - HCL Technologies Ltd\\Desktop\\write.xlsx");
		
		File f1=new File(filepath);
		
		FileOutputStream fos=new FileOutputStream(f1);
		
		XSSFWorkbook work=new XSSFWorkbook();
		
		XSSFSheet  sheet=work.createSheet("write");
		
		Row row=sheet.createRow(8);
		
		Cell cell=row.createCell(5);
		
		cell.setCellType(CellType.STRING);
		
		cell.setCellValue("verified");
		
		work.write(fos);
        }
	}



