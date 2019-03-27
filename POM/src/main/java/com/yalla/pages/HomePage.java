package com.yalla.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.yalla.testng.api.base.Annotations;

import cucumber.api.java.en.And;

public class HomePage extends Annotations{ 
	
	public HomePage() {
       PageFactory.initElements(driver, this);
	} 

	@FindBy(how=How.CLASS_NAME, using="decorativeSubmit") WebElement eleLogout;
	@FindBy(how=How.LINK_TEXT, using="CRM/SFA") WebElement eleCRMSFA;
	
	public LoginPage clickLogout() {
		//WebElement eleLogout = locateElement("class", "decorativeSubmit");
		click(eleLogout);  
		return new LoginPage();

	}
	
	@And("Click on the CRMSFA link")
	public MyHomePage clickCRMSFALink() {
		click(eleCRMSFA);
		return new MyHomePage();
	}

}







