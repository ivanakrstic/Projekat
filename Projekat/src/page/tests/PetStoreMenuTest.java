package page.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.objects.PetStoreMenu;

public class PetStoreMenuTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Crome Driver\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();

		wd.get(PetStoreMenu.URL);
		PetStoreMenu.clickFish(wd);
		PetStoreMenu.Waitme18();
		wd.navigate().back();

		PetStoreMenu.clickDogs(wd);
		PetStoreMenu.Waitme18();
		wd.navigate().back();

		PetStoreMenu.Waitme18();
		PetStoreMenu.clickCats(wd);
		PetStoreMenu.Waitme18();
		wd.navigate().back();

		PetStoreMenu.Waitme18();
		PetStoreMenu.clickReptiles(wd);
		PetStoreMenu.Waitme18();
		wd.navigate().back();

		PetStoreMenu.Waitme18();
		PetStoreMenu.clickBirds(wd);
		PetStoreMenu.Waitme18();
		wd.navigate().back();

		PetStoreMenu.Waitme18();
		PetStoreMenu.clickUpFish(wd);
		PetStoreMenu.Waitme18();
		wd.navigate().back();

		PetStoreMenu.Waitme18();
		PetStoreMenu.clickUpDogs(wd);
		PetStoreMenu.Waitme18();
		wd.navigate().back();

		PetStoreMenu.Waitme18();
		PetStoreMenu.clickUpCats(wd);
		PetStoreMenu.Waitme18();
		wd.navigate().back();

		PetStoreMenu.Waitme18();
		PetStoreMenu.clickUpReptiles(wd);
		PetStoreMenu.Waitme18();
		wd.navigate().back();

		PetStoreMenu.Waitme18();
		PetStoreMenu.clickUpBirds(wd);
		PetStoreMenu.Waitme18();
		wd.navigate().back();

		PetStoreMenu.Waitme18();
		PetStoreMenu.clickCentralFish(wd);
		PetStoreMenu.Waitme18();
		wd.navigate().back();

		PetStoreMenu.Waitme18();
		PetStoreMenu.clickCentralDog(wd);
		PetStoreMenu.Waitme18();
		wd.navigate().back();

		PetStoreMenu.Waitme18();
		PetStoreMenu.clickCentralCat(wd);
		PetStoreMenu.Waitme18();
		wd.navigate().back();

		PetStoreMenu.Waitme18();
		PetStoreMenu.clickCentralReptile(wd);
		PetStoreMenu.Waitme18();
		wd.navigate().back();

		PetStoreMenu.Waitme18();
		PetStoreMenu.clickCentralSmallBird(wd);
		PetStoreMenu.Waitme18();
		wd.navigate().back();

		PetStoreMenu.Waitme18();
		PetStoreMenu.clickCentralHugeBird(wd);
		PetStoreMenu.Waitme18();
		wd.navigate().back();

		PetStoreMenu.Waitme18();
		PetStoreMenu.clickSignIn(wd);
		PetStoreMenu.Waitme18();
		// wd.navigate().back();

	}

}
