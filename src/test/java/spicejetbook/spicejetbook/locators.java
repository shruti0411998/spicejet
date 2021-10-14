package spicejetbook.spicejetbook;

import org.openqa.selenium.By;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class locators {

	public static void main(String[] args) {
		ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shruti.goyal\\Desktop\\chrome\\chromedriver.exe");
        
	      
		WebDriver driver = new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		/*
		ChromeOptions options = new ChromeOptions();
		Object Arrays;
		options.setExperimentalOption("excludeSwitches",Arrays.asLit("disable-popup-blocking"));
		MutableCapabilities caps;
		caps.setCapability(ChromeOptions.CAPABILITY, options);
		
	*/

		//driver.manage().notify();
    	driver.get ("https://beta.spicejet.com/");
    	//driver.switchTo().alert().accept();
    	
    	//Select select= new Select(driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[1]/div[1]/div[2]/input")));
    	//select.selectByVisibleText("Mumbai");
    	
    	WebElement book= driver.findElement(By.xpath("//div[text() = 'From']//parent::div//input").click();
    	
    	
    	//driver.findElement(By.xpath("//*[@id=\'main-container\']/div/div[1]/div[3]/div[2]/div[3]/div/div[1]/div[1]")).click();
    	//driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[1]/div/div[2]/input")).sendKeys("Agra");
    	
    	//driver.findElement(By.xpath("//*[@id=\'main-container\']/div/div[1]/div[3]/div[2]/div[3]/div/div[3]/div[1]/div[2]/input")).click();
    	//driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[3]/div")).sendKeys("Delhi");
    	
    	
    	//driver.findElement(By.xpath(""))
    	//Thread.sleep(2000);
		//WebElement book2=driver.findElement(By.xpath("//div[text() = 'Mumbai']"));
		/*
		for (i=1;i<=book2;i++)
		{
			if ('BOM'==book2.text)
			{
				book2.click();
				break;
			}
			else {
				return;
			}
		}
		*/
		//WebElement book = driver.findElement(By.xpath("//div[text() = 'Mumbai']"));
		//book.sendKeys("mumbai");
		//driver.findElement(By.xpath("//div[@data-testid='undefined-month-November-2021']")).click();
    	/*
    	WebElement book= driver.findElement(By.xpath("//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu']"));
    	book.sendKeys("Mumbai");
    	WebElement from= driver.findElement(By.xpath("//div[@class='css-76zvg2 r-cqee49 r-ubezar r-1kfrs79']"));
    	from.click();
    	
    	
    	*/
    	//from.sendKeys("Delhi");
    	////*[@id="main-container"]/div/div[1]/div[3]/div[2]/div[3]/div/div[1]/div[1]
    	////div[text() = 'From']//parent::div//input
    	

    	//WebElement from=driver.findElement(By.xpath("//*[@id='main-container']/div/div[1]/div[3]/div[2]/div[3]/div/div[1]/div[1]/div[2]/input"));
    	//from.click();
    	//WebElement book= driver.findElement(By.xpath("//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu']"));
    	//book.sendKeys("agra");
    	//WebElement book2= driver.findElement(By.xpath("//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu']"));
    	//book.sendKeys("agra");
    	////*[@id="main-container"]/div/div[1]/div[3]/div[2]/div[3]/div/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]
    	   // WebElement book2= driver.findElement(By.xpath("//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu']"));
    		//book2.sendKeys("Delhi");
    	// to= driver.findElement(By.xpath("//*[@id=\'main-container\']/div/div[1]/div[3]/div[2]/div[3]/div/div[3]/div[1]/div[2]/input"));
    	//to.click();
    	
    	
    	//2.datepicker
    	
    // month="october 2021";
    	//String days="20";
    	
    	
    	
    	/*driver.findElement(By.xpath("//*[@id=\'main-container\']/div/div[1]/div[3]/div[2]/div[4]/div/div/div[1]")).clear();
    	
    	while (true) {
    		String text=driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[4]/div/div[2]/div[2]/div[3]/div[2]/div/div[1]/div/div[1]/div")).getText();
    		 if(text.equals(month)) {
    			 break;
    		 }
    		 else {
    			 
    			 driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[4]/div/div[2]/div[2]/div[1]/svg/g/path")).click();
    			*/ 
    			 
    		// }
    		 
    		 
    		
    	//}
    	
    	
    	
    	
    	
    /*	
    	Date d = new Date(1);
    	SimpleDateFormat formatter = new SimpleDateFormat("dd-MMMM-yyyy");
    	String date = formatter.format(d);
    	String splitter[] = date.split("-");
    	String month_year = splitter[1];
    	String day = splitter[0]; 
    	System.out.println(month_year);
    	System.out.println(day);


    	selectDate(month_year,day); 
    	*/

    	
    	
    	//driver.quit();
    	WebElement radio = driver.findElement(By.id("i-red"));
    	radio.click();
    	
	}

}
