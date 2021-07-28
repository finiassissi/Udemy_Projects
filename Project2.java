package com.practiseProject.Grocery;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Project2 {

	public static void main(String[] args) throws InterruptedException {
		//https://rahulshettyacademy.com/dropdownsPractise/
		
		/*System.setProperty("webdriver.chrome.driver","/home/fini/Downloads/chromedriver");
	    WebDriver driver=new ChromeDriver();*/
		System.setProperty("webdriver.gecko.driver","/home/fini/Downloads/geckodriver");
		WebDriver driver=new FirefoxDriver();
	    driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	    Thread.sleep(1000);
	    //STATIC DROPDOWN-USING Select class
	    Select drpdown=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
	    drpdown.selectByIndex(1);
	   System.out.println(drpdown.getFirstSelectedOption().getText());
	   
	   //AUTO SUGGESTIVE DROPDOWN
	   driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("Uni");
	    
	    
	    
	    
	    
	    
	    
	    //DYNAMIC DROPDOWN-WITHOUT SELECT CLASS
	    driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	    driver.findElement(By.xpath("//a[@value='CJB']")).click();
	    //driver.findElement(By.partialLinkText("Coimbatore")).click();
	    driver.findElement(By.xpath("//a[@value='DEL']")).click();
	    
	    
	    
	    
	    
	    
	   // driver.close();
	}   
	    
	}


