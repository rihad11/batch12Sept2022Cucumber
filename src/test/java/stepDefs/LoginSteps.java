package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {

	public static WebDriver driver;
	@Given("user is on login page")
	public void user_is_on_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
	    driver.findElement(By.id("email")).sendKeys("rhasan");
	    
	    driver.findElement(By.id("pass")).sendKeys("34985398");
	    		
		
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
	   //click
	}

	@Then("user successfully logged in")
	public void user_successfully_logged_in() {
	    
		Assert.assertEquals(driver.getTitle(), "Facebook - log in or sign up");
		driver.quit();
	}
	
	
}
