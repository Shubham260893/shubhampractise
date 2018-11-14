package com.qa.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	
	public  TestBase()
	{
		
		
		try{
			
			prop= new Properties();
			FileInputStream fis= new FileInputStream("D:/workspace/myproject/src/main/java/com/qa/config/config.properties");
				prop.load(fis);
			
		} catch(IOException e)
		{
			e.getMessage();
		}
		
	}
	
	public static void initialization()
	{
		
		String browser= prop.getProperty("browser");
		if(browser.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver","D:\\eclipse\\chromedriver.exe");
		 driver = new ChromeDriver();
		}
	
		
		else if(browser.equals("firefox"))
		{
		System.setProperty("webdriver.gecko.driver","D:\\eclipse\\geckodriver.exe");
		 driver = new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICITWAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
	}

	public static void initial()
	{
		String browser= prop.getProperty("browse");
		if(browser.equals("firefox"))
		{
		System.setProperty("webdriver.gecko.driver","D:\\eclipse\\geckodriver.exe");
		 driver = new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICITWAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
}}
