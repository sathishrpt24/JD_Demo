package jd.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumHome {
	
	@Test
	public void setUp() {
		
		System.out.println("Driver Intialization");
		
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Browser opened");
		
		driver.navigate().to("https://facebook.com");
		
		System.out.println("Getting page tittle");
		
		String s1 = driver.getTitle();
		
		System.out.println("Tittle is: "+ s1);
	}

}
