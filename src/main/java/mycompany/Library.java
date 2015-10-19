package mycompany;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
import static org.testng.Assert.*;

public class Library {

  public static void clickNavMenu(final WebDriver driver) {
    driver.findElement(By.linkText("Standards")).click();
    driver.findElement(By.linkText("Participate")).click();
    driver.findElement(By.linkText("Membership")).click();
    driver.findElement(By.linkText("About W3C")).click();
  }
  public static void goHome(final WebDriver driver) {
    driver.findElement(By.cssSelector("a")).click();
  }

}


