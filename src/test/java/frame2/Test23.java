package frame2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test23 {

	public static void main(String[] args) throws InterruptedException {
		//download latest "chromedriver" software
		WebDriverManager.chromedriver().setup();
		//ChromeDriver() constructor method runs chromedriver software to open chrome browser
		//And ChromeDriver() constructor method is useful to create "driver" object
		RemoteWebDriver	driver=new ChromeDriver();
		//Launch site
		driver.get(
		 "https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_file");
		Thread.sleep(5000);
		driver.findElement(By.id("accept-choices")).click();
		
		//file upload
				driver.switchTo().frame("iframeResult"); //using frame name
				Thread.sleep(5000);
				driver.findElement(By.id("myfile")).sendKeys("C:\\Users\\odibo ovie\\Desktop\\dog.jpeg");
				
				driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
				driver.switchTo().defaultContent(); //back to page level
				Thread.sleep(5000);
	}

}
