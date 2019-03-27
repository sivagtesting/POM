package runner;

import org.testng.annotations.BeforeTest;

import com.yalla.testng.api.base.Annotations;

import cucumber.api.CucumberOptions;

@CucumberOptions(features="src/test/java/features/CreateLead.feature", glue= {"com.yalla"}, monochrome=true)
public class CreateLeadUsingCucumber extends Annotations{
	
	@BeforeTest
	public void setData() {
		testcaseName = "TC002_CreateLead";
		testcaseDec = "Creating a Lead";
		author = "Siva";
		category = "smoke";
		excelFileName = "TC001_CreateLead";
	} 

}
