package org.testing.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SingleVidepage {
	WebDriver driver;
	Properties pr;
	public SingleVidepage(WebDriver driver,Properties pr) {
		this.driver=driver;
		this.pr=pr;
	}
	public void Hitlike() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.id("video-title")).click();
		WebElement element=driver.findElement(By.id("title"));
		String s=element.getText();
		System.out.println(s);
		Thread.sleep(5000);
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("window.scrollBy(0,500)","");
		driver.findElement(By.xpath("(//ytd-toggle-button-renderer[1]/yt-button-shape/button/yt-touch-feedback-shape/div/div[2])[1]")).click();

	}
}
