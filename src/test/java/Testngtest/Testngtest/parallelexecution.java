package Testngtest.Testngtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class parallelexecution {

	@Test
	public void getFirefox() {
		// System.setProperty("webdriver.gecko.driver", "geckodriver.exe path");

		System.setProperty("webdriver.gecko.driver",
				"D://ECLIPSE//Drivers//geckodriver-v0.29.1-win64//geckodriver.exe");
		System.out.println("GetFirefox Method is running on Thread : " + Thread.currentThread().getId());
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.softwaretestingmaterial.com");
		driver.close();
	}

	@Test
	public void getChorme() {
		// System.setProperty("webdriver.chrome.driver", "chromedriver.exe path");
		System.setProperty("webdriver.chrome.driver", "D://ECLIPSE//Drivers//chromedriver_win32//chromedriver.exe");
		System.out.println("GetChrome Method is running on Thread : " + Thread.currentThread().getId());
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.softwaretestingmaterial.com");
		driver.close();
	}

}
