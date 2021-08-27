package Assignment;

//import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

//import Com.Example.Calculator;

public class CalculatorTest {

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}


	
	CalculatorTest calc=new CalculatorTest();
	//public String Valid;
	
	@BeforeClass
	public static void SetupBeforeClass() throws Exception{
	System.out.println("Print before Class");
	}

	@AfterClass
	public static void SetupAfterClass() throws Exception{
	System.out.println("Print after Class");
	}
	
	@Before
	public void before(){
		System.out.println("Print before Method");
	}
	
	@After
	public void after(){
		System.out.println("Print after Method");
	}
	
	@Test
	public void testSub() {
		//assertEquals(0, calc.sub(5, 5));
		//assertNotEquals(1, calc.sub(5, 5));
		//assertFalse(calc.sub(5, 5)==1);
		//assertTrue(calc.sub(5, 5)==0);
		//assertSame("Valid", 0, calc.sub(5, 5));  // why valid ??
		//assertNull(null, calc.sub(5, 5)==0);  // check ??
		//assertNotSame(1, calc.sub(5, 5));
		
	}
   @Ignore
	@Test
	public void testMul() {
		//assertEquals(25, calc.mul(5, 5));
	}


	@Test(timeout=10000)
	public void test() {
		int i;
		i=1;
		while(i==1) {
       System.out.println(i);
	}

	}
	

}
