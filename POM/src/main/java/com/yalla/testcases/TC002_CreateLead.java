package com.yalla.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.yalla.pages.LoginPage;
import com.yalla.testng.api.base.Annotations;

public class TC002_CreateLead extends Annotations{
	
	@BeforeTest
	public void setData() {
		testcaseName = "TC002_CreateLead";
		testcaseDec = "Creating a Lead";
		author = "Siva";
		category = "smoke";
		excelFileName = "TC001_CreateLead";
	} 

	@Test(dataProvider="fetchData") 
	public void createLead(String uName, String pwd, String cName, String fName, String lName, String mail) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassWord(pwd)
		.clickLogin()
		.clickCRMSFALink()
		.clickonLeads()
		.clickOnCreateLead()
		.enterCompanyName(cName)
		.enterFirstName(fName)
		.enterLastName(lName)
		.selectIndustry()
		.enterEmail(mail)
		.clickCreateLeadButton()
		.verifyTitle("View Lead");
		
		/*LoginPage lp = new  LoginPage();
		lp.enterUserName();
		lp.enterPassWord();*/
		
	}
	
}






