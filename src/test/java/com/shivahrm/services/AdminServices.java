package com.shivahrm.services;

import com.hrm.objectRepo.AdminPageObjects;
import com.hrm.utils.Commonutils;


public class AdminServices {
	
	
 AdminPageObjects adminPageObjects = new AdminPageObjects();
	
	public void admin_NavigateToGeneral() throws InterruptedException {
		
		Commonutils.mouseHover("xpath", adminPageObjects.getAdminObjects().getProperty("Admin_xpath"));
		Commonutils.mouseHover("xpath", adminPageObjects.getAdminObjects().getProperty("CompanyInfo_xpath"));
		Commonutils.clickButton("xpath", adminPageObjects.getAdminObjects().getProperty("General_xpath"));
		

		Commonutils.switchToFrame(adminPageObjects.getAdminObjects().getProperty("iframe_id"));
		Thread.sleep(5000);
		Commonutils.clickButton("css",adminPageObjects.getAdminObjects().getProperty("editBtn_xpath"));
	}
  
}



	
	
