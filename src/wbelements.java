import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class wbelements {
	public static void main(String[] args) {
		
		String key="webdriver.gecko.driver";
		String value="./Software/geckodriver.exe";
		System.setProperty(key, value);
		WebDriver driver= new FirefoxDriver();
		driver.get("https://wwww.google.com");
		WebElement ele = driver.findElement(By.xpath("// input[@ id='lst-ib']"));
		boolean b=ele.isDisplayed();
		System.out.println(b);
		
		
		
		
	
	}
}
