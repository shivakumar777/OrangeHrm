package com.hrm.testscripts;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.shivahrm.services.AdminServices;
import com.shivahrm.services.LoginServices;

public class TestScripts{
	
	LoginServices loginServices = new LoginServices();
	
	AdminServices adminServices = new AdminServices();

	
	@BeforeTest
	public void loginbrowser() {
		
		loginServices.openOrangeHrm();
		loginServices.adminLogin();
	 
		
}
	
	@Test
	public void adminTest() throws InterruptedException {
		
		
		  adminServices.admin_NavigateToGeneral();
		
		
	}
	
}