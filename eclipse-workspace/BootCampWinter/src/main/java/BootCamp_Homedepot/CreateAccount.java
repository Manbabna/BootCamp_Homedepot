package BootCamp_Homedepot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateAccount {
	
	public WebDriver driver;

	@FindBy(xpath = "(//*[@type='button'])[3]") 
	WebElement acctype;
	@FindBy(xpath = "//*[text()='Select & Continue']") 
	WebElement selcont;


	public CreateAccount(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}

	public void TypeofAcct() {
		acctype.click();
	}
	public void SelecttoCont() {
		
		selcont.click();
	}

}
