package alternativeMethod;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test38 {

	public static void main(String[] args) throws InterruptedException {
		//Open browser
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver(); 
		//Launch site using base URL
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		try{
		driver.findElement(By.xpath("//span[text()='Login']/preceding::button[1]")).click();
        }
   catch(Exception ex) {
System.out.println("no banner this time");

       }
		
		Thread.sleep(5000); 
		driver.findElement(By.xpath("//div[text()='Fashion']")).click();
		Thread.sleep(5000); 
		//click on "VIEW ALL"
		driver.findElement(By.xpath("(//a[text()='VIEW ALL'])[1]")).click();
		Thread.sleep(5000); 
		driver.findElement(By.xpath("//div[text()='Top Mirrorless Cameras']")).click();
		
	List<WebElement> vs  =	driver.findElements(By.cssSelector("div[class='_4rR01T']"));
	//List<String> li= new ArrayList<String>();
//	for(WebElement w1:all) {
//		//System.out.println(li.add(w1.getText()));
//		li.add(w1.getText());
//		return;
//		
////	}
//	 System.out.println("total no of value"+vs.size());
//     for (WebElement product : vs) {
//         System.out.println(product.getText());
//         System.out.println("<======================================>");
//     }
	
	for(int i=0;i<vs.size();i++) {
		System.out.println(vs.get(i).getText());
	}

	}

}
