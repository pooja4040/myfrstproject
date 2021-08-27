package Seleniumadva.Seleniumadva;

import java.awt.AWTException;
//import java.awt.Dimension;
//import java.awt.Rectangle;
//import java.awt.Robot;
//import java.awt.Toolkit;
//import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

//import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class screenshot {
  @Test
  public void f() throws IOException, AWTException, InterruptedException {
	  
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	  WebDriver driver;
	  
	  driver=new ChromeDriver();
	  
	 driver.get("http://the-internet.herokuapp.com/javascript_alerts");
  
     driver.findElement(By.xpath("//*[@id='content']/div/ul/li[2]/button")).click();
  
      Thread.sleep(4000);
  
      // driver.switchTo().alert().accept();
  
  
  
  
  
//  Robot r1=new Robot();
//  Dimension sc_size=Toolkit.getDefaultToolkit().getScreenSize();
//  Rectangle rect1=new Rectangle(sc_size);
//  BufferedImage source=    r1.createScreenCapture(rect1);
//  File Destination=new File("C:\\Users\\edavelli.poojareddy\\OneDrive - HCL Technologies Ltd\\Desktop\\automationsshots\\screen1.jpg");
//  ImageIO.write(source, "jpg", Destination);
//  
  
  
 TakesScreenshot t1=(TakesScreenshot)driver;

	File Source=t1.getScreenshotAs(OutputType.FILE);

	File Destination=new File("C:\\Users\\edavelli.poojareddy\\OneDrive - HCL Technologies Ltd\\Desktop\\automationsshots\\screen2.jpg");

	FileHandler.copy(Source, Destination);
  
	  
	 
  }
  
}
