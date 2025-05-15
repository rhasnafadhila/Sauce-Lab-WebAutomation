package SauceDemoTest;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.UUID;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public WebDriver driver;
    private Path tempProfileDir;


	@BeforeClass
	public void configureSelenium() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();

        // Use a temporary user profile
		tempProfileDir = Paths.get(System.getProperty("java.io.tmpdir"), UUID.randomUUID().toString());
        options.addArguments("--user-data-dir=" + tempProfileDir.toAbsolutePath().toString());
        options.addArguments("--no-first-run"); // Prevent setup wizards
        
		final Map<String, Object> chromePrefs = new HashMap<>();
		chromePrefs.put("credentials_enable_service", false);
		chromePrefs.put("profile.password_manager_enabled", false);
		options.setExperimentalOption("prefs", chromePrefs);

		driver = new ChromeDriver(options);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void waiting(WebElement element) {

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofMillis(500)).ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void verifyElementVisible(WebElement element) {

		boolean elementVisible;

		elementVisible = element.isDisplayed();
		try {

			if (elementVisible) {
				System.out.println("Element is visible:" + elementVisible);
			}
		} catch (Exception e) {
			System.err.println("The element is not visible: " + e.getMessage());
		}

	}

	public void clearCache() {
		if (driver instanceof JavascriptExecutor) {
			((JavascriptExecutor) driver).executeScript("localStorage.clear();");
			System.out.println("Local storage cleared.");
		} else {
			System.err.println("WebDriver instance is not a JavascriptExecutor.");
		}

	}

	@AfterClass
	public void tearDownSelenium() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}
}
