package mycompany.tests;


import mycompany.Library;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class W3Test {

  // TODO: It would be trivial to make this a parameter to Jenkins jobs
  private static final int IMPLICIT_TIMEOUT_SECONDS = 5;

  private WebDriver driver;

  @BeforeTest
  public void setUp() {
    driver = new FirefoxDriver();
    addImplicitTimeouts();
  }

  private void addImplicitTimeouts() {
    driver.manage().timeouts().implicitlyWait(IMPLICIT_TIMEOUT_SECONDS, TimeUnit.SECONDS);
  }
  
  @Test
  public void W3Test() throws Exception {
    driver.get("http://www.w3.org/");
    Library.clickNavMenu(driver);
    Library.goHome(driver);
  }

  @AfterTest
  public void cleanUp() {
    driver.quit();
  }
}
