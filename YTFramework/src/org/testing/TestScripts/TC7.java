package org.testing.TestScripts;

import org.openqa.selenium.By;
import org.testing.Base.Base;
import org.testng.annotations.Test;

public class TC7 extends Base{
	@Test
	public void WatchLater() throws InterruptedException {
		driver.findElement(By.xpath(pr.getProperty("SigninBtn"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pr.getProperty("Username"))).sendKeys("skfirstemail@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(pr.getProperty("Password"))).sendKeys("Test123@");
		driver.findElement(By.id("passwordNext")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//ytd-guide-entry-renderer)[8]/child::a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='avatar-btn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(pr.getProperty("Logout"))).click();
	}
}
