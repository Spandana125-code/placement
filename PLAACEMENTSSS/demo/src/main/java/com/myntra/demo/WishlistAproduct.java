package com.myntra.demo;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WishlistAproduct {
	public static void main(String[] args) throws InterruptedException {

	



		WebDriver driver = new ChromeDriver();
		//maximizing the browser
		driver.manage().window().maximize();
		//opening topodesign
		driver.get("https://www.nybaebeauty.com/account/login");


	    

		driver.findElement(By.id("CustomerEmail")).sendKeys("un@gmail.com");
		driver.findElement(By.id("CustomerPassword")).sendKeys("122");
		driver.findElement(By.xpath("(//input[@value='Sign In'])[1]")).click();



		

		}
}



