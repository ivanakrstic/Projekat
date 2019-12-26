package page.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page.objects.PetStoreMenu;

public class PetStoreManyTestNG {
	@Test
	public void f() {

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

		String fish = wd.getCurrentUrl();
		String upfish = wd.getCurrentUrl();
		String centralfish = wd.getCurrentUrl();

		SoftAssert soa = new SoftAssert();

		soa.assertEquals(fish, upfish, centralfish);

		String dogs = wd.getCurrentUrl();
		String updogs = wd.getCurrentUrl();
		String centraldog = wd.getCurrentUrl();

		soa.assertEquals(dogs, updogs, centraldog);

		String cats = wd.getCurrentUrl();
		String upcats = wd.getCurrentUrl();
		String centralcat = wd.getCurrentUrl();

		soa.assertEquals(cats, upcats, centralcat);

		String reptiles = wd.getCurrentUrl();
		String upreptiles = wd.getCurrentUrl();
		String centralreptile = wd.getCurrentUrl();

		soa.assertEquals(reptiles, upreptiles, centralreptile);

		String birds = wd.getCurrentUrl();
		String upbirds = wd.getCurrentUrl();
		String centralsmallbird = wd.getCurrentUrl();

		soa.assertEquals(birds, upbirds, centralsmallbird);

		soa.assertAll();

	}
}
