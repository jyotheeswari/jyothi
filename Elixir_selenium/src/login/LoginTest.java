package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver driver;
  @Test
  public void login() {
	  System.setProperty("webdriver.chrome.driver", "C:\\1selenium\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://demo.elixiraid.com/index.php");
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//input[@id='UserLogin_username']")).sendKeys("admin");
	  driver.findElement(By.xpath("//input[@id='UserLogin_password']")).sendKeys("admin");
	  driver.findElement(By.xpath("//input[@class='btn bg-teal btn-block']")).click();
	//  driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/ul[1]/li[3]/a[1]")).click();
	//  driver.findElement(By.xpath("//a[@href='/index.php/core/hospitalregistration/create']")).click();
	//  driver.findElement(By.xpath("//select[@id='Hospitalregistration_yearofestablishment']")).click();

	//  new Select(driver.findElement(By.xpath("//select[@id='Hospitalregistration_yearofestablishment']"))).selectByVisibleText("2014 ");
  }
}
