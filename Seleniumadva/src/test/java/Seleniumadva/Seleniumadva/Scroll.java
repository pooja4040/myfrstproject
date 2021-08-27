package Seleniumadva.Seleniumadva;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scroll {
  @Test
  public void f() {
	  
	  
System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	  
	  WebDriver driver;
	  
	  driver=new ChromeDriver();
	  
	  driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
	  
	  driver.manage().window().maximize();
	  
	  JavascriptExecutor jse =(JavascriptExecutor) driver;
	  
	  WebElement element= driver.findElement(By.xpath("//*[@id='mCSB_3_container']/p[2]/input"));
	  
	  jse.executeScript("arguments[0].scrollIntoView(true);",element);
	  
	  element.clear();
	  
	  element.sendKeys("Pooja");
  


  }
}
