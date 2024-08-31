package pomc;

import org.openqa.selenium.By;

import basepack.Base;

public class Try {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int OTP=567896;
		for(int i=6;i>=1;i--) {
        	
        	if(OTP>0) {
        		int dig=OTP%10;
        		
        		System.out.println(" dig value "+dig +"i value "+i);
//        		String path="(//input[contains(@name,'otp')])["+i+"]";
//        		Base.driver.findElement(By.xpath(path)).sendKeys(""+dig);
        		OTP=OTP/10;
        		
        		System.out.println("updated OTP "+OTP);
        		
        	}
        	
        }

	}

}
