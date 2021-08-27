package Example;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Cookies {
	
	 @Test
	  public void f() throws InterruptedException {
		  
		  System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");

		  WebDriver driver;
		  
		  driver=new ChromeDriver();
		  
		  driver.get("https://www.flipkart.com/");
		  
		  Cookie cookie =new Cookie("frstcookie", "123456789");
		  
		  driver.manage().addCookie(cookie);
		  
		  driver.manage().deleteCookieNamed("gpv_pn_t");
		  
		  Set<Cookie> cookie1 = driver.manage().getCookies();
		  
		  File file1=new File("C:\\Users\\edavelli.poojareddy\\OneDrive - HCL Technologies Ltd\\Desktop\\Cookies\\cookie.data");
			 try {
		 file1.createNewFile();
		 FileWriter fw=new FileWriter(file1);
		 BufferedWriter bw=new BufferedWriter(fw);
		
			  for(Cookie ck:driver.manage().getCookies()) {
			 bw.write((ck.getName()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.isSecure()+";"+ck.getValue()));
			 bw.newLine();

			 }
			 bw.close();
			 fw.close();
			 }
			 catch(Exception e) {
			 System.out.println(e);
		 }
	 }
		  
		
		
}
