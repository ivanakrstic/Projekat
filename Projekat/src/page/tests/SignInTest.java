package page.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import page.objects.SignIn;

public class SignInTest {

	public static void Waitme() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Crome Driver\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		String url = "https://petstore.octoperf.com/actions/Account.action?newAccountForm=";
		wd.get(url);
		wd.manage().window().maximize();

		WebElement signin = wd.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/a[2]"));
		signin.click();

		Waitme();

		WebElement username = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/form[1]/p[2]/input[1]"));
		username.click();
		username.sendKeys("blagoje14");

		SignIn.getPassword(wd).clear();

		WebElement passworde = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/form[1]/p[2]/input[2]"));
		passworde.click();
		passworde.sendKeys("milanovic45");

		Waitme();

		WebElement login = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/form[1]/input[1]"));
		login.click();

		Waitme();

		WebElement signout = wd.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/a[2]"));
		signout.click();

		wd.close();

	}

}
