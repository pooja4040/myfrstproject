package Seleniumadva.Seleniumadva;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Futuredate {
	
	
	  @Test
	  public void f() {
		  
		  System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		  
		  WebDriver driver;
		  
		  driver=new ChromeDriver();
		  
		  driver.get("http://demo.automationtesting.in/Datepicker.html");
		  
		  driver.manage().window().maximize();
		  
		  JavascriptExecutor jse =(JavascriptExecutor) driver;
		  
		  jse.executeScript("document.getElementById('datepicker1').value='18/08/2021'");
		  
		  jse.executeScript("document.getElementById('datepicker2').value='18/08/2021'");
		
		  jse.executeScript("scroll(0,550)");
		  
		
	  }
	}



