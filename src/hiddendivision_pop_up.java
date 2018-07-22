import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class hiddendivision_pop_up {
	public static void main(String[] args) throws InterruptedException {
		String Key="webdriver.geckodriver";
		String value="./software/gecodriver";
		System.setProperty(Key, value);
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("//label[.='Onward Date']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//td[.='27'])[2]")).click();
		
	}
	
	
}
