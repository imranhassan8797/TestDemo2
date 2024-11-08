package orangehrmdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Welcome {

	WebDriver driver;
	
	public Welcome(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By myInfo=By.xpath("//span[text()='My Info']");
	
	public void clickOnMyInfo() {
		driver.findElement(myInfo).click();
	}
	
}
