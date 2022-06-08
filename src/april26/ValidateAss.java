package april26;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidateAss {
	WebDriver driver;
	String url = "https://google.com";
	@BeforeMethod
	public void setUp() throws Throwable
	{
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		Thread.sleep(4000);
	}
	@Test
	public void verifytitle1() {
		String expectedtitle = "Google";
		String actualtitle = driver.getTitle();
		try {
			Assert.assertEquals(actualtitle, expectedtitle,"Title is not matching");
		}catch (Throwable t) {
			Reporter.log(t.getMessage());
		}
	}
	@Test
	public void verifytitle2()
	{
		String expectedtitle = "Google";
		String actualtitle = driver.getTitle();
		try {
			Assert.assertTrue(expectedtitle.equalsIgnoreCase(actualtitle),"Title is not matching");
		} catch (Throwable t) {
			Reporter.log(t.getMessage());
		}
	}
	@Test
	public void verifytitle3()
	{
		String expectedtitle = "Google";
		String actualtitle = driver.getTitle();
		try {
			Assert.assertFalse(expectedtitle.equalsIgnoreCase(actualtitle),"Title is matching");
		} catch (Throwable t) {
			Reporter.log(t.getMessage());
		}
	}
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}


}
