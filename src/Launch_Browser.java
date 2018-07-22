import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_Browser {
	static{
		String key="webdriver.gecko.driver";
		String value="./Software/geckodriver.exe";
		System.setProperty(key, value);
		/*String key1="webdriver.chrome.driver";
		String value1="./Software/chromedriver.exe";
		System.setProperty(key1, value1);*/
		
		
	}
	
	public static void main(String[] args) {
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("file:///d:/Desktop/xpath.html");
		WebElement ele = driver.findElement(By.tagName("a"));
		ele.click();
		
		driver.quit();
		/*ChromeDriver driver1= new ChromeDriver();
		driver1.quit();*/
		
		
	}

}
