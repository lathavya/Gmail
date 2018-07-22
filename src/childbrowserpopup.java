import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class childbrowserpopup {
	public static void main(String[] args) throws InterruptedException, AWTException {
		String Key="webdriver.geckodriver";
		String value="./software/gecodriver";
		System.setProperty(Key, value);
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		String parent_id = driver.getWindowHandle();
		System.out.println(parent_id);
	}
}
