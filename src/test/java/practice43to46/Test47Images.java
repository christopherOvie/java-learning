package practice43to46;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test47Images {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		//create a folder
		
		File folder= new File("C:\\Wallpaper");
		if(!folder.exists()) {
			folder.mkdir();
		}
		//collect all images in page source
		
		List<WebElement> images=	driver.findElements(By.tagName("img"));
		System.out.println(images.size());
		int count = 1;
		for(WebElement image:images) {
		String imageURL=	image.getAttribute("src");
		String fileName= "image" + "+ count + " + ".png";
		//contact thaat scr url to download  image
		}
		
	
	}

}
