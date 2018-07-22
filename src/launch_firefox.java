import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launch_firefox {
public static void main(String[] args) {
	String key= "webdriver.geco.driver";
	String value=".software/gecodriver.exe";
	System.setProperty(key, value);
	WebDriver driver= new FirefoxDriver();
	driver.quit();
}
}
