package page.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page.objects.HomePage;

public class HomePageTestNG {

	@Test
	public void f() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Crome Driver\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get(HomePage.URL);
		HomePage.Waitme15();
		HomePage.clickEnterTheStore(wd);

		String startedpage = wd.getCurrentUrl();
		String opendpage = "https://petstore.octoperf.com/actions/Catalog.action";

		SoftAssert soa = new SoftAssert();

		soa.assertEquals(startedpage, opendpage);

		soa.assertAll();

	}

}
