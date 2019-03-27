Feature: Login For LeafTaps Application 
	
Scenario Outline: TC001 Positive Login Flow 
	Given Enter the Username as <username> 
	And Enter the password as <password>
	And Click on the login button
	And Click on the CRMSFA link
	And Click on Leads link
	And Click on CreateLead link  
	And Enter CompanyName as <cName>
	And Enter FirstName as <fName>
	And Enter LastName as <lName>
	And Select Industry
	When Enter email as <email>
	Then Click on Createlead Button
		
	Examples: 
		|username|password|cName|fName|lName|email|
		|DemoCSR|crmsfa|Capgemini|Siva|G|xyz4@gmail.com|
		|DemoSalesManager|crmsfa|HSBC|Siva|G|xyz5@gmail.com|
		

	
	
	
	
	
	
	
	
	
	
	
