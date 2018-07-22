import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class scrolldown {
	public static void main(String[] args) throws InterruptedException {
		String key = "webdriver.gecodriver";
		String value="./software/gecodriver";
		System.setProperty(key, value);
		 WebDriver driver = new FirefoxDriver();
	driver.get("https://www.flipkart.com/");
	JavascriptExecutor js = (JavascriptExecutor) driver;
	Thread.sleep(3000);
	for(int j=0;j<4; j++){
	js.executeScript("window.scrollBy(0,600)");
	}
}
}