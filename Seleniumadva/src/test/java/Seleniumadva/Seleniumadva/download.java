package Seleniumadva.Seleniumadva;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class download {
	
	@Test
	  public void f() throws InterruptedException {
		  
		  System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");

		  WebDriver driver;
		  
		  driver=new ChromeDriver();
		  
		 driver.manage().window().maximize(); 
		  
	  driver.get("http://www.leafground.com/");
	  
	  JavascriptExecutor jse =(JavascriptExecutor)driver;
			  jse.executeScript("scroll(0,800)");
			  
			  driver.findElement(By.linkText("DownLoad Files")).click();
			  
			  driver.findElement(By.linkText("Download Excel")).click();
			  
			  Thread.sleep(6000);
			  
			  File flocation=new File("C:\\Users\\edavelli.poojareddy\\Downloads");
			  
			  File[] total_files= flocation.listFiles();
			  
//			  
//			  for (File listOfFile : listOfFiles) {
//			         if (listOfFile.isFile()) {
//			              String fileName = listOfFile.getName();
//			               System.out.println("File " + listOfFile.getName());
//			               if (fileName.matches("5MB.zip")) {
//			                   f = new File(fileName);
//			                   found = true;
//			                }
//			            }
//			        }
			  
			  for(File file:total_files){
				  
				 if(file.isFile()){
					  String filename= file.getName();
					  System.out.println(file.getName());
					  
					
					  
					  if(file.getName().matches("testleaf.xlsx")){
						  System.out.println("file downloaded successfuly");
						  break;
					  }
				  }
				  
				 
			  }
			  
			  
	}
}
		 
	  
	 


