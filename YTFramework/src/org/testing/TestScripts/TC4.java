package org.testing.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testing.Base.Base;
import org.testing.pages.Homepage;
import org.testing.pages.Login;
import org.testing.pages.SingleVidepage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC4 extends Base{
	@Test
	public void HitLike() throws InterruptedException {
		Login login=new Login(driver,pr);
		login.signin("skfirstemail@gmail.com", "Test123@");
		Assert.assertEquals("https://www.youtube.com/", "https://www.youtube.com/");
		SingleVidepage home=new SingleVidepage(driver,pr);
		home.Hitlike();
		}
}
 