package LambdaTest_Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import CyberSuccess1.LambdaTest_Automation.BaseClass;

public class RegistrationPage extends BaseClass {
	By exit_p_close = By.xpath("//span[@id='exit_popup_close']");
	By freeSignupButton=By.xpath("//header[@id='header']/nav/div/div/div[2]/div/div/div[2]/a[2]");
	By checkbox=By.xpath("//div[@id='app']/div[1]/div[2]/div[2]/div/div/div/form/div[5]/label/samp");
	By freesignup=By.xpath("//button[@data-testid='signup-button']");
	public void registrationByXpath(String fullName, String email, String Password, String phoneNo) {
		By exit_p_close = By.xpath("//span[@id='exit_popup_close']");
		Actions actions = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
			wait.until(ExpectedConditions.elementToBeClickable(exit_p_close));
			WebElement popclose = driver.findElement(exit_p_close);
			actions.doubleClick(popclose).build().perform();
		} catch (Exception e) {
			System.out.println("exit_popup_close is not display");}
		driver.findElement(freeSignupButton).click();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(fullName);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='userpassword']")).sendKeys(Password);
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys(phoneNo);
		driver.findElement(By.xpath("//div[@id='app']/div[1]/div[2]/div[2]/div/div/div/form/div[5]/label/samp")).click();
		driver.findElement(By.xpath("//button[@data-testid='signup-button']")).click();
		//	String expectedURL = "https://accounts.lambdatest.com/email/verify";
		String actualURL = driver.getCurrentUrl();
		//Assert.assertEquals(actualURL, expectedURL);
		//	String expectedTitle = "Verify Your Email Address - LambdaTest";
		String actualTitle = driver.getTitle();
		//	Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println(actualURL+".........."+actualTitle);
	}
	public void registrationById(String fullName, String email, String Password, String phoneNo) {
		Actions actions = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		try {wait.until(ExpectedConditions.elementToBeClickable(exit_p_close));
		WebElement popclose = driver.findElement(exit_p_close);
		actions.doubleClick(popclose).build().perform();
		} catch (Exception e) {
			System.out.println("exit_popup_close is not display");}
		driver.findElement(freeSignupButton).click();
		driver.findElement(By.id("name")).sendKeys(fullName);
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("userpassword")).sendKeys(Password);
		driver.findElement(By.id("phone")).sendKeys(phoneNo);
		driver.findElement(checkbox).click();
		driver.findElement(freesignup).click();
		String expectedURL = "https://accounts.lambdatest.com/email/verify";
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);
		String expectedTitle = "Verify Your Email Address - LambdaTest";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	public void registrationByClass(String fullName, String email, String Password, String phoneNo) {
		Actions actions = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		try {wait.until(ExpectedConditions.elementToBeClickable(exit_p_close));
		WebElement popclose = driver.findElement(exit_p_close);
		actions.doubleClick(popclose).build().perform();
		} catch (Exception e) {
			System.out.println("exit_popup_close is not display");}
		driver.findElement(freeSignupButton).click();
		driver.findElement(By.className("w-full tracking-custom xxld:text-size-20 xxl:text-size-18 xlx:text-size-16 xls:text-size-14 text-size-12 placeholder:text-gray-300 text-black rounded xxxl:px-24 xxl:px-18 px-12 flex items-center xxld:h-65 xxl:h-55 xlx:h-47 xls:h-40 h-35")).sendKeys(fullName);
		driver.findElement(By.className("w-full tracking-custom xxld:text-size-20 xxl:text-size-18 xlx:text-size-16 xls:text-size-14 text-size-12 placeholder:text-gray-300 text-black rounded xxxl:px-24 xxl:px-18 px-12 flex items-center xxld:h-65 xxl:h-55 xlx:h-47 xls:h-40 h-35")).sendKeys(email);
		driver.findElement(By.className("w-full tracking-custom xxld:text-size-20 xxl:text-size-18 xlx:text-size-16 xls:text-size-14 text-size-12 placeholder:text-gray-300 text-black rounded xxxl:px-24 xxl:px-18 px-12 flex items-center xxld:h-65 xxl:h-55 xlx:h-47 xls:h-40 h-35")).sendKeys(Password);
		driver.findElement(By.className("w-full tracking-custom xxld:text-size-20 xxl:text-size-18 xlx:text-size-16 xls:text-size-14 text-size-12 placeholder:text-gray-300 text-black rounded xxld:pl-140 xxl:pl-120 pl-100 flex items-center xxld:h-65 xxl:h-55 xlx:h-47 xls:h-40 h-35")).sendKeys(phoneNo);
		driver.findElement(checkbox).click();
		driver.findElement(freesignup).click();
		String expectedURL = "https://accounts.lambdatest.com/password/reset/pin/987960/3gc9DXVVX0vgmq7CJsTQXSLWek9NsOzrkT07Ob09xIbyozLJwMa5emVS76oF0DNZ";
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);

		String expectedTitle = "Verify Your Email Address - LambdaTest";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	public void verifyElemntsOnPageTest() {
		driver.findElement(freeSignupButton).click();
		WebElement name=driver.findElement(By.xpath("//input[@id='name']"));
		name.isDisplayed();
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		email.isDisplayed();
		WebElement password=driver.findElement(By.xpath("//input[@id='userpassword']"));
		password.isDisplayed();
		WebElement phone=driver.findElement(By.xpath("//input[@id='phone']"));
		phone.isDisplayed();
		WebElement chekBox=driver.findElement(By.xpath("//div[@id='app']/div[1]/div[2]/div[2]/div/div/div/form/div[5]/label/samp"));
		chekBox.isDisplayed();
		WebElement signButton=driver.findElement(By.xpath("//button[@data-testid='signup-button']"));
		signButton.isDisplayed();
	}
	public void withoutFullName(String fullName, String email, String Password, String phoneNo) {
		By exit_p_close = By.xpath("//span[@id='exit_popup_close']");
		Actions actions = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
			wait.until(ExpectedConditions.elementToBeClickable(exit_p_close));
			WebElement popclose = driver.findElement(exit_p_close);
			actions.doubleClick(popclose).build().perform();
		} catch (Exception e) {
			System.out.println("exit_popup_close is not display");}
		driver.findElement(freeSignupButton).click();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(fullName);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='userpassword']")).sendKeys(Password);
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys(phoneNo);
		driver.findElement(By.xpath("//div[@id='app']/div[1]/div[2]/div[2]/div/div/div/form/div[5]/label/samp")).click();
		driver.findElement(By.xpath("//button[@data-testid='signup-button']")).click();
		String expectedErrorMessage = "Please enter your name";
		String actualErrorMessage = driver.findElement(By.xpath("//div[@id='app']/div[1]/div[2]/div[2]/div/div/div/form/div[1]/p")).getText();
		Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
		System.out.println(actualErrorMessage);
	}        
	public void withoutEmailId(String fullName, String email, String Password, String phoneNo) {
		By exit_p_close = By.xpath("//span[@id='exit_popup_close']");
		Actions actions = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
			wait.until(ExpectedConditions.elementToBeClickable(exit_p_close));
			WebElement popclose = driver.findElement(exit_p_close);
			actions.doubleClick(popclose).build().perform();
		} catch (Exception e) {
			System.out.println("exit_popup_close is not display");}
		driver.findElement(freeSignupButton).click();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(fullName);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='userpassword']")).sendKeys(Password);
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys(phoneNo);
		driver.findElement(By.xpath("//div[@id='app']/div[1]/div[2]/div[2]/div/div/div/form/div[5]/label/samp")).click();
		driver.findElement(By.xpath("//button[@data-testid='signup-button']")).click();
		String expectedErrorMessage = "Please enter your email address";
		String actualErrorMessage = driver.findElement(By.xpath("//p[text()='Please enter your email address']")).getText();
		Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
		System.out.println(actualErrorMessage);
	}
	public void withoutpassword(String fullName, String email, String Password, String phoneNo) {
		By exit_p_close = By.xpath("//span[@id='exit_popup_close']");
		Actions actions = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
			wait.until(ExpectedConditions.elementToBeClickable(exit_p_close));
			WebElement popclose = driver.findElement(exit_p_close);
			actions.doubleClick(popclose).build().perform();
		} catch (Exception e) {
			System.out.println("exit_popup_close is not display");}
		driver.findElement(freeSignupButton).click();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(fullName);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
		//	driver.findElement(By.xpath("//input[@id='userpassword']")).sendKeys(Password);
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys(phoneNo);
		driver.findElement(By.xpath("//div[@id='app']/div[1]/div[2]/div[2]/div/div/div/form/div[5]/label/samp")).click();
		driver.findElement(By.xpath("//button[@data-testid='signup-button']")).click();
		String expectedErrorMessage = "Please enter a desired password";
		String actualErrorMessage = driver.findElement(By.xpath("//div[@id='app']/div[1]/div[2]/div[2]/div/div/div/form/div[3]/p")).getText();
		Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
		System.out.println(actualErrorMessage);
	} 
	public void withoutPhone(String fullName, String email, String Password, String phoneNo) {
		By exit_p_close = By.xpath("//span[@id='exit_popup_close']");
		Actions actions = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
			wait.until(ExpectedConditions.elementToBeClickable(exit_p_close));
			WebElement popclose = driver.findElement(exit_p_close);
			actions.doubleClick(popclose).build().perform();
		} catch (Exception e) {
			System.out.println("exit_popup_close is not display");}
		driver.findElement(freeSignupButton).click();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(fullName);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='userpassword']")).sendKeys(Password);
		//	driver.findElement(By.xpath("//input[@id='phone']")).sendKeys(phoneNo);
		driver.findElement(By.xpath("//div[@id='app']/div[1]/div[2]/div[2]/div/div/div/form/div[5]/label/samp")).click();
		driver.findElement(By.xpath("//button[@data-testid='signup-button']")).click();
		String expectedErrorMessage = "Please enter your phone";
		String actualErrorMessage = driver.findElement(By.xpath("//p[text()='Please enter your phone']")).getText();
		Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
		System.out.println(actualErrorMessage);
	} 
	public void withoutCheckBoxClick(String fullName, String email, String Password, String phoneNo) {
		By exit_p_close = By.xpath("//span[@id='exit_popup_close']");
		Actions actions = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
			wait.until(ExpectedConditions.elementToBeClickable(exit_p_close));
			WebElement popclose = driver.findElement(exit_p_close);
			actions.doubleClick(popclose).build().perform();
		} catch (Exception e) {
			System.out.println("exit_popup_close is not display");}
		driver.findElement(freeSignupButton).click();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(fullName);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='userpassword']")).sendKeys(Password);
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys(phoneNo);
		driver.findElement(By.xpath("//div[@id='app']/div[1]/div[2]/div[2]/div/div/div/form/div[5]/label/samp")).click();
		driver.findElement(By.xpath("//button[@data-testid='signup-button']")).click();
		String expectedErrorMessage = "You must agree to terms and conditions before continuing";
		String actualErrorMessage = driver.findElement(By.xpath("//div[text()='You must agree to terms and conditions before continuing']")).getText();
		Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
		System.out.println(actualErrorMessage);
	} 
	public void invalidEmailId(String fullName, String email, String Password, String phoneNo) {
		By exit_p_close = By.xpath("//span[@id='exit_popup_close']");
		Actions actions = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
			wait.until(ExpectedConditions.elementToBeClickable(exit_p_close));
			WebElement popclose = driver.findElement(exit_p_close);
			actions.doubleClick(popclose).build().perform();
		} catch (Exception e) {
			System.out.println("exit_popup_close is not display");}
		driver.findElement(freeSignupButton).click();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(fullName);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='userpassword']")).sendKeys(Password);
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys(phoneNo);
		driver.findElement(By.xpath("//div[@id='app']/div[1]/div[2]/div[2]/div/div/div/form/div[5]/label/samp")).click();
		driver.findElement(By.xpath("//button[@data-testid='signup-button']")).click();
		String expectedErrorMessage = "This Email is already registered";
		String actualErrorMessage = driver.findElement(By.xpath("//p[text() = 'This Email is already registered']")).getText();
		Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
		System.out.println(actualErrorMessage);
	} 
	public void inValidPasswordTest(String fullName, String email, String Password, String phoneNo) {
		By exit_p_close = By.xpath("//span[@id='exit_popup_close']");
		Actions actions = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
			wait.until(ExpectedConditions.elementToBeClickable(exit_p_close));
			WebElement popclose = driver.findElement(exit_p_close);
			actions.doubleClick(popclose).build().perform();
		} catch (Exception e) {
			System.out.println("exit_popup_close is not display");}
		driver.findElement(freeSignupButton).click();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(fullName);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='userpassword']")).sendKeys(Password);
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys(phoneNo);
		driver.findElement(By.xpath("//div[@id='app']/div[1]/div[2]/div[2]/div/div/div/form/div[5]/label/samp")).click();
		driver.findElement(By.xpath("//button[@data-testid='signup-button']")).click();
		String expectedErrorMessage = "";
		String actualErrorMessage = driver.findElement(By.xpath("")).getText();
		Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
		System.out.println(actualErrorMessage);
	}
	public void inValidPhoneTest(String fullName, String email, String Password, String phoneNo) {
		By exit_p_close = By.xpath("//span[@id='exit_popup_close']");
		Actions actions = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
			wait.until(ExpectedConditions.elementToBeClickable(exit_p_close));
			WebElement popclose = driver.findElement(exit_p_close);
			actions.doubleClick(popclose).build().perform();
		} catch (Exception e) {
			System.out.println("exit_popup_close is not display");}
		driver.findElement(freeSignupButton).click();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(fullName);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='userpassword']")).sendKeys(Password);
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys(phoneNo);
		driver.findElement(By.xpath("//div[@id='app']/div[1]/div[2]/div[2]/div/div/div/form/div[5]/label/samp")).click();
		driver.findElement(By.xpath("//button[@data-testid='signup-button']")).click();
		String expectedErrorMessage = "";
		String actualErrorMessage = driver.findElement(By.xpath("")).getText();
		Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
		System.out.println(actualErrorMessage);
	}
}
