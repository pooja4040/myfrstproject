package Seleniumadva.Seleniumadva;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;



public class JXLReaddata {
	
	
	public static void main(String[] args) throws BiffException, IOException {

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver;

		driver=new ChromeDriver();

		driver.manage().window().maximize();


		Workbook w1= Workbook.getWorkbook(new File("C:\\Users\\edavelli.poojareddy\\OneDrive - HCL Technologies Ltd\\Desktop\\usersdata.xls"));
		Sheet s1=w1.getSheet(0);

        for (int i=1;i <s1.getRows();i++) {
        String username=s1.getCell(0,i).getContents();
        String password=s1.getCell(1,i).getContents();
        
        driver.get("https://phptravels.org/index.php?rp=/login");
        
        driver.findElement(By.id("inputEmail")).sendKeys("username");
		 
		 driver.findElement(By.id("inputPassword")).sendKeys("password");
		 
		 driver.findElement(By.xpath("//*[@id='login']")).click();
        
        
        }
        
	}

}
