package Seleniumadva.Seleniumadva;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Webdriver {
  @Test
  public void f() throws IOException {
	  
  FileInputStream file = new FileInputStream("src\\test\\java\\Seleniumadva\\Seleniumadva\\Config.properties");
  
  Properties proper=new Properties();
  
  proper.load(file);
 
 
String browser_name= proper.getProperty("browser");
String Driver_path = proper.getProperty("driver_path");
WebDriver driver;
 
 if(browser_name.equalsIgnoreCase("chrome")){
	 System.setProperty("webdriver.chrome.driver",Driver_path);
		 driver=new ChromeDriver();
		 
		 }
 
 else if(browser_name.equalsIgnoreCase("firefox")){
	 System.setProperty("webdriver.geko.driver",Driver_path);
	 driver=new FirefoxDriver();
	 
	 }
	 else {
		 System.setProperty("webdriver.ie.driver",Driver_path);
		   driver=new InternetExplorerDriver();
		   
		   
} 
 
	 driver.get("http://www.leafground.com/pages/download.html");
	  
	  driver.findElement(By.linkText("Download Excel")).click();
 }
		 
 }
			  
	  
  