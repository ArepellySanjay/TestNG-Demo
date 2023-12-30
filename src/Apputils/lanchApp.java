package Apputils;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class lanchApp 
{
   /*@BeforeSuite 
   public static void beforeLanch()
   {
	   System.out.println("before lanuch suit");
   }
	

   @AfterSuite 
   public static void afterLanch()
   {
	   System.out.println("After lanuch suit");
   }
	
//----------------------------------------------------------------------------------	
	
	
	
	@BeforeTest
	public void login()
	{
		System.out.println("Gmail login");
	}
	
	
	@AfterTest
	public void logout()
	{
		System.out.println("Gmail logout");
	}
	
	@BeforeSuite
	public void lanchApp()
	{
		System.out.println("lanch Gmail App");
	}
	
	@AfterSuite
	public void closeApp()
	{
		System.out.println("close Gmail App");
	}
	
	
	
}*/
	@BeforeSuite
   public void lanchApp() 
   {
	   System.out.println("Lanch application");
   }
	
	@BeforeTest
	public void login() 
	{
	System.out.println("gmail login");	
	}
	
	@AfterTest
	public void logout ()
	{
		System.out.println("gmail logout");
	}
	
	
	
	@AfterSuite
	public void closeApp()
	{
	System.err.println("closeApp");	
	}
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
