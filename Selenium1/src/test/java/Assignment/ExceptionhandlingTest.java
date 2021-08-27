package Assignment;

import java.io.FileNotFoundException;
import java.io.FileReader;

import org.junit.Ignore;

//import static org.junit.Assert.*;

import org.junit.Test;
@Ignore
public class ExceptionhandlingTest {

	Exceptionhandling exec=new Exceptionhandling();

   @Test(expected=ArithmeticException.class)
   public void Exceptionhandling() {
    
      exec.AREC(5,0);
       
   
        }
   

   @Test(expected=NullPointerException.class)
   public void testNullPointerException() {
	   exec.nullpointer( null);
       }
   
   @Test(expected=StringIndexOutOfBoundsException.class)
   public void testStringIndexOut() {
	   exec.stringindexout("HI");
       }
   
   @Test(expected=FileNotFoundException.class)  
   public void testFileNotFound() throws FileNotFoundException {
       
           FileReader f=new FileReader(exec.filenotfound("C://Pooja.txt"));
       
       }
   @Test(expected=NumberFormatException.class)
   public void testNumberFormat(){
	   exec.numberformat("Yuvan");
   }
   
   @Test(expected=ArrayIndexOutOfBoundsException.class)
   public void testArrayIndexOutOfBound(){
	   exec.arrayindexout(new int[]{11,12,13,14,15,16,17,18});
   }
}
   
  

  


