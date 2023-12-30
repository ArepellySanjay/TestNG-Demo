
package testCases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Apputils.Apputils;

public class sendMailClass extends Apputils {

	/*@Test
	public void sendmail()
	{
	System.out.println("this is send mail test");
	}*/
	
	
	@Parameters({"email", "subject"})
	@Test
	public void sendmail(String mail, String subject)
	{
		System.out.println("Mail send to:"+mail+"with the subject line"+subject);
	}
	
	
	
	
	
	
}
