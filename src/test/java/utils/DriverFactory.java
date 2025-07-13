package utils;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	 private static WebDriver driver;
	 
	 private static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
	 
	 public static void initDriver() {
 
		 ConfigReader.loadProperties();
	        String browser = ConfigReader.getProperty("browser");
	        String baseUrl = ConfigReader.getProperty("baseUrl");
	        String headless = ConfigReader.getProperty("headless");

	        if (tlDriver.get() == null) {
	            WebDriverManager.chromedriver().setup();
	            
//	            ChromeOptions options = new ChromeOptions();
//	            options.addArguments("--headless");
//	            
//	            WebDriver driver = new ChromeDriver(options);
	            
	            WebDriver driver = new ChromeDriver();
	            driver.manage().window().maximize();
	            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	            tlDriver.set(driver);
	        }

	        getDriver().get(baseUrl); 

	 }
	 
//	 ChromeOptions options = new ChromeOptions();
//	 options.addArguments("--headless");
	 
	 public static WebDriver getDriver() {
	        return tlDriver.get();
	    }

	 public static void quitDriver() {
	        if (tlDriver.get() != null) {
	            tlDriver.get().quit();
	            tlDriver.remove();
	        }
	    }
	
}
