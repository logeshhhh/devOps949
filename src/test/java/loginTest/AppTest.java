package loginTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import login.App;

public class AppTest 
{
	@Test(description="valid test")
	  public void validDataCheck() {
		  App ap=new App();
		  boolean status=ap.userLogin("userdemo", "password");
		  Assert.assertFalse(status);
		  
	  }
	@Test(description="invalid test")
	  public void invalidDataCheck() {
		  App ap=new App();
		  boolean status=ap.userLogin("userdemo", "password");
		  Assert.assertFalse(status);
		  
	  }
}