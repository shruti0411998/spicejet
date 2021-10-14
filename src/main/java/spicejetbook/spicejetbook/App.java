package spicejetbook.spicejetbook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class App 


{ WebDriver driver = null;
	

	@Test
	public void loginAbc() throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\shruti.goyal\\eclipse-workspace\\spicejetbook\\src\\main\\java\\chromedriver.exe");
        
      
		WebDriver driver = new ChromeDriver();
    	driver.get ("https://www.spicejet.com/");
    	Thread.sleep(2000);
    	
    	
    	driver.quit();
    }

    }

