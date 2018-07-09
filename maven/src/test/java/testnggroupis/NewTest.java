package testnggroupis;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

public class NewTest {
	WebDriver driver;
  @Test(groups="human")
  public void f() {
	  System.out.println("i am jyothi");
  }
  @Test(groups="bird")
  public void h() {
	  System.out.println("i am peacock");
  }
  @Test(groups="human")
  public void g() {
	  System.out.println("i am lucky");
  }
  @BeforeTest
  public void beforeTest() {
  }

}
