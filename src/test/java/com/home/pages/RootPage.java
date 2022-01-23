package com.home.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RootPage {
	WebDriver driver;
	public RootPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(how = How.ID, using = "#nonActiveDExplore")
	  public WebElement explore;
	
	
	@FindBy(how = How.ID, using = "#nonActiveDKids")
	  public WebElement kids;
}
