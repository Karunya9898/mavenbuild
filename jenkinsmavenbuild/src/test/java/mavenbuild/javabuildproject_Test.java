package mavenbuild;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;

public class javabuildproject_Test {
	 WebDriver driver;
	 
  @Test
  public void f() {
	  String title=driver.getTitle();
	  Assert.assertEquals(title,"Google");
  }
  @BeforeSuite
  public void beforeSuite() {
	 driver=new ChromeDriver();
	 driver.get("http://www.google.co.in");
 }

  @AfterSuite
  public void afterSuite() {
	  driver.close();
  }

}
