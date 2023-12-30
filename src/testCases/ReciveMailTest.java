package testCases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Apputils.Apputils;

public class ReciveMailTest  extends Apputils 
{

	/*@Test
	public void recivemail()
	{
		System.out.println("this is recivemail");
	}*/
	
	
	@Parameters({"email","subject"})
	@Test
	public void Recivemail(String mail, String subject)
	{
		System.out.println("recive to mail:"+mail+"with the subject line"+subject);
	}
	
	
}
