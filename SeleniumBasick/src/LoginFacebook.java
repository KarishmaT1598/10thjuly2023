import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFacebook {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();

		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		String PageSource = driver.getPageSource();
		System.out.println("Source code lenght: "+PageSource.length());
		
		WebElement emailInputField = driver.findElement(By.id("email"));
		emailInputField.sendKeys("tkarishma1598@gmail.com");
		
		WebElement passwordInputField = driver.findElement(By.id("pass"));
		passwordInputField.sendKeys("karishma1598");
		
		WebElement loginButton = driver.findElement(By.id("u_0_5_ZT"));
		loginButton.click();
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
			
		
	}

}
