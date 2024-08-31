package pomc;

import org.openqa.selenium.By;

public class LoginPge {
	
	public By Sigin=By.xpath("//a[contains(text(),\"Sign In\")]");
	public By mobileNo= By.name("mobile_no");
	public By continu= By.xpath("//button[@type='submit' and contains(text(),'Continue')]");
	public By myaccount=By.xpath("//a[contains(text(),'My Account') and @role='button']");
}
