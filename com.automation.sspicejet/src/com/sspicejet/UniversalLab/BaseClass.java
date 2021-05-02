package com.sspicejet.UniversalLab;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pomObjectportfolio.HomeClassMember;
import pomObjectportfolio.Login;
public class BaseClass {
	public static WebDriver driver;
	public DataContainer picker= new DataContainer();
	@BeforeSuite
	public void Bs()
	{
		System.out.println("Db connect");
	}
	@BeforeTest
	public void confiBT() {
		System.out.println("B4 Test Case Dependancy");
	}
	@BeforeClass
	public void confiBc() throws IOException {
		String browser=picker.getDataFromProperty("browser");
		
		if(browser.equals("Chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equals("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		
		driver.get("https://www.spicejet.com/");
		//driver.get(picker.getDataFromProperty("url"));
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("Launch Browser");
	}
	
	@BeforeMethod
	public void confiBM() throws IOException {
		Login log=PageFactory.initElements(driver, Login.class);
		//WebElement login =driver.findElement(By.className("link"));
		    WebElement ll=log.getloginl();
		Actions act=new Actions(driver);
		act.moveToElement(ll).perform();
		
		//WebElement spiceclubmem=driver.findElement(By.linkText("SpiceClub Members"));
		WebElement spiceclubmem=log.getspmember();
		act.moveToElement(spiceclubmem).perform();
		log.getMlogin().click();
		//driver.findElement(By.linkText("Member Login")).click();
		
		//log.loginToSpiceJet();
		//driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("mandade.sh@gmail.com");
		//driver.findElement(By.className(sc-credential-login'))
		
	}
	
	/*@Test
	public void clickaction()
	{
		HomeClassMember hm= PageFactory.initElements(driver, HomeClassMember.class);
		hm.getLogo().click();
		System.out.println("sandip");
		
	}*/
	
	
	
	
	
	
	@AfterMethod
	public void confiAM() {
		
	System.out.println("Log out done");
	}
	@AfterClass
	public void confiAc() {
		//driver.quit();
		System.out.println("Closed Browser");
	}

	@AfterTest
	public void confiAT() {
		System.out.println("After Test Case Dependancy");
	}
	@AfterSuite
	public void confiAS() {
		System.out.println("Db dis-connect");
	}

}
