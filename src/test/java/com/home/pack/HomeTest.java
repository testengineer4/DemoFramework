package com.home.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.home.pages.ExplorePage;
import com.home.pages.HomePage;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeTest {
	WebDriver driver;
	HomePage homepage;
	ExplorePage explore;
	
	@Given("^user Launched to HomeSceen$")
	public void user_launched_to_home_sceen() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\OneDrive\\Documents\\Baseline_Web\\Selenium_BaselineWeb\\resources\\chromedriver.exe");
		 driver =new ChromeDriver();
		driver.manage().window().maximize();
		homepage =new HomePage(driver);
		driver.get("https://www.discoveryplus.in/");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	@When("^user Navigate to ([^\"]*) page$")
	public void user_navigare_to(String str) {
		//String	str="Explore";
	    if(str.equalsIgnoreCase("explore")) {
	    	homepage.explore.click();
	    }else if(str.equalsIgnoreCase("kids")) {
	    	homepage.kids.click();			
	    }else if(str.equalsIgnoreCase("shorts")) {
	    	System.out.println("i am in short");
	    }
	}
	
	
	@Then("^user is on ([^\"]*) page$")
	public void user_is_on(String str) {
		//String str="explore";
			System.out.println("pritn expect "+str);
		String actualUrl=driver.getCurrentUrl();
		System.out.println("actual url "+actualUrl);
		Assert.assertTrue(actualUrl.contains(str.toLowerCase()));

	}
	
	private void allAceess() {
		
		explore=new ExplorePage(driver);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//div[@id='channelCard-all-access']"));
		explore.allAccessCard.click();
	}
	
	@After
	public void cls() {
		driver.close();
	}
	
}
