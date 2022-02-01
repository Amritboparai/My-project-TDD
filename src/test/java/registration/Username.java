package registration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Username {
	
	WebDriver driver;
	@Given("User must on homepage by clicking on Url {string}")
	public void user_must_be_on_homepage_by_clicking_on_url(String string) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe") ;
	 
	driver=new ChromeDriver();
	 driver.get(string);
	    
	}

	@Given("Click on signup button")
	public void click_on_signup_button() throws InterruptedException {
		driver.findElement(By.id("signin2")).click();
		Thread.sleep(4000);
	}

	@When("Signup with your username and password")
	public void signup_with_your_username_and_password() throws InterruptedException {
		driver.findElement(By.id("sign-username")).sendKeys("ranjaarock");
		Thread.sleep(5000);
		driver.findElement(By.id("sign-password")).sendKeys("al557850074");
		Thread.sleep(3000);
	    
	}

	@When("Click on signup")
	public void click_on_signup() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")).click();
		Thread.sleep(3000);
		
	}

	@Then("Click ok on succesful  alert")
	public void click_ok_on_succesful_alert() throws InterruptedException {
		Alert alert =driver.switchTo().alert();
		alert.accept();
		driver.close();
		
	   
	}

}
