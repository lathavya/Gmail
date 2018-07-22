import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class scrolldowntoelement {
	public static void main(String[] args) throws InterruptedException {
		String key = "webdriver.gecodriver";
		String value="./software/gecodriver";
		System.setProperty(key, value);
		 WebDriver driver = new FirefoxDriver();
		 driver.get("https://www.facebook.com/");
	WebElement ele = driver.findElement(By.xpath("//a[.='Local']"));
	Point loc = ele.getLocation();
	System.out.println(loc);
	int x = loc.getX();
	int y = loc.getY();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy("+x+","+y+")");
	}
	
}
