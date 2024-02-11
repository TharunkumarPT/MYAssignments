package testcase;

import org.testng.annotations.Test;

import BaseClassMethods.ProjectSpecificMethods;
import pages.LoginPage;

public class TestClass extends ProjectSpecificMethods {

	@Test
	public void test() {
				
		LoginPage login = new LoginPage();
		
		//loginPage
		login.username().password().loginBtn()
		
		//welcomepage
		.welcomepg()
		
		//HomePage
		.leadsClick()
		.createLead()
		
		//Create Lead
		.createLeadDetails()
		.clickCreateLead()
		
		//VerifyLead
		.getCreateLead()
		
		
		
		//DeleteLead
		.verifyLeadIsDeleted();
		
		System.out.println("Successfully Executed All classes & its methods");
		

	}

}
