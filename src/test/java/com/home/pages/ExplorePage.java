package com.home.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ExplorePage extends RootPage {
	public ExplorePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	
	}

	@FindBy(how = How.XPATH, using = "//div[@id='channelCard-all-access']")
    public WebElement allAccessCard;
	
}
