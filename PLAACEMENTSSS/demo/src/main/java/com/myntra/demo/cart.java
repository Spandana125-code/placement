package com.myntra.demo;
	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
	public class cart {

		

		public static void main(String[] args)  {
			// TODO Auto-generated method stub
		     
		WebDriver driver = new ChromeDriver();
	
		//maximizing the browser
		driver.manage().window().maximize();
		//opening 
		driver.get("https://www.nybaebeauty.com/#");
	driver.get("https://www.nybaebeauty.com/products/ny-bae-pink-pouch");
	driver.findElement(By.xpath("(//button[@id='AddToCart'])[1]")).click();
	


	
	}
	}