import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by my on 22.04.2015.
 */
@RunWith(value = Parameterized.class)
public class WebDriverBaseClass {

	private String url;
	protected static WebDriver driver;
	public WebDriverBaseClass(String url) {
		this.url = url;
	}

	@Parameterized.Parameters
	public static Collection<Object[]> data() {return Arrays.asList(new Object[][]{{"EPAM"}, {"SELENIUM"}});}


	@BeforeClass
	public static void startBrowser() {
    driver = WebDriverFactory.getWebDRiverInstance();
	}
   // @Ignore
	@Ignore
	@Test
	public void testweb() throws InterruptedException {
    driver.get("http://www.google.com");
    driver.findElement(By.id("lst-ib")).sendKeys("epam");
		Thread.sleep(2000);
		driver.findElement(By.id("lst-ib")).clear();

}
	@Test
	public void testParams() throws Exception {
		driver.get("http://www.google.com");
		driver.findElement(By.id("lst-ib")).sendKeys(url);
		Thread.sleep(2000);
		driver.findElement(By.id("lst-ib")).clear();

	}

	@AfterClass
	public static void closeBrowser() {
		driver.quit();
	}
}
