import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fileuploadpopup {
	public static void main(String[] args) throws InterruptedException {
		String Key="webdriver.geckodriver";
		String value="./software/gecodriver";
		System.setProperty(Key, value);
		WebDriver driver= new FirefoxDriver();
		driver.get("file:///d:/Desktop/links/file%20upload%20popup.html");
		WebElement ele = driver.findElement(By.xpath("//input[@id='uploadfile']"));
				ele.sendKeys("d:\\Downloads\\Lathavya Buddya BC_Resume.doc");
		
	}
		
		
	

}
