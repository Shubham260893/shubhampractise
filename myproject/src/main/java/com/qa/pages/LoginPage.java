package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utils.TestBase;

public class LoginPage extends TestBase {
	
	

	@FindBy(name="username")	
	WebElement username;

	@FindBy(name="password")	
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginbtn;
	
	
	public LoginPage(){
		
		PageFactory.initElements(driver, this);
		
	}
	
	/*public HomePage login(String un,String pass)
	{
		username.sendKeys(un);
	password.sendKeys(pass);
	
	JavascriptExecutor js= (JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();",loginbtn);
	
	return new HomePage();

}*/
	
}
