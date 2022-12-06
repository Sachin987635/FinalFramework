package org.testing.TestScripts;

import org.openqa.selenium.By;
import org.testing.Base.Base;
import org.testing.pages.Homepage;
import org.testing.pages.Login;
import org.testng.annotations.Test;

public class TC2 extends Base{
	@Test
	public void HistoryClick() throws InterruptedException {
		Login login=new Login(driver,pr);
		login.signin("skfirstemail@gmail.com", "Test123@");
		Homepage home=new Homepage(driver,pr);
		home.History();
	}
}
