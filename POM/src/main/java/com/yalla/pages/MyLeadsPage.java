package com.yalla.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.yalla.testng.api.base.Annotations;

import cucumber.api.java.en.And;


public class MyLeadsPage extends Annotations{ 
	
	public MyLeadsPage() {
		PageFactory.initElements(driver, this); 
	}
	
	
	@FindBy(how=How.LINK_TEXT, using="Create Lead") WebElement eleCreateLead;
	
	@And("Click on CreateLead link")
	public CreateLeadPage clickOnCreateLead() {
		click(eleCreateLead);
		return new CreateLeadPage();
	}
	
	
	
	
}







