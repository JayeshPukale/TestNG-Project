package april23;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class FirstTestNGClass {
	WebDriver driver;
	@BeforeTest
  public void preCondition()throws Throwable {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://primusbank.qedgetech.com");
		Thread.sleep(3000);
		Reporter.log("Running precondition",true);
  }
	@Test
  public void pbanking() throws Throwable{
		driver.findElement(By.xpath("//a[@href='personal_banking.html']//img")).click();
		Reporter.log("Executing pbanking Test",true);
		Thread.sleep(2000);
  }
	@Test
	  public void cbanking() throws Throwable {
		driver.findElement(By.xpath("(//img)[5]")).click();
		Reporter.log("Executing cbanking Test",true);
		Thread.sleep(2000);
	  }
	@Test
	  public void ibanking() throws Throwable {
		driver.findElement(By.xpath("(//img)[6]")).click();
		Reporter.log("Executing ibanking Test",true);
		Thread.sleep(2000);
	  }
 
  @AfterTest
  public void tearDown() {
	  driver.close();
	  Reporter.log("Running postCondition",true);
  }

}
