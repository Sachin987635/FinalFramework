package org.testing.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {
	WebDriver driver;Properties pr;
	public Homepage(WebDriver driver,Properties pr) {
		this.driver=driver;
		this.pr=pr;
	}
	public void Trendingclick() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath(pr.getProperty("Explore"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pr.getProperty("Trending"))).click();
	}
	public void History() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath(pr.getProperty("History"))).click();
	}
	public void Subscriptions() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath(pr.getProperty("Subscriptions"))).click();
	}
}
