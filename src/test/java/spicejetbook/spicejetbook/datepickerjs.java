package spicejetbook.spicejetbook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datepickerjs {

	public static void main(String[] args) {
		// TODO Auto-generated method stubSystem.setProperty("webdriver.chrome.driver","C:\\Users\\shruti.goyal\\Desktop\\chrome\\chromedriver.exe");
        
	      
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().notify();
    	driver.get ("https://beta.spicejet.com/");

	}
	String month="october 2021";
	String days="20";
	driver.findElement(By.xpath)
////div[@data-testid="add-ons-continue-footer-button"]
	//// input[@data-testid="last-inputbox-contact-details"] :last name
	//// input[@data-testid="contact-number-input-box"]//input[@data-testid="contact-number-input-box"]
	//// input[@data-testid="emailAddress-inputbox-contact-details"]
	//// input[@data-testid="city-inputbox-contact-details"]
	// WebDriverWait some_element = new WebDriverWait(driver, 100);
			// Select select= new
			// Select(driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-14lw9ot
			// r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-1ugchlj r-1777fci r-ymttw5
			// r-5njf8e r-1otgn73
			// r-1x93onp']//div[@class='css-1dbjc4n']//*[name()='svg']")));
			// select.selectByVisibleText("Miss");
			/*
			 * WebElement a = some_element.until(ExpectedConditions
			 * .visibilityOfElementLocated(By.xpath(
			 * "//input[@data-testid=\"first-inputbox-contact-details\"]")));
			 * a.sendKeys("shruti");
			 * 
			 * WebElement b = some_element.until(ExpectedConditions
			 * .visibilityOfElementLocated(By.xpath(
			 * "//input[@data-testid=\"last-inputbox-contact-details\"]")));
			 * b.sendKeys("goyal");
			 * 
			 * WebElement c = some_element.until(ExpectedConditions
			 * .visibilityOfElementLocated(By.xpath(
			 * "//input[@data-testid=\"contact-number-input-box\"]")));
			 * c.sendKeys("9639414443");
			 * 
			 * WebElement d =
			 * some_element.until(ExpectedConditions.visibilityOfElementLocated(
			 * By.xpath("//input[@data-testid=\"emailAddress-inputbox-contact-details\"]")))
			 * ; d.sendKeys("shrutiggoyal@gmail.com");
			 * 
			 * WebElement e = some_element.until(ExpectedConditions
			 * .visibilityOfElementLocated(By.xpath(
			 * "//input[@data-testid=\"city-inputbox-contact-details\"]")));
			 * e.sendKeys("Agra");
			 * 
			 * driver.findElement(By.
			 * //driver.findElement(By.xpath("//div[text()='Done']")).click();
		/*
		WebDriverWait some_element = new WebDriverWait(driver, 100);
	WebElement a=	some_element.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Done']")));
			a.click();
	*/		
			 * xpath("//div[text()='I am flying as the primary passenger']")).click();
			 * 
			 */ // e.submit();
	// driver.findElement(By.cssSelector("css=div[#data-testid='continue-search-page-cta']")).click();

	// dr

	// driver.findElement(By.xpath("//div[@data-testid=\"continue-search-page-cta\"]")).click();
	// driver.findElement(By.xpath("//a[contains(text(),'Continue')]")).click();

		
		
	}

}
