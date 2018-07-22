import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class applaunch {
	public static void main(String[] args) {
		String key="webdriver.gecko.driver";
		String value="./Software/geckodriver.exe";
		System.setProperty(key, value);
		WebDriver driver= new FirefoxDriver();
		driver.get("https://outlook.live.com/owa/");
		driver.findElement(By.xpath("//div[@class='buttonLargeBlue']")).click();
		driver.findElement(By.id("i0116")).sendKeys("9035718788");
		
	}

}
