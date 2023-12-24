import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingMultipleElements {

	public static WebDriver setup(String browserName,String url) {
		WebDriver driver=null;
		if(browserName.equalsIgnoreCase("chrome")) {
			driver= new ChromeDriver();
	}else if(browserName.equalsIgnoreCase("Firefox")){
		driver= new FirefoxDriver();
	}
	driver.manage().window().maximize();
	driver.navigate().refresh();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);
		return driver;
		}
	public static void main(String[] args) {
			
		WebDriver driver=setup("chrome","https://www.demoblaze.com" );
		//driver.findElement(By.id("input")).sendKeys("selenium");
	    List<WebElement> suggList=driver.findElements(By.cssSelector(""));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	}

}
