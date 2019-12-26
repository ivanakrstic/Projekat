package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PetStoreMenu {
	
	public static final String URL = "https://petstore.octoperf.com/actions/Catalog.action"; 
	
	//left part
	
	public static final String FISH_XPATH = "//div[@id='Content']//a[1]//img[1]";
	public static final String DOGS_XPATH = "//div[@id='Content']//a[2]//img[1]";
	public static final String CATS_XPATH = "//div[@id='Content']//a[3]//img[1]";
	public static final String REPTILES_XPATH = "//div[@id='Content']//a[4]//img[1]";
	public static final String BIRDS_XPATH = "//div[@id='Content']//a[5]//img[1] ";
	
	//Central up part
	
	public static final String UPFISH_XPATH = "//div[@id='QuickLinks']//a[1]//img[1]";
	public static final String UPDOGS_XPATH = "//div[@id='Header']//a[2]//img[1]";
	public static final String UPCATS_XPATH = "//div[@id='Header']//a[4]//img[1]";
	public static final String UPREPTILES_XPATH = "//div[@id='Header']//a[3]//img[1]";
	public static final String UPBIRDS_XPATH = "//div[@id='Header']//a[5]//img[1] ";
	
	//Central part
	
	public static final String CENTRALFISH_XPATH = "//body//area[2] ";
	public static final String CENTRALDOG_XPATH = "//body//area[3]";
	public static final String CENTRALCAT_XPATH = "//body//area[5] ";
	public static final String CENTRALREPTILE_XPATH = "//body//area[4]";
	public static final String CENTRALSMALLBIRD_XPATH = "//body//area[6]  ";
	public static final String CENTRALHUGEBIRD_XPATH = "/html[1]/body[1]/div[2]/div[2]/div[2]/div[1]/map[1]/area[1] ";
	public static final String SIGNIN_XPATH = "/html[1]/body[1]/div[1]/div[2]/div[1]/a[2]  ";
	
	//Fish
	
	public static WebElement getFish(WebDriver wd) {
		return wd.findElement(By.xpath(FISH_XPATH));
	}

	public static void clickFish(WebDriver wd) {
		getFish(wd).click();
	}
	
	//Dogs
	
	public static WebElement getDogs(WebDriver wd) {
		return wd.findElement(By.xpath(DOGS_XPATH));
	}

	public static void clickDogs(WebDriver wd) {
		getDogs(wd).click();
	}
	
	//Cats
	
	public static WebElement getCats(WebDriver wd) {
		return wd.findElement(By.xpath(CATS_XPATH));
	}

	public static void clickCats(WebDriver wd) {
		getCats(wd).click();
	}
	
	//Reptiles
	
	public static WebElement getReptiles(WebDriver wd) {
		return wd.findElement(By.xpath(REPTILES_XPATH));
	}

	public static void clickReptiles(WebDriver wd) {
		getReptiles(wd).click();
	}
	
	//Birds
	
	public static WebElement getBirds(WebDriver wd) {
		return wd.findElement(By.xpath(BIRDS_XPATH));
	}

	public static void clickBirds(WebDriver wd) {
		getBirds(wd).click();
	}
	
	//Upfish
	
	public static WebElement getUpFish(WebDriver wd) {
		return wd.findElement(By.xpath(UPFISH_XPATH));
	}

	public static void clickUpFish(WebDriver wd) {
		getUpFish(wd).click();
	}
	
	//Updogs
	
	public static WebElement getUpDogs(WebDriver wd) {
		return wd.findElement(By.xpath(UPDOGS_XPATH));
	}

	public static void clickUpDogs(WebDriver wd) {
		getUpDogs(wd).click();
	}
	
	//Upcats
	
	public static WebElement getUpCats(WebDriver wd) {
		return wd.findElement(By.xpath(UPCATS_XPATH));
	}

	public static void clickUpCats(WebDriver wd) {
		getUpCats(wd).click();
	}
	
	//Upreptiles
	
	public static WebElement getUpReptiles(WebDriver wd) {
		return wd.findElement(By.xpath(UPREPTILES_XPATH));
	}

	public static void clickUpReptiles(WebDriver wd) {
		getUpReptiles(wd).click();
	}
	
	//Upbirds
	
	public static WebElement getUpBirds(WebDriver wd) {
		return wd.findElement(By.xpath(UPBIRDS_XPATH));
	}

	public static void clickUpBirds(WebDriver wd) {
		getUpBirds(wd).click();
	}
	
	//Centralfish
	
	public static WebElement getCentralFish(WebDriver wd) {
		return wd.findElement(By.xpath(CENTRALFISH_XPATH));
	}

	public static void clickCentralFish(WebDriver wd) {
		getCentralFish(wd).click();
	}
	
	//Centraldog
	
	public static WebElement getCentralDog(WebDriver wd) {
		return wd.findElement(By.xpath(CENTRALDOG_XPATH));
	}

	public static void clickCentralDog(WebDriver wd) {
		getCentralDog(wd).click();
	}
	
	//Centralcat
	
	public static WebElement getCentralCat(WebDriver wd) {
		return wd.findElement(By.xpath(CENTRALCAT_XPATH));
	}

	public static void clickCentralCat(WebDriver wd) {
		getCentralCat(wd).click();
	}
	
	//Centralreptile
	
	public static WebElement getCentralReptile(WebDriver wd) {
		return wd.findElement(By.xpath(CENTRALREPTILE_XPATH));
	}

	public static void clickCentralReptile(WebDriver wd) {
		getCentralReptile(wd).click();
	}
	
	//Centralsmallbird
	
	public static WebElement getCentralSmallBird(WebDriver wd) {
		return wd.findElement(By.xpath(CENTRALSMALLBIRD_XPATH));
	}

	public static void clickCentralSmallBird(WebDriver wd) {
		getCentralSmallBird(wd).click();
	}
	
	//Centralhugebird
	
	public static WebElement getCentralHugeBird(WebDriver wd) {
		return wd.findElement(By.xpath(CENTRALHUGEBIRD_XPATH));
	}

	public static void clickCentralHugeBird(WebDriver wd) {
		getCentralHugeBird(wd).click();
	}
	
	//Signin
	
	public static WebElement getSignIn(WebDriver wd) {
		return wd.findElement(By.xpath(SIGNIN_XPATH));
	}

	public static void clickSignIn(WebDriver wd) {
		getSignIn(wd).click();
	}
	
	
	
	public static void Waitme18() {
		try {
			Thread.sleep(1800);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

//	public static void main(String[] args) {
//
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Crome Driver\\chromedriver.exe");
//		WebDriver wd = new ChromeDriver();
//		String url = "https://petstore.octoperf.com/actions/Account.action?signonForm=";
//		wd.get(url);
//		wd.manage().window().maximize();
//		
//		//left part
//
//		WebElement fish = wd.findElement(By.xpath("//div[@id='Content']//a[1]//img[1] "));
//		fish.click();
//		
//		WebElement dogs = wd.findElement(By.xpath("//div[@id='Content']//a[2]//img[1]  "));
//		dogs.click();
//		
//		WebElement cats = wd.findElement(By.xpath("//div[@id='Content']//a[3]//img[1]  "));
//		cats.click();
//		
//		WebElement reptiles = wd.findElement(By.xpath("//div[@id='Content']//a[4]//img[1]   "));
//		reptiles.click();
//		
//		WebElement birds = wd.findElement(By.xpath("//div[@id='Content']//a[5]//img[1]   "));
//		birds.click();
//		
//		//central up part
//		
//		WebElement upfish = wd.findElement(By.xpath("//div[@id='QuickLinks']//a[1]//img[1]   "));
//		upfish.click();
//		
//		WebElement updogs = wd.findElement(By.xpath("//div[@id='Header']//a[2]//img[1]  "));
//		updogs.click();
//		
//		WebElement upreptiles = wd.findElement(By.xpath("//div[@id='Header']//a[3]//img[1]   "));
//		upreptiles.click();
//		
//		WebElement upcats = wd.findElement(By.xpath("//div[@id='Header']//a[4]//img[1]  "));
//		upcats.click();
//		
//		WebElement upbirds = wd.findElement(By.xpath("//div[@id='Header']//a[5]//img[1]   "));
//		upbirds.click();
//		
//		//central part  
//		
//		WebElement centralfish = wd.findElement(By.xpath("//body//area[2]   "));
//		centralfish.click();
//		
//		WebElement centraldogs = wd.findElement(By.xpath("//body//area[3]   "));
//		centraldogs.click();
//		
//		WebElement centralreptile = wd.findElement(By.xpath("//body//area[4]   "));
//		centralreptiles.click();
//		
//		WebElement centralcat = wd.findElement(By.xpath("//body//area[5]   "));
//		centralcat.click();
//		
//		WebElement centralsmallbird = wd.findElement(By.xpath("//body//area[6]   "));
//		centralsmallbird.click();
//		
//		WebElement centralhugebird = wd.findElement(By.xpath("//body//area[1]   "));
//		centralhugebird.click();
//		
//		WebElement signin = wd.findElement(By.xpath("//a[contains(text(),'Sign In')]   "));
//		signin.click();
//	}
}
