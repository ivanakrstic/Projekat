package page.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import page.objects.HomePage;
import page.objects.PetStoreMenu;
import page.objects.PutInBasket;
import page.objects.SignIn;

public class MainProgram {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Crome Driver\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get(HomePage.URL);
		HomePage.Waitme15();
		HomePage.clickEnterTheStore(wd);

		PetStoreMenu.Waitme18();
		PetStoreMenu.clickCentralHugeBird(wd);
		PetStoreMenu.Waitme18();

		wd.navigate().back();

		PetStoreMenu.clickSignIn(wd);

		WebElement register = wd.findElement(By.xpath("//a[contains(text(),'Register Now!')]"));
		register.click();

		// User information

		WebElement userid = wd.findElement(By.xpath("//input[@name='username']"));
		userid.click();
		userid.sendKeys("milos13");

		WebElement password = wd.findElement(By.xpath("//input[@name='password']"));
		password.click();
		password.sendKeys("nikolic34");

		WebElement rpassword = wd.findElement(By.xpath("//input[@name='repeatedPassword'] "));
		rpassword.click();
		rpassword.sendKeys("nikolic34");

		// Account information

		WebElement firstname = wd.findElement(By.xpath("//input[@name='account.firstName']"));
		firstname.click();
		firstname.sendKeys("Blagica");

		WebElement lastname = wd.findElement(By.xpath("//input[@name='account.lastName'] "));
		lastname.click();
		lastname.sendKeys("Tasic");

		WebElement email = wd.findElement(By.xpath("//input[@name='account.email']  "));
		email.click();
		email.sendKeys("blagicatasic@gmail.com");

		WebElement phone = wd.findElement(By.xpath("//input[@name='account.phone']  "));
		phone.click();
		phone.sendKeys("0656861548");

		WebElement adress1 = wd.findElement(By.xpath("//input[@name='account.address1'] "));
		adress1.click();
		adress1.sendKeys("Klare Cetkin 15");

		WebElement adress2 = wd.findElement(By.xpath("//input[@name='account.address2']  "));
		adress2.click();
		adress2.sendKeys("Brace Jugovica 18");

		WebElement city = wd.findElement(By.xpath("//input[@name='account.city'] "));
		city.click();
		city.sendKeys("Beograd");

		WebElement state = wd.findElement(By.xpath("//input[@name='account.state'] "));
		state.click();
		state.sendKeys("Srbija");

		WebElement zip = wd.findElement(By.xpath("//input[@name='account.zip'] "));
		zip.click();
		zip.sendKeys("11 070");

		WebElement country = wd.findElement(By.xpath("//input[@name='account.country']  "));
		country.click();
		country.sendKeys("Srbija");

		// Profile information

		PetStoreMenu.Waitme18();

		Select language = new Select(wd.findElement(By.xpath("//select[@name='account.languagePreference'] ")));
		language.selectByVisibleText("english");

		Select category = new Select(wd.findElement(By.xpath("//select[@name='account.favouriteCategoryId'] ")));
		category.selectByVisibleText("BIRDS");

		PetStoreMenu.Waitme18();

		WebElement mylist = wd.findElement(By.xpath(" //input[@name='account.listOption']   "));
		mylist.click();

		PetStoreMenu.Waitme18();

		WebElement mybanner = wd.findElement(By.xpath("//input[@name='account.bannerOption']  "));
		mybanner.click();

		PetStoreMenu.Waitme18();

		WebElement saveaccount = wd.findElement(By.xpath("//input[@name='newAccount'] "));
		saveaccount.click();

		PetStoreMenu.Waitme18();

		wd.navigate().back();

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

		PetStoreMenu.clickCentralHugeBird(wd);
		PutInBasket.Waitme18();
		PutInBasket.clickAmazonParrot(wd);
		PutInBasket.Waitme18();
		PutInBasket.clickChooseAmazon(wd);
		PutInBasket.Waitme18();
		PutInBasket.clickAddToCart(wd);

		wd.get(PutInBasket.URL1_XPATH);
		PutInBasket.Waitme18();
		PetStoreMenu.clickReptiles(wd);
		PutInBasket.Waitme18();
		PutInBasket.clickRattlesnake(wd);
		PutInBasket.Waitme18();
		PutInBasket.clickChooseRattlesnake(wd);
		PutInBasket.clickAddToCart(wd);

		PutInBasket.clickCheckout(wd);

		PutInBasket.Waitme18();

		PutInBasket.clickContinue(wd);

		PutInBasket.Waitme18();

		PutInBasket.clickConfirm(wd);

		PutInBasket.Waitme18();

		PutInBasket.clickMyAccount(wd);
		PutInBasket.Waitme18();
		PutInBasket.clickMyOrders(wd);
		PutInBasket.Waitme18();

		SignIn.clickSignOut(wd);

	}

}
