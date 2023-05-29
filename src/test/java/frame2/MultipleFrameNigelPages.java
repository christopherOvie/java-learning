package frame2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleFrameNigelPages {
	
	RemoteWebDriver driver;
	public void setUp(String browserName) 
	{
	if(browserName.matches("chrome")) {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
	}
	
	}
	
	public void openUrl(String url) {
	
		driver.get(url); 
	}
	
	public void clickBackground() {
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//a[contains(text(), ' Background')]")).click();

		driver.switchTo().defaultContent();
	}
	
	public void clickUpdate() {
		//Click on Close button
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//input[@name='update']")).click();

		
		driver.switchTo().defaultContent();
	}
	
	public void tryCoding() {
		driver.switchTo().frame(2);
		driver.findElement(By.xpath("(//a[normalize-space()='TRY CODING'])[1]")).click();
		driver.switchTo().defaultContent(); //back to page
	}
	public static void main(String[] args) throws InterruptedException {
		
		MultipleFrameNigelPages m = new MultipleFrameNigelPages();
		m.setUp("chrome");
		m.openUrl("http://www.maths.surrey.ac.uk/explore/nigelspages/frame2.htm");
		m.clickBackground();
		m.clickUpdate();
		m.tryCoding();
		
}
}
