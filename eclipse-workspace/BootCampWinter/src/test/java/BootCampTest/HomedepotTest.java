package BootCampTest;

import org.testng.annotations.Test;

import BootCamp_Homedepot.CreateAccount;
import BootCamp_Homedepot.Homepage;
import BootCamp_Homedepot.SignUp;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class HomedepotTest extends HomedepotCmnClass {
  @Test
  public void TestHomedepot() {
	  Homepage hp=new Homepage(driver);
	  hp.CreatenewAccount();
	  hp.RegisterAccount();
	  
	  CreateAccount ca=new CreateAccount(driver);
	  ca.TypeofAcct();
	  ca.SelecttoCont();
	  
	 SignUp su=new SignUp(driver);
	 su.emailinput("mnoor@gmail");
	 su.password("abc123");
	 su.zipcode("12345");
	 su.phonenumber("212-234-1234");
  }

}
