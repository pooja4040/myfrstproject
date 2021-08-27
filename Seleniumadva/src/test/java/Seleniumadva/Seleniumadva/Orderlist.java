package Seleniumadva.Seleniumadva;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Orderlist {
  @Test
  public void f() {
	  
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	  		  
	  		  WebDriver driver;
	  		  
	  		driver=new ChromeDriver();
	  		  
	  		driver.get("http://www.leafground.com/pages/selectable.html");
	  		  
	  		  List<WebElement> element1=driver.findElements(By.xpath("//ol[@id='selectable']/li"));
	  		  
	  		  int length=element1.size();
	  		  
	  		  System.out.println(length);
	  		  
	  		  
	  		  Actions act1=new Actions(driver);
	  		  
	  		  act1.keyDown(Keys.CONTROL)
	  		      .click(element1.get(0))
	  		      .click(element1.get(2))
	  		      .click(element1.get(4))
	  		      .click(element1.get(6)).build().perform();
	  			  
	  		  }
	  		  
}

 

