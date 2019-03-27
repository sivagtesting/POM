package com.yalla.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import com.yalla.testng.api.base.Annotations;

import cucumber.api.java.en.And;

public class CreateLeadPage extends Annotations {

	public CreateLeadPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "createLeadForm_companyName")
	WebElement eleCName;
	@FindBy(how = How.ID, using = "createLeadForm_firstName")
	WebElement eleFName;
	@FindBy(how = How.ID, using = "createLeadForm_lastName")
	WebElement eleLName;
	@FindBy(how = How.ID, using = "createLeadForm_industryEnumId")
	WebElement eleIndustry;
	@FindBy(how = How.ID, using = "createLeadForm_primaryEmail")
	WebElement eleMail;
	@FindBy(how = How.NAME, using = "submitButton")
	WebElement eleCreateLeadButton;

	@And("Enter CompanyName as (.*)")
	public CreateLeadPage enterCompanyName(String cName) {
		clearAndType(eleCName, cName);
		return this;
	}

	@And("Enter FirstName as (.*)")
	public CreateLeadPage enterFirstName(String fName) {
		clearAndType(eleFName, fName);
		return this;
	}

	@And("Enter LastName as (.*)")
	public CreateLeadPage enterLastName(String lName) {
		clearAndType(eleLName, lName);
		return this;
	}

	@And("Select Industry")
	public CreateLeadPage selectIndustry() {
		/*
		 * int count = 0; WebElement dropDown =
		 * driver.findElementById("createLeadForm_industryEnumId"); Select dd1 = new
		 * Select(dropDown); List<WebElement> options = dd1.getOptions(); for (int j =
		 * 0; j < options.size(); j++) { String text = options.get(j).getText(); //
		 * System.out.println(text); // System.out.println(text.charAt(0)); // char c =
		 * text.charAt(0) ; if (text.charAt(0) == 'C') {// not working count++; } if
		 * (count == 2) { dd1.selectByIndex(j); break; }
		 * 
		 * }
		 */

		selectDropDownUsingIndex(eleIndustry, 2);
		return this;
	}

	@And("Enter email as (.*)")
	public CreateLeadPage enterEmail(String mail) {
		clearAndType(eleMail, mail);
		return this;
	}
	
	
	@And("Click on Createlead Button")
	public ViewLeadsPage clickCreateLeadButton() {
		click(eleCreateLeadButton);
		return new ViewLeadsPage();
	}

}
