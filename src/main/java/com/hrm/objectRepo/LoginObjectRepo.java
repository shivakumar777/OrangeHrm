package com.hrm.objectRepo;

import java.io.FileInputStream;
import java.util.Properties;

import com.hrm.utils.PathFinder;

public class LoginObjectRepo {

	public static FileInputStream file;

	public static Properties prop;

	public static Properties getLocator() {

		try {
			file = new FileInputStream(PathFinder.getFilePath().getProperty("loginObjects_filePath"));

			prop = new Properties();

			prop.load(file);
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

		return prop;

	}

}
