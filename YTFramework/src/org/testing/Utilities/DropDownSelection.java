package org.testing.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelection {
	public  WebDriver driver;
	public void SelectByIndex(int a) {
		WebElement ds= driver.findElement(By.xpath(""));
		Select s=new Select(ds);
		s.selectByIndex(a);
	}
	public void SelectByValue(String a) {
		WebElement ds= driver.findElement(By.xpath(""));
		Select s=new Select(ds);
		s.selectByValue(a);
	}
	public void SelectByVisibleText(String a) {
		WebElement ds= driver.findElement(By.xpath(""));
		Select s=new Select(ds);
		s.selectByVisibleText(a);
	}
}
