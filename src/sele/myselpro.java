package sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class myselpro {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("vishal.choudhary@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("V9431205436");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		

	}

}
