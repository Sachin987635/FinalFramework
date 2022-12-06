package org.testing.TestScripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testing.Base.Base;
import org.testing.Utilities.ScreenshotCapture;
import org.testng.annotations.Test;

public class TC6 extends Base{
	@Test
	public void CommentOnVideo() throws InterruptedException {
		driver.findElement(By.xpath(pr.getProperty("SigninBtn"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pr.getProperty("Username"))).sendKeys("skfirstemail@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(pr.getProperty("Password"))).sendKeys("Test123@");
		driver.findElement(By.id("passwordNext")).click();
		Thread.sleep(2000);
		driver.findElement(By.id(pr.getProperty("PlayVideo"))).click();
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("window.scrollBy(0,500)","");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("div[id='placeholder-area']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div[id='contenteditable-root']")).sendKeys("Nice");
		//*[@id="submit-button"]
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='footer-text']/following::div[2]/child::ytd-button-renderer[@id='submit-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='avatar-btn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(pr.getProperty("Logout"))).click();
	}
}
