package com.hrm.config;

import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.hrm.utils.PathFinder;

public class Configuration {

	public static FileInputStream file;
	public static Properties prop;
	public static WebDriver driver;
	
//	 I have Created an Object For the path Finder in the Class ...!!
     // In Which i am About to CALL..!!
	
	PathFinder finder = new PathFinder();

	public void init() {

		try {
			file = new FileInputStream(finder.getFilePath().getProperty("config_filePath"));
			prop = new Properties();
			prop.load(file);
			String browser = prop.getProperty("browser");
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "src\\test\\resource\\drivers\\chromedriver.exe");
				driver = new ChromeDriver();
//				       driver. navigate().to(prop.getProperty("browser"));
			} else if (browser.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", "src//test//resource//drivers//IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			} else {
				System.out.println("Login with Correct browser");
			}
			driver.manage().window().maximize();
			driver.navigate().to(prop.getProperty("hrm_url"));
//			    String implictwait = prop.getProperty("impWait");
//			        int implictWait = Integer.parseInt(implictwait);
//			        driver.manage().timeouts().implicitlyWait(implictWait, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.getMessage();
		}

	}

//	public static void main(String[] args) {
//		
//	   Configuration obj =new Configuration();
//	   
//	     obj.openHrm();
//
//	}

}