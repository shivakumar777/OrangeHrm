package com.hrm.objectRepo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import com.hrm.utils.PathFinder;

public class AdminPageObjects {

	public static FileInputStream file;

	public static Properties prop;

	public Properties getAdminObjects() {

		try {
			file = new FileInputStream(PathFinder.getFilePath().getProperty("adminPagObjects_filePath"));
			file = new FileInputStream(PathFinder.getFilePath().getProperty("src//test//resource//pageObjects//adminPagObjects.properties"));
			
			prop = new Properties();

			prop.load(file);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop;
	}

}
