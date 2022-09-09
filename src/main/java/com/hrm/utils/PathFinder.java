package com.hrm.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PathFinder {
	
	public static FileInputStream file;
	public static Properties prop;
	
	public static Properties getFilePath() {
		
		try {
			file =new FileInputStream("src//test//resource//filepaths.properties");
			prop =new Properties();
			prop.load(file);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop;
	}

}
