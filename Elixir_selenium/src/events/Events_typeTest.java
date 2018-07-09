package events;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Events_typeTest {
	WebDriver driver;
  @Test
  public void events() {
	  driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/ul[1]/li[12]/a[1]")).click();
	  driver.findElement(By.xpath("//a[@href='/index.php/core/eventtype/create']")).click();
	  driver.findElement(By.xpath("//input[@id='Eventtype_eventtype_name']")).sendKeys("jyothi1");
	  driver.findElement(By.xpath("//input[@class='btn bg-teal']")).click();
	  
	  
  }
  @BeforeTest
  public void browser() {
	  System.setProperty("webdriver.chrome.driver", "C:\\1selenium\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://demo.elixiraid.com/index.php");
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//input[@id='UserLogin_username']")).sendKeys("admin");
	  driver.findElement(By.xpath("//input[@id='UserLogin_password']")).sendKeys("admin");
	  driver.findElement(By.xpath("//input[@class='btn bg-teal btn-block']")).click();
  }
  		@Test
	    public void close() {
	  driver.findElement(By.xpath("//html//tr[3]/td[3]/a[2]")).click();
	  driver.switchTo().alert().accept();
		  
	}
	//  @Test
	//  public void edit() {
	//	  driver.findElement(By.xpath("")).sendKeys("jyothi");
		//.0  driver.findElement(By.xpath("//input[@class='btn bg-teal']")).click();
//  }

}
