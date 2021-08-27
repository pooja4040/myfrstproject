package Seleniumadva.Seleniumadva;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;





public class ApacheReader {

	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver;

		driver=new ChromeDriver();

		driver.manage().window().maximize();
		
	
		 File file = new File("C:\\Users\\edavelli.poojareddy\\OneDrive - HCL Technologies Ltd\\Documents\\userdata.xlsx");
		 
		 FileInputStream fs=new FileInputStream(file);
		
         XSSFWorkbook workbook = new XSSFWorkbook(fs);
         
          XSSFSheet sheet = workbook.getSheetAt(0);
//         Row row = sheet.getRow(1);
//         Cell cell = row.getCell(1);
//         System.out.println(sheet.getRow(0).getCell(0));
//         

         
         
         int lastRow = sheet.getLastRowNum();
       
         System.out.println("Last row- "+lastRow);
         
         for(int i=1;i <= lastRow;i++)
         {
             
                String username= sheet.getRow(i).getCell(0).toString();
                String password= sheet.getRow(i).getCell(1).toString();
                
                System.out.println("rowvalue:"+username);
                System.out.println("rowvalue:"+password); 
                
                driver.get("https://phptravels.org/index.php?rp=/login");
                 
                driver.findElement(By.id("inputEmail")).sendKeys(username);
                driver.findElement(By.id("inputPassword")).sendKeys(password);
                 
                driver.findElement(By.xpath("//*[@id='login']")).click();
                 
             
         }
         
             
        

    

     }
   



     }



   
    
         
//         
//		XSSFSheet sheet=workbook.getSheetAt(0);
//		
//		int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
//		
//		sheet.getRow(1).getCell(0);
//		
//		
//
//	   
//	    for (int i=1;i<=rowCount;i++) {
//	    	
//	    	XSSFRow cellcount=sheet.getRow(i);
//	    	
//	    	
//    	 System.out.println("Row"+ i+" data is :");
//	           
//	            for(int j=0;j<=cellcount; j++){
//	            	
//	                System.out.print(sheet.getRow(i).getCell(j).getStringCellValue() +",");
//	            }
//	            System.out.println();
	        
      // String username=sheet.getRow(i);
    //   String password=sheet.get
////        
//        driver.get("https://phptravels.org/index.php?rp=/login");
//        
//        driver.findElement(By.id("inputEmail")).sendKeys("username");
//		 
//		 driver.findElement(By.id("inputPassword")).sendKeys("password");
//		 
//		 driver.findElement(By.xpath("//*[@id='login']")).click();
//        
        
        
        
	

		
		
	

	


