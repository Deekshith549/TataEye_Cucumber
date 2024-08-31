package bussinesPack;

import java.util.Scanner;

import org.openqa.selenium.By;

import basepack.Base;
import io.cucumber.java.en.*;
import pomc.LoginPge;


public class Login {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Base.getDriver("chrome").get("https://www.titaneyeplus.com/");;
//	}
	LoginPge loginpage=new LoginPge();
	
	@Given("User opens chrome and tata eye website")
	public void user_opens_chrome_and_tata_eye_website() {
		Base.getDriver("chrome").get("https://www.titaneyeplus.com/");
	}

	@Given("User click on sign in")
	public void user_click_on_sign_in() {
		Base.driver.findElement(loginpage.Sigin).click();
	}

	@When("User enters moblie number")
	public void user_enters_moblie_number() {
		Base.driver.findElement(loginpage.mobileNo).sendKeys("9014216979");
		Base.driver.findElement(loginpage.continu).click();	
	}

	@When("User enters otp")
	public void user_enters_otp() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an Otp: ");

        // Read the integer input from the console
        int OTP = scanner.nextInt();
        System.out.println("You entered: " + OTP);
        scanner.close();
        
        for(int i=6;i>=1;i--) {
        	
        	if(OTP>0) {
        		int dig=OTP%10;
        		String path="(//input[contains(@name,'otp')])["+i+"]";
        		Base.driver.findElement(By.xpath(path)).sendKeys(""+dig);
        		OTP=OTP/10;
        		
        	}
        	
        }
        
        
	   
	}

	@Then("Verify user is logged in")
	public void verify_user_is_logged_in() {
	   
	}

	
	
}
