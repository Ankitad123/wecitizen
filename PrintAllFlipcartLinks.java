package scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PrintAllFlipcartLinks {
	WebDriver driver;
	
	@BeforeSuite
	public void beforeSuiteMethod(){
		System.out.println("before Suit Test 2");
	}
	
	@AfterSuite
	public void afterSuiteMethod(){
		System.out.println(" After Suit  Test 2");
	}
	
	@BeforeTest
	public void beforeTestSuiteMethod(){
		System.out.println("Before test Test 2 ");
	}
	
	@AfterTest
	public void afterTestSuiteMethod(){
		System.out.println("After test Test 2");
	}


  @Test
  public void printAllGoogleLinks() {
		driver.get("https://www.flipkart.com/");
		List<WebElement> allFlipcartLinkElements = driver.findElements(By.xpath("//a"));

		System.out.println("No. of links on Flipcart  page are " + allFlipcartLinkElements.size());
		for (WebElement oneLink : allFlipcartLinkElements) {
			System.out.println(oneLink.getText() + " - " + oneLink.getAttribute("href"));
		}

		for (int i = 0; i < allFlipcartLinkElements.size(); i++) {
			System.out.println(
					allFlipcartLinkElements.get(i).getText() + " - " + allFlipcartLinkElements.get(i).getAttribute("href"));
		}
	}

  @BeforeMethod
	public void beforeMethod() {
		System.out.println("I am in Before Class");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\workspace\\webdrivertraining\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
}
