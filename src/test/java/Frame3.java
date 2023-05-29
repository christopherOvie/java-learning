import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frame3 {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		    driver.get("https://demo.guru99.com/test/guru99home/");  
		    driver.manage().window().maximize();
		   
		    driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		    driver.switchTo().frame(0);
		    //driver.findElement(By.id("save")).click();
		    int size = driver.findElements(By.tagName("iframe")).size();
		     for(int i=0; i<=size; i++){
			driver.switchTo().frame(i);
			driver.findElement(By.id("save")).click();
			   
			int total=driver.findElements(By.xpath("html/body/a/img")).size();
			System.out.println(total);
			//driver.findElement(By.id("save")).click();
		    driver.switchTo().defaultContent();
		   // driver.close();

	}

}
	}
