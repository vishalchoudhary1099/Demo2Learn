package sele;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
WebDriver driver= new FirefoxDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("https://www.google.co.in/");
if (driver.findElement(By.xpath("//input[@name='q']")).isEnabled());
{ System.out.println("it is enable");

	} 
else
	{ System.out.println("Not enable");
	}
}
}