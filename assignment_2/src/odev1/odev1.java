package odev1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class odev1 {
	
	public static void main(String[] args) throws InterruptedException {
//		System.out.println("Hello TA");
		WebDriver driver= new ChromeDriver();
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("CodingBook");
		driver.findElement(By.name("btnK")).submit();
		
		driver.findElement(By.xpath("//span[.='CodingBook – Shape your future']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Test Automation")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[@data-tab='#tab-curriculum']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"section-html-element-locators-5\"]/ul/li[8]/a/span")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("https://www.youtube.com/watch?v=LYqbNg5I9sA")).click();
		
		Thread.sleep(5000);
		
		
		driver.close();
	}

}

