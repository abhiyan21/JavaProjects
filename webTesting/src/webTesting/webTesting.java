package webTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webTesting {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("abc.gmail.com");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("password");
		driver.findElement(By.xpath("//*[@id=\"u_0_h_ng\"]")).click();
		//driver.quit();
	}

}
