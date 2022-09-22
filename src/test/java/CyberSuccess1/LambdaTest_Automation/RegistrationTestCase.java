package CyberSuccess1.LambdaTest_Automation;

import org.testng.annotations.Test;


import LambdaTest_Pages.RegistrationPage;
import net.bytebuddy.implementation.bind.annotation.BindingPriority;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;
//Opening browser with the given URL and navigate to Registration Page
public class RegistrationTestCase extends BaseClass {
	  RegistrationPage registrationPage=new RegistrationPage();
	  

  @Test
  public void registrationTest()  {
	  registrationPage.registrationByXpath("Rani Kishor Divekar","ranidivekar97@gmail.com","Rani@123","8485031729");
  }
  @Test(priority = 1)
  public void withoutfullname() {
	  registrationPage.withoutFullName("","ranidivekar97@gmail.com","Rani@123","8485031729");
  }
  @Test(priority = 2)
  public void withoutemailid() {
	  registrationPage.withoutEmailId("Rani Kishor Divekar ","","Rani@123","8485031729");
  }
  @Test(priority = 3)
  public void withoutpassword() {
  registrationPage.withoutpassword("Rani Kishor Divekar ","ranidivekar97@gmail.com","Rani@123","8485031729");
  }
  @Test(priority = 4)
  public void withoutPhone() {
  registrationPage.withoutPhone("Rani Kishor Divekar ","ranidivekar97@gmail.com","Rani@123","");  
  }
  @Test(priority = 5)
  public void invalidmail() {
  registrationPage.withoutPhone("Rani Kishor Divekar ","ranidivekar$%&97@gmail.com","Rani@123","8485031729");  
	  
  }
  @Test(priority = 6)
  public void invalipassword() {
  registrationPage.withoutPhone("Rani Kishor Divekar ","ranidivekar$%&97@gmail.com","Rani@654321","8485031729");  
	  
  }
  @Test(priority = 7)
  public void invaliphoneTest() {
  registrationPage.withoutPhone("Rani Kishor Divekar ","ranidivekar$%&97@gmail.com","Rani@654321","848503172954");  
	  
  }

  //Opening browser with the given URL and navigate to Registration Page
  @BeforeMethod
  @Parameters({"browser"})
  public void beforeMethod(String browser) {
	  launchBrowsers(browser);
	  driver.get("https://www.lambdatest.com");  
  }
//Closing the browser session after completing each test case
  @AfterMethod
  public void afterMethod() {
	  try {
		Thread.sleep(2000l);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	  driver.quit();
  }

}
