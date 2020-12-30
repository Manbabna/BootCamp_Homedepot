package BootCamp_Homedepot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUp {
	
	public WebDriver driver;
	
	@FindBy(id="email")
	WebElement email;
	@FindBy(id="password-input-field")
	WebElement psswrd;
	@FindBy(id="zipCode")
	WebElement zipcd;
	@FindBy(id="phone")
	WebElement phoneno;
	
	public SignUp(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
		public void emailinput(String em) {
			WebDriverWait it=new WebDriverWait(driver, 10);
			it.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("email")));
			email.sendKeys(em);
		}
		public void password(String pw) {
			WebDriverWait it=new WebDriverWait(driver, 10);
			it.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("password-input-field")));
			psswrd.sendKeys(pw);
			
		}
		public void zipcode(String zp) {
			WebDriverWait it=new WebDriverWait(driver, 10);
			it.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("zipCode")));
			zipcd.sendKeys(zp);
		}
		public void phonenumber(String ph) {
			WebDriverWait it=new WebDriverWait(driver, 10);
			it.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("phone")));
			phoneno.sendKeys(ph);
		}
	}

	

