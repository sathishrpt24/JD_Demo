package jd1.com;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErrorCheck_FindAllElements {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://facebook.com");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,1000)");
		
		WebElement we = driver.findElement(By.linkText("Help"));
		
		js.executeScript("arguments[0].setAttribute('style',border:2px solid;');",we);
		
		System.out.println("Execution is completed");
			
		Thread.sleep(7000);
		
		driver.quit();
		
		
	}

}
