import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vtiger {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://crmaccess.vtiger.com/log-in/?mode=continue");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		String PageSource = driver.getPageSource();
		System.out.println("Source code lenght: "+PageSource.length());
		
		WebElement emailInputField = driver.findElement(By.name("username"));
		emailInputField.sendKeys("tkarishma1598@gmail.com");
		
		WebElement passwordInputField = driver.findElement(By.name("password"));
		passwordInputField.sendKeys("karishma1598");
		
		driver.findElement(By.className("btn")).click();
		
		
		driver.close();
		
		
		
		
	}

}
