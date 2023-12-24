
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticeToOpenBrowserEx {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().setSize(new Dimension(20, 30));
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));// implicit wait
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		// System.out.println("source length: "+PageSource.length());
		/**
		 * driver.findElement(By.name("username")).sendKeys("Admin");
		 * driver.findElement(By.name("password")).sendKeys("admin123");
		 * driver.findElement(By.className("orangehrm-login-button")).click(); String
		 * expectedHomePageTitle="orangehrm-timeTract"; //WebDriverWait wait=new
		 * WebDriverWait(driver,Duration.ofSeconds(20));
		 * //wait.until(ExpectedConditions.visibilityOf(PofilePicture)); String
		 * actualHomePageTitel=driver.getTitle(); System.out.println("Expected
		 * homePagetitle: "+expectedHomePageTitle); System.out.println("Actual home page
		 * title: "+actualHomePageTitel); System.out.println("is expected and actual
		 * home page title is same:
		 * "+actualHomePageTitel.equals(expectedHomePageTitle));
		 * System.out.println("=============");
		 * 
		 * String expectedHomePageTitle1="OrangeHRM"; String
		 * actualHomePageTitel1=driver.getTitle(); System.out.println("Expected
		 * homePagetitle: "+expectedHomePageTitle1); System.out.println("Actual home
		 * page title: "+actualHomePageTitel1); System.out.println("is expected and
		 * actual home page title is same:
		 * "+actualHomePageTitel1.equals(expectedHomePageTitle1));
		 * driver.findElement(By.className("oxd-userdropdown-img")).click();
		 * driver.navigate().back(); //driver.navigate().to("https://www.google.com");
		 * //driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 * System.out.println("============="); WebElement
		 * userNameInputField=driver.findElement(By.name("username"));
		 * System.out.println("is username field is disable:
		 * "+userNameInputField.isDisplayed()); System.out.println("is username field is
		 * enable: "+userNameInputField.isEnabled()); System.out.println("is username
		 * inputField default value: "+userNameInputField.getAttribute("name")); //style
		 * System.out.println("username text size:
		 * "+userNameInputField.getCssValue("font-size")); System.out.println("username
		 * text family: "+userNameInputField.getCssValue("font-family"));
		 * System.out.println("username text colour:
		 * "+userNameInputField.getCssValue("colour"));
		 * 
		 * System.out.println("============="); WebElement
		 * passwordInputField=driver.findElement(By.name("password"));
		 * System.out.println("is password field is disable:
		 * "+passwordInputField.isDisplayed()); System.out.println("is password field is
		 * enable: "+passwordInputField.isEnabled()); System.out.println("is password
		 * inputField default value: "+passwordInputField.getAttribute("name"));
		 * System.out.println("password text size:
		 * "+passwordInputField.getCssValue("font-size")); System.out.println("password
		 * text family: "+passwordInputField.getCssValue("font-family"));
		 * System.out.println("password text colour:
		 * "+passwordInputField.getCssValue("colour"));
		 */

		System.out.println("=============");

		/**
		 * driver.findElement(By.className("orangehrm-login-button")).click();
		 * WebElement
		 * loginButton=driver.findElement(By.className("orangehrm-login-button"));
		 * 
		 * System.out.println("is loginButton is disable: "+loginButton.isDisplayed());
		 * System.out.println("is loginButton is enable: "+loginButton.isEnabled());
		 * System.out.println("is loginButton by defualt selected? :
		 * "+loginButton.isSelected()); System.out.println("login button name:
		 * "+loginButton.getText()); System.out.println("loginButton text size:
		 * "+loginButton.getCssValue("font-size")); System.out.println("loginButton text
		 * family: "+loginButton.getCssValue("font-family"));
		 * System.out.println("loginButton text colour:
		 * "+loginButton.getCssValue("colour")); System.out.println("loginButton text
		 * background colour: "+loginButton.getCssValue(""));
		 * System.out.println("=============");
		 */

		WebElement passwordInputField1 = driver.findElement(By.name("password"));
		Point ptPwd = passwordInputField1.getLocation();
		int pwd_x = ptPwd.getX();
		int pwd_y = ptPwd.getY();
		System.out.println("pwd cord-x: " + pwd_x);
		System.out.println("pwd cord-y: " + pwd_y);
		System.out.println(";;;;;;;;;;;;;;;;;;");
		WebElement errorMsg = driver.findElement(By.name("password"));
		Point ptError = errorMsg.getLocation();
		int error_x = ptError.getX();
		int error_y = ptError.getY();
		System.out.println("error cord-x: " + error_x);
		System.out.println("error cord-y: " + error_y);

		System.out.println("is error msg getting displayed below password field= " + (pwd_x < error_x));

		driver.close();

	}

}
