package jd.com;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class SeleniumHome {
	
	//@Listeners(jd1.com.Listeners1.class)
	
	@Test(groups = {"Group1","Group2"})
	public void setUp() {
		
		System.out.println("Driver Intialization");
		
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Browser opened");
		
		driver.navigate().to("https://facebook.com");
		
		System.out.println("Getting page tittle");
		
		String s1 = driver.getTitle();
		
		System.out.println("Tittle is: "+ s1);
							driver.quit();
		
	}
	
	@Test(groups = {"Group1","Group2"})
	public void test11() {
		
		System.out.println("test1");
	}
	
	@Test
	public void test22() {
		
		System.out.println("test");
	}
	
	@Test
	public void test33() {
		
		System.out.println("test3");
	}
	
	@Test
	public void test44() {
		
		System.out.println("test4");
	}


}
