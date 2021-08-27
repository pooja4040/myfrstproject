package Seleniumadva.Seleniumadva;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class unorderlist {
  @Test
  public void f() throws InterruptedException {
	  

	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");

	  WebDriver driver;
	  
	  driver=new ChromeDriver();
	  
	  driver.get("http://demo.automationtesting.in/AutoComplete.html");
	  
	  driver.manage().window().maximize();
	  
	  driver.findElement(By.id("searchbox")).sendKeys("P");
	  
	  Thread.sleep(10000);
	  
	  //List<WebElement> element=driver.findElements(By.xpath("//ul[@id='@ui-id-1']/li"));
	  
	  
	  List<WebElement> element = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
	  
	  int length=element.size();
		
		System.out.println(length);
		
		Thread.sleep(4000);
		
		for(WebElement list_values:element)
		{
			if(list_values.getText().equalsIgnoreCase("Japan")&&list_values.getText().equalsIgnoreCase("Cyprus")){
				
				list_values.click();
				
				break;
			}
		}
	  
	  
  }
}
