
package com.myntra.demo;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
public class Ss {

		public static void main(String[] args)  {
			// TODO Auto-generated method stub
		     
		WebDriver driver = new ChromeDriver();
		//maximizing the browser
		driver.manage().window().maximize();


    driver.get("https://www.nybaebeauty.com/checkouts/cn/Z2NwLWFzaWEtc291dGhlYXN0MTowMUpEMktGOVhUWTVUTjI5OVEzOUo2TjdYOQ?_ga=2.236831681.1526224105.1732032889-863944267.1732032889");
	driver.findElement(By.xpath("(//input[@id='email'])[1]")).sendKeys("span@gmail.com");
	driver.findElement(By.xpath("(//input[@id='TextField0'])[1]")).sendKeys("fn");
	driver.findElement(By.xpath("(//input[@id='TextField1'])[1]")).sendKeys("ln");
	driver.findElement(By.xpath("(//input[@id='shipping-address1'])[1]")).sendKeys("mys");
	driver.findElement(By.xpath("(//input[@id='TextField2'])[1]")).sendKeys("ban");
	driver.findElement(By.xpath("(//input[@id='TextField3'])[1]")).sendKeys("pan");

	driver.findElement(By.xpath("(//input[@id='TextField4'])[1]")).sendKeys("570003");

	driver.findElement(By.xpath("(//input[@id='TextField5'])[1]")).sendKeys("9110666830");

	driver.findElement(By.id("basic-paymentOnDelivery")).click();

	driver.findElement(By.xpath("(//input[@id='billing_address_selector-shipping_address'])[1]")).click();
	driver.findElement(By.xpath("(//button[@id='checkout-pay-button'])[1]")).click();
	driver.get("https://www.nybaebeauty.com/checkouts/cn/4cc231eac70a06139ddc488a312ef417/thank_you");

	}
	}