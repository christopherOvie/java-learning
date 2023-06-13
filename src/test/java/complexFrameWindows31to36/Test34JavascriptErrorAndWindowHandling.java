package complexFrameWindows31to36;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test34JavascriptErrorAndWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		//Open chrome browser using chromedriver software
				WebDriverManager.chromedriver().setup();
				RemoteWebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				//Launch site
				driver.get("https://selectorshub.com/shadow-dom-in-iframe/");
				Thread.sleep(5000);
				//switch to frame
				driver.switchTo().frame("pact");
				//driver.switchTo().frame(0);
				//target Element is inside single shadow DOM
				WebElement shadowHostElement=driver.findElement(By.id("snacktime"));
				SearchContext shadowRootElement=shadowHostElement.getShadowRoot();
				WebElement targetElement=shadowRootElement.findElement(By.className("food"));
				
				try
				{
					targetElement.click();
					
				}
				catch(JavascriptException ex)
				{
					driver.executeScript("arguments[0].click();", targetElement);

				}
				
				//switch to newly opened window
				
			Set<String>s=	driver.getWindowHandles();
			List<String>l= new ArrayList <String>(s);
			driver.switchTo().window(l.get(1));
			
			driver.findElement(By.xpath("//li[@id='menu-item-48']/a")).click();

	}

}
