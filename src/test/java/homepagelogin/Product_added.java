package homepagelogin;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Product_added {
	WebDriver driver;
	@Given("User must be on homepage by clicking on Url {string}")
	public void user_must_be_on_homepage_by_clicking_on_url(String string) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe") ;
		 
		driver=new ChromeDriver();
		driver.get(string);
		
	}

	@Given("User Click on login button")
	public void user_click_on_login_button() throws InterruptedException {
		driver.findElement(By.id("login2")).click();
		Thread.sleep(3000);
	}

	@Given("Login with username and password")
	public void login_with_username_and_password() throws InterruptedException {
		driver.findElement(By.id("loginusername")).sendKeys("amrit3132");
		driver.findElement(By.id("loginpassword")).sendKeys("pal3132");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@onclick='logIn()']")).click();
		Thread.sleep(4000);
		driver.navigate().refresh();
		
		 driver.findElement(By.xpath("//a[contains(text(),'Laptops')]")).click();
		 Thread.sleep(2000);
		 
	}

	@When("User click on any of the laptop name")
	public void user_click_on_any_of_the_laptop_name() throws InterruptedException {
		driver.findElement(By.className("hrefch")).click();
		Thread.sleep(3000);
	}

	@When("Click on ADD TO CARt")
	public void click_on_add_to_ca_rt() throws InterruptedException {
	    driver.findElement(By.cssSelector("#tbodyid > div.row > div > a")).click();
	    Thread.sleep(2000);
	}

	@When("Click ok on product added  alert")
	public void click_ok_on_product_added_alert() {
	    Alert alert =driver.switchTo().alert();
		alert.accept();
	}

	@Then("Click on cart")
	public void click_on_cart() throws InterruptedException {
	  driver.findElement(By.id("cartur")) .click();
	  Thread.sleep(3000);
	}


	@Then("Verify that product added")
	public void verify_that_product_added() {
	  
	boolean ss=driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/tr/td[2]")).isDisplayed();
	
	System.out.println("this is "+ss);
	Assert.assertEquals(ss,true);
	
	}

}
