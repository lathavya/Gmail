import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class datainsidetextbox {
	public static void main(String[] args) throws InterruptedException {
		String key = "webdriver.gecodriver";
		String value="./software/gecodriver";
		System.setProperty(key, value);
		 WebDriver driver = new FirefoxDriver();
		 driver.get("file:///d:/Desktop/links/disable.html");
		 //driver.findElement(By.xpath("//input[@id ='t1']"));
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 Thread.sleep(5000);
		 js.executeScript("document.getElementById ('t1').value='xyz'");
		// didn't get
	}

}
