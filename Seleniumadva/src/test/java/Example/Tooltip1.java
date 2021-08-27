package Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Tooltip1 {
  @Test
  public void f() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");

	  WebDriver driver;
	  
	  driver=new ChromeDriver();
	  
	  driver.get("http://www.leafground.com/");
	  
	  driver.findElement(By.linkText("Tool Tip")).click();
	  
//	  Actions actions =new Actions(driver);
	  
//	  WebElement element =driver.findElement(By.id("age"));
	  
//	  actions.moveToElement(element).perform();
	  
//	  Thread.sleep(4000);
	  
	
  WebElement toolTip = driver.findElement(By.xpath("//*[@id='age']"));
	  
	  String title = toolTip.getAttribute("title");
	  
	  Thread.sleep(4000);
	  
      Actions actions =new Actions(driver);
	  
	  WebElement element =driver.findElement(By.id("age"));
	  
	  actions.moveToElement(element).perform();
	  
	  Thread.sleep(4000);
	  
	  
	  
	  
	  //actions.doubleClick(toolTip).perform();
	  
	  //String toolTipText = toolTip.getText();
	  
	  System.out.println(title);
//	  
//	  if(toolTipText.equalsIgnoreCase("Enter your Name")){
//		  System.out.println("Pass");
//	  }else{
//	  System.out.println("Fail");
//	  }
	  
	  
	  
  }
}
