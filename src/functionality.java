import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class functionality {
	public static void main(String[] args) {
		String Key="webdriver.geckodriver";
		String value="./software/gecodriver";
		System.setProperty(Key, value);
		WebDriver driver= new FirefoxDriver();
		driver.get("file:///d:/Desktop/links/textbox.html");
		// element is present
		
		WebElement	ele =driver.findElement(By.xpath("//input[@type='text']"));
		  boolean b = ele.isDisplayed();
		  System.out.println(b);
		  if(b){
			  System.out.println("element is present");
		  }
		  else{
			  System.out.println("element is not present");
			 
		  }
		
		  //element is disabled
		  
		  
	}
	

}
