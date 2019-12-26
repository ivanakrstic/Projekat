package page.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.objects.HomePage;
import page.objects.PetStoreMenu;
import page.objects.Registration;

public class RegistrationForManyUsers {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Crome Driver\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		// String src = "UserRandomData.xls";
		wd.get(HomePage.URL);
		HomePage.Waitme15();
		HomePage.clickEnterTheStore(wd);
		PetStoreMenu.clickSignIn(wd);
		Registration.clickRegisterNow(wd);

		ExcelUtils.setExcell("UserRandomData.xls");
		ExcelUtils.setWorkSheet(0);

		for (int i = 1; i < ExcelUtils.getRowNumber(); i++) {
			PetStoreMenu.clickSignIn(wd);
			Registration.clickRegisterNow(wd);
			PetStoreMenu.Waitme18();
			String userid, password, repeatpassword, firstname, lastname, email, phone, adress1, adress2, city, state,
					zip, country;
			userid = ExcelUtils.getDataAt(i, 0);
			password = ExcelUtils.getDataAt(i, 1);
			repeatpassword = ExcelUtils.getDataAt(i, 1);
			firstname = ExcelUtils.getDataAt(i, 2);
			lastname = ExcelUtils.getDataAt(i, 3);
			email = ExcelUtils.getDataAt(i, 4);
			phone = ExcelUtils.getDataAt(i, 5);
			adress1 = ExcelUtils.getDataAt(i, 6);
			adress2 = ExcelUtils.getDataAt(i, 7);
			city = ExcelUtils.getDataAt(i, 8);
			state = ExcelUtils.getDataAt(i, 9);
			zip = ExcelUtils.getDataAt(i, 10);
			country = ExcelUtils.getDataAt(i, 11);
			// language= ExcelUtils.getDataAt(i, 12);
			// category= ExcelUtils.getDataAt(i, 13);
			// list= ExcelUtils.getDataAt(i, 14);
			// banner= ExcelUtils.getDataAt(i, 15);

//			double ph = Double.parseDouble(ExcelUtils.getDataAt(i, 1).toString());
//			int ph2 = (int) ph;
//			userid = String.valueOf(ph2);
//
//		    double pc = Double.parseDouble(ExcelUtils.getDataAt(i, 10).toString());
//			int pc2 = (int) pc;
//			zip = String.valueOf(pc2);

			Registration.getUserId(wd).clear();
			Registration.getPassword(wd).clear();
			Registration.getRepeatPassword(wd).clear();
			Registration.getFirstName(wd).clear();
			Registration.getLastName(wd).clear();
			Registration.getEmail(wd).clear();
			Registration.getPhone(wd).clear();
			Registration.getAdress1(wd).clear();
			Registration.getAdress2(wd).clear();
			Registration.getCity(wd).clear();
			Registration.getState(wd).clear();
			Registration.getZip(wd).clear();
			Registration.getCountry(wd).clear();

			Registration.inputUserId(wd, userid);
			Registration.inputPassword(wd, password);
			Registration.inputRepeatPassword(wd, repeatpassword);
			Registration.inputFirstName(wd, firstname);
			Registration.inputLastName(wd, lastname);
			Registration.inputEmail(wd, email);
			Registration.inputPhone(wd, phone);

			PetStoreMenu.Waitme18();

			Registration.inputAdress1(wd, adress1);
			Registration.inputAdress2(wd, adress2);
			Registration.inputCity(wd, city);
			Registration.inputState(wd, state);
			Registration.inputZip(wd, zip);
			Registration.inputCountry(wd, country);

			PetStoreMenu.Waitme18();
			// Registration.inputLanguage(wd, language);
			// Registration.inputCategory(wd, category);
			// Registration.getList(wd);
			// Registration.getBanner(wd);

			Registration.clickSaveAccount(wd);

			// HomePage.clickEnterTheStore(wd);
		}
		wd.quit();
	}
}
