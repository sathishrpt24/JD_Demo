package jd.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class SeleniumHome1 {
	
	
	@Test
	public void setUp() {
		
		System.out.println("Driver Intialization");
		
		WebDriver driver1 = new ChromeDriver();
		
		System.out.println("Browser opened");
		
		driver1.navigate().to("https://facebook.com");
		
		System.out.println("Getting page tittle");
		
		String s1 = driver1.getTitle();
		
		System.out.println("Tittle is: "+ s1);
		driver1.quit();
				
	}
	
	@Test
	public void test1() {
		
		System.out.println("test1");
	}
	
	@Test
	public void test2() {
		
		System.out.println("test");
	}
	
	@Test
	public void test3() {
		
		System.out.println("test3");
	}
	
	@Test
	public void test4() {
		
		System.out.println("test4");
	}

}
