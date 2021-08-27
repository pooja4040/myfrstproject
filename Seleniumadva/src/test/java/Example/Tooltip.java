package Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tooltip {
  @Test
  public void f() {
	  
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");

	  WebDriver driver;
	  
	  driver=new ChromeDriver();
	  
	  driver.get("http://www.leafground.com/");
	  
	  driver.findElement(By.linkText("Tool Tip")).click();
	  
	  WebElement element =driver.findElement(By.id("age"));
	  
	  String tool_tip= element.getAttribute("title");
	  
	  System.out.println(tool_tip);
  }
}
