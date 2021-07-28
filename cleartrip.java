package com.practiseProject.Grocery;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class cleartrip {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","/home/fini/Downloads/geckodriver");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.cleartrip.com/");
	driver.manage().window().maximize();
	Thread.sleep(4000);
	
	//dropdown-adult count

	Select drpdown1=new Select(driver.findElement(By.xpath("//*[text()='Adults']/following-sibling::select")));
	drpdown1.selectByValue("3");
	Select drp2=new Select(driver.findElement(By.xpath("//div/div/h4[text()='Children']/following-sibling::select")));
	drp2.selectByValue("2");
	
	//calender-current date
	driver.findElement(By.xpath("//*[@class='flex flex-middle p-relative homeCalender']")).click();
	driver.findElement(By.xpath("//*[@aria-selected='true']/div")).click();
	//Hyperlink
	driver.findElement(By.partialLinkText("More options:")).click();
	
	//Airline dropdown
	//driver.findElement(By.xpath("//*[text()='Preferred Airline']/following-sibling::div")).sendKeys("Indi");
	driver.findElement(By.xpath("//div/input[@placeholder='Airline name']")).sendKeys("Indi");
	Thread.sleep(2000);
	
	List<WebElement> opt=driver.findElements(By.xpath("//div[@class='p-relative']/div/ul/li"));
	
	
	System.out.println(opt.isEmpty());
	System.out.println(opt.size());
	for(WebElement li1: opt)
	{
		if(li1.getText().equalsIgnoreCase("IndiGo (6E)"))
		{
			System.out.println(li1.getText());
			li1.click();
			break;
			
			
		}
		
	}
	//button-search flights
	driver.findElement(By.xpath("//button[text()='Search flights']")).click();
	Thread.sleep(2000);
	System.out.println(driver.findElement(By.xpath("//div[@class='col-24']/div/span")).getText());
	driver.findElement(By.xpath("//div[@class='col-24']/div/div/div")).click();
	driver.close();
	
	
	
	}
}
