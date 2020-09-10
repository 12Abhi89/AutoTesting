package autoTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class Test2 {

	public void test2() throws InterruptedException
	{
	
		System.setProperty("webdriver.gecko.driver","D:\\Selenium\\geckodriver.exe");
		WebDriver driver;
		String pageurl = "http://autotesting123.atwebpages.com/index.php";
		driver = new FirefoxDriver();
		driver.get(pageurl);
		Thread.sleep(2000);
		driver.manage().window().maximize(); 
		driver.findElement(By.name("name")).sendKeys("zoro");
		driver.findElement(By.name("age")).sendKeys("999");
		driver.findElement(By.className("button")).click();
		Thread.sleep(2000);
		driver.close();
		String ObtainedTital = driver.getTitle();
		String ActualTital = "DisplayData";
		Assert.assertEquals(ObtainedTital, ActualTital);
		
}
	}
