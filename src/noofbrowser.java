import java.awt.AWTException;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class noofbrowser {
	public static void main(String[] args) throws InterruptedException, AWTException {
		String Key="webdriver.geckodriver";
		String value="./software/gecodriver";
		System.setProperty(Key, value);
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.naukri.com/");
	   Set<String> allwn = driver.getWindowHandles();
	   
	    int count = allwn.size();
	    		System.out.println(count);
	    		
	    		for(String wh:allwn)
	    		{
	    			driver.switchTo().window(wh);
	    			String title = driver.getTitle();
	    			System.out.println(title);
	    		}
	}
		
	}


