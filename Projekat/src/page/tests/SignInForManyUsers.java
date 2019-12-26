package page.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.objects.HomePage;
import page.objects.PetStoreMenu;
import page.objects.Registration;
import page.objects.SignIn;

public class SignInForManyUsers {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Crome Driver\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		// String src = "UserRandomData.xls";
		wd.get(HomePage.URL);
		HomePage.Waitme15();
		HomePage.clickEnterTheStore(wd);
		PetStoreMenu.clickSignIn(wd);

		ExcelUtils.setExcell("UserRandomData.xls");
		ExcelUtils.setWorkSheet(0);

		for (int i = 1; i < ExcelUtils.getRowNumber(); i++) {

			PetStoreMenu.clickSignIn(wd);
			String username, password;
			username = ExcelUtils.getDataAt(i, 0);
			password = ExcelUtils.getDataAt(i, 1);

			SignIn.getUsername(wd).clear();
			SignIn.getPassword(wd).clear();

			SignIn.inputUsername(wd, username);
			SignIn.inputPassword(wd, password);

			SignIn.clickLogin(wd);
			PetStoreMenu.Waitme18();
			// SignIn.clickSignOut(wd);

		}
		wd.quit();

	}

}
