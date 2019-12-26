package page.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import page.objects.PetStoreMenu;
import page.objects.PutInBasket;
import page.objects.Registration;
import page.objects.SignIn;

public class ChangeItemsTestNG {

	String username = "blagoje14";
	String password = "milanovic45";

	@Test
	public void f() {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Crome Driver\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		String url = "https://petstore.octoperf.com/actions/Account.action?newAccountForm=";
		wd.get(url);
		wd.manage().window().maximize();

		PetStoreMenu.clickSignIn(wd);

		PetStoreMenu.Waitme18();

		SignIn.clickLogin(wd);

		PetStoreMenu.Waitme18();

		WebElement username = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/form[1]/p[2]/input[1]"));
		username.click();
		username.sendKeys("blagoje14");

		SignIn.getPassword(wd).clear();

		WebElement passworde = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/form[1]/p[2]/input[2]"));
		passworde.click();
		passworde.sendKeys("milanovic45");

		WebElement login = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/form[1]/input[1]"));
		login.click();

		PetStoreMenu.Waitme18();

		PutInBasket.clickMyAccount(wd);
		PutInBasket.Waitme18();

		WebElement country = wd.findElement(By.xpath("//input[@name='account.country']  "));
		country.click();
		country.clear();
		country.sendKeys("Germany");

		Registration.clickSaveAccount(wd);

		wd.get(PetStoreMenu.URL);

		PutInBasket.clickMyAccount(wd);
		PutInBasket.Waitme18();

	}
}
