package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");

	  WebDriver driver;
	  
	  driver=new ChromeDriver();
  driver.get("https://www.google.co.in/");
  
  
  }
}
