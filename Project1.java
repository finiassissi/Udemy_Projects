package com.practiseProject.Grocery;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Project1 {
	public static void main(String args[]) throws InterruptedException {

/*System.setProperty("webdriver.chrome.driver","/home/fini/Downloads/chromedriver");
		    WebDriver driver=new ChromeDriver();*/
		    
	    System.setProperty("webdriver.chrome.driver","/home/fini/Downloads/chromedriver");
	    WebDriver driver=new ChromeDriver();
		   /* System.setProperty("webdriver.gecko.driver","/home/fini/Downloads/geckodriver");
			WebDriver driver=new FirefoxDriver();*/
		    driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		    Thread.sleep(1000);

		    driver.findElement((By.xpath("(//div[@class='product-action']/button)[1]"))).click();
		    
		    driver.findElement(By.xpath("(//div[@class='product-action']/button)[2]")).click();
		    driver.findElement(By.xpath("(//div[@class='product-action']/button)[5]")).click();
		    driver.findElement(By.xpath("//*[@alt='Cart']")).click();
		    Thread.sleep(1000);


		    
		    
		    driver.findElement(By.xpath("//*[text()='PROCEED TO CHECKOUT']")).click();
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("//div/button[text()='Place Order']")).click();
		    
		    Select drpDown=new Select(driver.findElement(By.xpath("//div[@class='wrapperTwo']/div/select")));
		    drpDown.selectByVisibleText("United States");
		    
		    WebElement chkbox=driver.findElement(By.xpath("//*[@type='checkbox']"));
		    chkbox.click();
		    System.out.println(chkbox.isSelected());
		    driver.findElement(By.xpath("//*[text()='Proceed']")).click();
		    driver.close();

		    
		    
		    
		    
		 //  WebElement finalscren= driver.findElement(By.xpath("//*[text()='Thank you. Your order has been placed successfully ...!!! ']"));
		  // System.out.println(finalscren.isDisplayed());

		    
		   // driver.findElement(By.xpath("//*[text()='Place Order']")).click();

		    
			//driver.findElement(By.xpath("//div[@id='root']/div/div[1]/div/div[2]/div[3]/button")).click();
			//driver.findElement(By.xpath("//*[@class='products']/div[3]/div[3]/button")).click();

		    
			//driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[3]/div[3]/button[1]")).click();
			//driver.findElement(By.xpath("//div[@id='root']/div/div[1]/div/div[2]/div[3]/button")).click();
			//driver.findElement(By.xpath("//*[@class='products']/div[2]/div[3]/button\n")).click();
			
			
			
			
			//Using text() and parent traversing
			//driver.findElement(By.xpath("//*[text()='Apple - 1 Kg']/parent::div/div[3]/button")).click();
			//driver.findElement(By.xpath("//*[text()='Cucumber - 1 Kg']/parent::div/div[3]/button")).click();

			   
			//driver.close();

		    
		    
	}

}