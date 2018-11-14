package com.qa.feature;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.qa.pages.LoginPage;
import com.qa.utils.TestBase;

import cucumber.api.java.en.Given;

import cucumber.api.java.en.When;

public class StepDefinitions extends TestBase {
	
	
	@Given("^user is on Login page$")
	public void user_is_on_Login_page() {
		
		TestBase.initialization();
	    
	}

	@When("^user enters \"(.*)\" and \"(.*)$")
	public void user_enters_username_and_password(String username,String password) throws InterruptedException {
		//LoginPage log= new LoginPage();
		//log.login(prop.getProperty("username"), prop.getProperty("password"));
	   driver.findElement(By.name("username")).sendKeys(username);
	   driver.findElement(By.name("password")).sendKeys(password);
	   Thread.sleep(3000);
	  
	}
	   @When("^user navigate to login page$")
	   public void user_navigate_to_login_page() throws InterruptedException{
	   WebElement loginbtn= driver.findElement(By.xpath("//input[@type='submit']"));
	 //  JavascriptExecutor js= (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].click();",loginbtn);
	   loginbtn.click();
		
		
	}
	@When("^user click on Contacts$")
	public void user_click_on_Contacts()
	{
		driver.switchTo().frame("mainpanel");
	 driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		 driver.findElement(By.xpath("//input[@value='New Contact']")).click();
		 
		 
	}
	
	

	
	
}
