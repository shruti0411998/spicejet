package spicejetbook.spicejetbook;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AppTest

{

	private WebElement WebElement;

	@Test
	public void loginAbc() throws InterruptedException {

		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shruti.goyal\\Desktop\\chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.get("https://beta.spicejet.com/");
		Thread.sleep(5000);

		WebElement book = driver.findElement(By.xpath("//div[text() = 'From']//parent::div//input"));

		book.sendKeys("BOM");

		WebElement book2 = driver.findElement(By.xpath("//div[text() = 'To']//parent::div//input"));
		book2.sendKeys("DEL");

		// selecting date

		driver.findElement(By.xpath("//div[@data-testid='undefined-month-October-2021']//div[contains(text(),'25')]"))
				.click();

		driver.findElement(By.xpath("//div[@data-testid='home-page-flight-cta']")).click();

		// selection of flight

		Thread.sleep(5000);

		driver.findElement(By.xpath("//div[@data-testid='continue-search-page-cta']")).click();

		// passenger details

		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@data-testid=\"title-contact-detail-card\"]")).click();
		driver.findElement(By.xpath("//div[text()='Miss']")).click();

		driver.findElement(By.xpath("//input[@data-testid='first-inputbox-contact-details']")).sendKeys("shruti");

		driver.findElement(By.xpath("//input[@data-testid=\"last-inputbox-contact-details\"]")).sendKeys("goyal");

		driver.findElement(By.xpath("//input[@data-testid=\"contact-number-input-box\"]")).sendKeys("9639414443");
		driver.findElement(By.xpath("//input[@data-testid=\"emailAddress-inputbox-contact-details\"]"))
				.sendKeys("shrutiggoyal@gmail.com");
		driver.findElement(By.xpath("//input[@data-testid=\"city-inputbox-contact-details\"]")).sendKeys("Agra");
		driver.findElement(By.xpath("//div[text()=\"I am flying as the primary passenger\"]")).click();

		driver.findElement(By.xpath("//div[@data-testid=\"traveller-info-continue-cta\"]")).click();
		// payment method

		Thread.sleep(10000);

		driver.findElement(By.xpath("//div[text()='Choose Your Seat']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='7B']")).click();
		Thread.sleep(2000);

		WebElement scanEle = new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Done']")));
		Actions action = new Actions(driver);
		action.moveToElement(scanEle).click().build().perform();

		Thread.sleep(3000);
		;

		driver.findElement(By.xpath("//div[@data-testid=\"add-ons-continue-footer-button\"]")).click();

	}

}