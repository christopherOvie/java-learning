package complexFrameWindows31to36;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test32JavascriptException {

	public static void main(String[] args) throws InterruptedException {
		//Open chrome browser
				WebDriverManager.chromedriver().setup();
				RemoteWebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				//Launch site
				driver.get("https://selectorshub.com/shadow-dom-in-iframe/");
				Thread.sleep(5000);
				//switch to frame
				
				driver.switchTo().frame("pact");
				
		WebElement shadoeHost=		driver.findElement(By.id("snacktime"));
	SearchContext shadowRootElement=shadoeHost.getShadowRoot();
    WebElement targetElement=shadowRootElement.findElement(By.className("food"));


try
{
	targetElement.click();
	
}
catch(JavascriptException ex)
{
	driver.executeScript("arguments[0].click();", targetElement);

}
}
}