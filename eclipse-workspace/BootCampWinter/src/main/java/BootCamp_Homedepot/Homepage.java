package BootCamp_Homedepot;

import java.awt.print.PageFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage {
	
	public WebDriver driver;
	
	@FindBy(xpath = "(//*[text()='My Account'])[1]")
	WebElement myaccnt;
	@FindBy (xpath = "//span[contains(text(),'Register')]")
	WebElement rgstr;
	
	public Homepage (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void CreatenewAccount() {
		WebElement  myaccnt = driver.findElement(By.xpath("(//*[text()='My Account'])[1]"));               
		Actions act=new Actions(driver);
		act.moveToElement(myaccnt).click().build().perform();
	}
	public void RegisterAccount() {
		WebDriverWait it=new WebDriverWait(driver, 10);
		it.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//span[contains(text(),'Register')]")));
		rgstr.click();

	}

}
