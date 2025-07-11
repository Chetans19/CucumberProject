package utils;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	 private static WebDriver driver;
	 
	 public static WebDriver initDriver() {
		 
		 if(driver == null) {
			 ConfigReader.loadProperties();
		        String browser = ConfigReader.getProperty("browser");
		        String baseUrl = ConfigReader.getProperty("baseUrl");
		        
//		        WebDriverManager.chromedriver().browserVersion("123").setup();
		        WebDriverManager.chromedriver()
		        .clearDriverCache()
		        .setup();

		 
		        driver = new ChromeDriver();
		        
		        driver.manage().window().maximize();
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		        
		        driver.get(baseUrl);
		        
		 }
		 
		 return driver;

	 }
	 
	 public static WebDriver getDriver() {
	        return driver;
	    }

	    public static void quitDriver() {
	        if (driver != null) {
	            driver.quit();
	            driver = null;
	        }
	    }
	
}
