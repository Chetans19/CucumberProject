package pages;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class PracticePage {

	WebDriver driver;
	
	private String parentWindow;
	
	public PracticePage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	 // 🔎 Locators
    private By radio1 = By.xpath("//input[@value='radio1']");
    private By radio2 = By.id("radio2");
    private By dropdown = By.id("dropdown-class-example");
    
    private By openTab = By.xpath("//a[text()='Open Tab']");
    private By email = By.xpath("//div[@class='cont']/span[contains(text(),'info@qaclickacademy.com')]");  
    
    
    
//    private By openWindow = By.xpath("//button[text()=\"Open Window\"]");

    // 🧪 Actions
    
    public void selectButton(String value) {
    	By openWindow = By.xpath("//button[text()='"+value+"']");
    	driver.findElement(openWindow).click();
    	parentWindow = driver.getWindowHandle();
    }
    
    public void validateEmail() {
    	String emailText = driver.findElement(email).getText();
    	Assert.assertEquals(emailText, "info@qaclickacademy.com");
    }
    
    public void clickOpenTab() throws InterruptedException {
    	
    	parentWindow = driver.getWindowHandle();
    	
    	driver.findElement(openTab).click();
    	
    }
    
    public void closeTab() {
    	
    	driver.close(); 
    	driver.switchTo().window(parentWindow);
    	
    }
    
    public void switchToNewTab() {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	
    	wait.until(driver1 -> driver1.getWindowHandles().size() >= 1);
    	
    	Set<String> windows = driver.getWindowHandles();
    	
    	
    	for(String window: windows) {
    		if(!window.equals(parentWindow)) {
    			driver.switchTo().window(window);
    			System.out.println("Current URL: " + driver.getCurrentUrl());
    			System.out.println("Current Title: " + driver.getTitle());
    			break;
    		}
    	}
    	
    }
    
    public void switchToNewWindow() {
    	
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	
    	wait.until(driver1 -> driver1.getWindowHandles().size() >= 1);
    	
    	Set<String> windows = driver.getWindowHandles();
    	
    	for(String window: windows) {
    		if(!window.equals(parentWindow)) {
    			driver.switchTo().window(window);
    			break;
    		}
    	}
    	
    	System.out.println("xxxxxxx    "+windows);
    	
    }
    
    public void switchToParentWindow() {
    	
    	driver.close();
    	driver.switchTo().window(parentWindow);
    	System.out.println("Switched to parent window");
    	
    }
    
    public void getWindowTitle() {
    	String actualTitle = driver.getTitle();
    	System.out.println("Window title "+actualTitle);
    }
    
    public void selectRadioOption(String value) {
    	By dynamicRadio = By.xpath("//input[@value='"+value+"']");
    	driver.findElement(dynamicRadio).click();
    	System.out.println("Radio button option clicked");
    }
    
    public boolean isRadioOptionSelected(String value) {
        By dynamicRadio = By.xpath("//input[@type='radio' and @value='" + value + "']");
        return driver.findElement(dynamicRadio).isSelected();
   
    }
    
    public void selectRadio1() {
        driver.findElement(radio1).click();
    }

    public void selectDropdownOption(String optionText) {
        Select dropdownSelect = new Select(driver.findElement(dropdown));
        dropdownSelect.selectByVisibleText(optionText);
    }

    public boolean isRadio1Selected() {
        return driver.findElement(radio1).isSelected();
    }
    
    
	
}
