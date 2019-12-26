package page.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page.objects.SignIn;
import page.objects.PetStoreMenu;

public class SignInTestNG {

	@Test
	public void f() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Crome Driver\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get(SignIn.URL);
		SignIn.Waitme();
		PetStoreMenu.clickSignIn(wd);

		String signin = wd.getCurrentUrl();
		String nextpage = "https://petstore.octoperf.com/actions/Account.action;jsessionid=A5662BF7EE0531C25A695F2591A31EE4?signonForm=";

		SoftAssert soa = new SoftAssert();

		soa.assertEquals(signin, nextpage);

		soa.assertAll();

	}
}
