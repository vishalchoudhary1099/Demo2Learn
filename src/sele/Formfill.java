package sele;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Formfill {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("vishal");
		driver.findElement(By.xpath("//input[@name= 'lastname']")).sendKeys("choudhary");
		driver.findElement(By.xpath("//input[@id= 'u_0_r']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@id= 'u_0_u']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@id='u_0_w']")).sendKeys("12345");
		Select select = new Select(driver.findElement(By.id("day")));
		select.selectByVisibleText("5");
		Select select1 = new Select(driver.findElement(By.id("month")));
		select1.selectByVisibleText("Dec");
		Select select2 = new Select(driver.findElement(By.id("year")));
		select2.selectByVisibleText("1989");
		driver.findElement(By.xpath("//input[@name='sex']")).click();
		driver.findElement(By.xpath("//input[@name='websubmit']")).click();
	
		
		

	}

}
