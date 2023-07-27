package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(name="searchbar")
	WebElement searchBox;
	
	@FindBy(id="button-search")
	WebElement searchBtn;
	
	@FindBy(id="cart")
	WebElement cartBtn;
	
	public void searchItem(String strItem) {
		searchBox.sendKeys(strItem);
	}
}
