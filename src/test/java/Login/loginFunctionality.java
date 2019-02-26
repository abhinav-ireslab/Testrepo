package Login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class loginFunctionality 
{
	WebDriver driver;
	
	@Test
	public void Login_Scenarioo()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Abhinav.IRESLAB\\Desktop\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();

		System.out.println("Title of current window: "+driver.getTitle());
	
	}
	
	@Test
	public void leave() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.id("menu_leave_viewLeaveModule")).click();
	}
}
