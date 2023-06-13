package eccomrce37to41;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test38OneBrowser {

	public static void main(String[] args) throws InterruptedException {
		//Open browser
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver(); 
		//Launch site using base URL
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		Thread.sleep(5000); 
		//Close banner if exists
		try
		{
			driver.findElement(By.xpath(
			  "//span[text()='Login']/preceding::button[1]")).click();
			Thread.sleep(5000); 
		}
		catch(Exception ex)
		{
			System.out.println("No banner this time");
		}
		//click on "beauty" link
		//driver.findElement(By.xpath("//div[contains(text(),'Beauty')]")).click();
		Thread.sleep(5000); 
		driver.findElement(By.xpath("//div[text()='Fashion']")).click();
		
		Thread.sleep(5000); 
		//click on "VIEW ALL"
		driver.findElement(By.xpath("(//a[text()='VIEW ALL'])[1]")).click();
		Thread.sleep(5000); 
		driver.findElement(By.xpath("//div[text()='Handpicked Selection']")).click();
		Thread.sleep(5000); 
	List<WebElement> all=	driver.findElements(By.xpath("//div[text()='Newest First']/following::a[@class='IRpwTa _2-ICcC']"));
	for(int i=0;i<all.size();i++) {
		all.get(i).click();
		Thread.sleep(5000);
//		//switch to newly opened window/tab(2nd tab)
		Set<String> s=driver.getWindowHandles();
		List<String> l=new ArrayList<String>(s);
		driver.switchTo().window(l.get(1));
		
//		//get amount and display
	
String x=driver.findElement(By.xpath("//div[@id='price-info-icon']/preceding::div[@class='_30jeq3 _16Jk6d']")).getText();
	x=x.substring(1);
	x=x.replace(",", "");  //take text from 2nd position to avoid currency symbol
	
	System.out.println(x);  //remove , in value

//	//close that browser windows/tab
	driver.close();
//	//back to previous page
	driver.switchTo().window(l.get(0));
	Thread.sleep(2000);
//	
	}

	}

}
