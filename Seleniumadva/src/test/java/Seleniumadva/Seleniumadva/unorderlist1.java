package Seleniumadva.Seleniumadva;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class unorderlist1 {
  @Test
  public void f() throws InterruptedException {
	  
	
		  
		  System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");

  WebDriver driver;
  
  driver=new ChromeDriver();
  
  driver.get("http://demo.automationtesting.in/Selectable.html");
  
  //driver.manage().window().maximize();
  
  driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
  driver.findElement(By.linkText("Serialize")).click();
  List<WebElement> element=driver.findElements(By.xpath("//ul[@class='SerializeFunc']/li"));
  int length=element.size();
  System.out.println(length);
 
  Actions action=new Actions(driver);
  action.keyDown(Keys.CONTROL).click(element.get(1)).click(element.get(3)).
          click(element.get(5)).build().perform();
//		   
			  
	  
	  
	  
  }
}
