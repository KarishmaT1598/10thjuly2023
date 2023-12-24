import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogintoOrangeHRM {

	public static void main(String[] args) {
		//3oct
		
		WebDriver driver = new ChromeDriver();
		//impliciteWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println(driver.getCurrentUrl());
		String PageSource = driver.getPageSource();
		System.out.println("code lenght: "+PageSource.length());
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.className("oxd-buttom")).click();
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}




















