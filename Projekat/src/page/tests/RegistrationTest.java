package page.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import page.objects.HomePage;
import page.objects.PetStoreMenu;
import page.objects.SignIn;

public class RegistrationTest {

	public static void Waitme() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Crome Driver\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		String url = "https://petstore.octoperf.com/actions/Account.action?signonForm=";
		wd.get(url);
		wd.manage().window().maximize();

		// a[contains(text(),'Sign In')]

		WebElement register = wd.findElement(By.xpath("//a[contains(text(),'Register Now!')]"));
		register.click();

		// User information

		WebElement userid = wd.findElement(By.xpath("//input[@name='username']"));
		userid.click();
		userid.sendKeys("blagoje14");

		WebElement password = wd.findElement(By.xpath("//input[@name='password']"));
		password.click();
		password.sendKeys("milanovic45");

		WebElement rpassword = wd.findElement(By.xpath("//input[@name='repeatedPassword'] "));
		rpassword.click();
		rpassword.sendKeys("milanovic45");

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

		Waitme();

		Select language = new Select(wd.findElement(By.xpath("//select[@name='account.languagePreference'] ")));
		language.selectByVisibleText("english");

		Select category = new Select(wd.findElement(By.xpath("//select[@name='account.favouriteCategoryId'] ")));
		category.selectByVisibleText("BIRDS");

		Waitme();
		
		WebElement mylist = wd.findElement(By.xpath(" //input[@name='account.listOption']   "));
		mylist.click();
		
		Waitme();

		WebElement mybanner = wd.findElement(By.xpath("//input[@name='account.bannerOption']  "));
		mybanner.click();
		
		Waitme();
		
		WebElement saveaccount = wd.findElement(By.xpath("//input[@name='newAccount'] "));
		saveaccount.click();
		
		Waitme();
		
		
		wd.navigate().back();
		
		PetStoreMenu.clickSignIn(wd);
		
		Waitme();
		
		SignIn.clickLogin(wd);
		
		Waitme();
		
		
		WebElement username = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/form[1]/p[2]/input[1]"));
		username.click();
		username.sendKeys("blagoje14");
		
		SignIn.getPassword(wd).clear();
		
		WebElement passworde = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/form[1]/p[2]/input[2]"));
		passworde.click();
		passworde.sendKeys("milanovic45");

		WebElement login = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/form[1]/input[1]"));
		login.click();
		
		Waitme();
		
		WebElement myaccount = wd.findElement(By.xpath("//a[contains(text(),'My Account')]"));
		myaccount.click();
		
		SignIn.clickSignOut(wd);

		wd.close();

	}
}
