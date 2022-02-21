package testWithSeleniumAsynchFirst;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;




public class TestHello {
	WebDriver driver;
	
	@FindBy(linkText = "Ethereum")
	private WebElement etherium;

	@SuppressWarnings("deprecation")
	@Before
	public void beforeTest() {

		System.out.println("Start The TEst Automation");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		driver.get("https://codingsolo.de");

	}

//	@Test
//	public void testTitle() {
//		try {
//			Thread.sleep(6000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		String expect = "coding blog - Coding Solo | programmierblog | tutorials | Videos";
//
//		driver.findElement(By.cssSelector("#header_main > div > div > span > a > img")).click();
//
//		driver.findElement(By.cssSelector("#cookie_action_close_header")).click();
//		assertEquals(expect, driver.getTitle());
//		assertEquals(expect, "coding blog - Coding Solo | programmierblog | tutorials | Videos");
//		
//		
//	}

	@After
	public void afterTests() {
		System.out.println("Test abgeschlossen. - Aufräumen");
		driver.close();
	}

//	@Test
//	public void openCoingecko() {
//		driver.get("https://www.coingecko.com/");
//
//		driver.findElement(By.cssSelector("#cookie-notice > div > div > div > div > button")).click();
//		try {
//			Thread.sleep(4000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		String selectorForSomeElement = "body > div.container > div:nth-child(3) > div:nth-child(1) > div > div > nav > a:nth-child(3)";
//		driver.findElement(By.cssSelector(selectorForSomeElement)).click();
//		try {
//			Thread.sleep(4000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}

	@Test
	public void checkSomeValuesForTodayAndPrintIt() {
		driver.get("https://www.coingecko.com/");
		String btcSelector = "body > div.container > div.gecko-table-container > div.coingecko-table > div.position-relative > div > table > tbody > tr:nth-child(1) > td.td-price.price.text-right.pl-0";
		WebElement btc = driver.findElement(By.cssSelector(btcSelector));
		String btcPrice = btc.getAttribute("data-sort");
		assertNotEquals(btcPrice, "38302.*");
		assertTrue(btcPrice.contains("37"));

	}

	@Test
	public void justCheck() {

	System.out.println("Added Auto generated methods");
	String text = etherium.getText();
	
	assertEquals(text, "Ethereum");
	
	}
}
