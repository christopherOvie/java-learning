import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame2 {

	public static void main(String[] args) {
//		WebDriver driver = new ChromeDriver();
//		driver.get("https:// url containing i-frames/");
//		//By finding all the web elements using iframe tag
//		List<WebElement> iframeElements = driver.findElements(By.tagName("iframeResult"));
//		System.out.println("Total number of iframes are " + iframeElements.size());
//
//		//By executing a java script
//		JavascriptExecutor exe = (JavascriptExecutor) driver;
//		Integer noOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
//		//System.out.println("No. of iframes on the page are " + numberOfFrames);

		
		WebDriver driver = new ChromeDriver(); //navigates to the Browser
	    driver.get("https://demo.guru99.com/test/guru99home/"); 
	       // navigates to the page consisting an iframe

	       driver.manage().window().maximize();
	       driver.switchTo().frame("a077aa5e"); //switching the frame by ID

			System.out.println("********We are switch to the iframe*******");
     		driver.findElement(By.xpath("html/body/a/img")).click();
  		    //Clicks the iframe
       
  			System.out.println("*********We are done***************");
		
	}

}
