package com.shivahrm.services;

import com.hrm.config.Configuration;
import com.hrm.objectRepo.LoginObjectRepo;
import com.hrm.utils.Commonutils;

public class LoginServices{
	
	Configuration configuration = new Configuration();
	LoginObjectRepo loginObjectRepo =new LoginObjectRepo();
	
	public void openOrangeHrm() {
		
		configuration.init();
		
	}
	
public void adminLogin() {
//		  Configuration.driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("admin");
//			Configuration.driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("admin");
//			Configuration.driver.findElement(By.xpath("//input[contains(@type,'Submit')]")).click();
//
			Commonutils.enterTextInTextBox("xpath", LoginObjectRepo.getLocator().getProperty("username_xpath"), "admin");
			Commonutils.enterTextInTextBox("xpath", LoginObjectRepo.getLocator().getProperty("password_xpath"), "admin");
			Commonutils.clickButton("xpath", LoginObjectRepo.getLocator().getProperty("login_button"));
			
		}
}
	
