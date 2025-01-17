package com.demo.stepDefinition3;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class DemoFLoginStepDefinition 
{

	WebDriver driver;
	public  String currentDir = System.getProperty("user.dir");
	public  String chromepath = currentDir
			+ "//Resources//chromedriver.exe";
	
	@Given("^User hit login URL$")
	public void user_hit_login_URL(){
		System.out.println("*****testcase-1 executing*******");
		System.setProperty("webdriver.chrome.driver", chromepath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
	}

	@When("^User is in correct login page$")
	public void user_is_in_correct_login_page() {
		System.out.println("*****testcase-2 executing*******");
		String expectedTitle ="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!" ;
		String actualTitle= driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		
	}

	@Then("^User enters username and password$")
	public void user_enters_and(DataTable cred){
		System.out.println("*****testcase-3 executing*******");
		List<List<String>> credValue = cred.raw();
		driver.findElement(By.xpath("//input[@type='text' and @class='_2zrpKA']")).sendKeys(credValue.get(0).get(0));
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(credValue.get(0).get(1));
	}

	@Then("^User clicks on login button$")
	public void user_clicks_on_login_button() {
		System.out.println("*****testcase-4 executing*******");
		driver.findElement(By.xpath("//div[@class='_1avdGP']/button[@type='submit']")).click();
	}

	@Then("^User is on home page$")
	public void user_is_on_home_page() {
		System.out.println("*****testcase-5 executing*******");
		String expectedTitle ="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!" ;
		String actualTitle= driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
	}
	@Then("^Close the browser$")
	public void Close_the_browser() {
		System.out.println("*****testcase-5 executing*******");
		driver.quit();
	}
	
	
	
}
