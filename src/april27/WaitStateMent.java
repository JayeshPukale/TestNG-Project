package april27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitStateMent {
	WebDriver driver;
	@Test
	public void verifylogin1() throws Throwable{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebDriverWait mywait = new WebDriverWait(driver, 20);
		mywait.until(ExpectedConditions.elementToBeClickable(By.linkText("Create New Account")));
		driver.findElement(By.linkText("Create New Account")).click();
		
		mywait.until(ExpectedConditions.presenceOfElementLocated(By.name("firstname")));
		driver.findElement(By.name("firstname")).sendKeys("Testing");
		
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("lastname")));
		driver.findElement(By.name("lastname")).sendKeys("selenium");
		
		new Select(driver.findElement(By.id("day"))).selectByVisibleText("20");
	}
}
