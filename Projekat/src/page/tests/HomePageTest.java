package page.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.objects.HomePage;

public class HomePageTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Crome Driver\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get(HomePage.URL);
		HomePage.Waitme15();
		HomePage.clickEnterTheStore(wd);

	}
}
