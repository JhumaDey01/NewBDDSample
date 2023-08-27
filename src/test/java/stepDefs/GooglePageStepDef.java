package stepDefs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GooglePageStepDef {
	WebDriver driver;
	@Given("User is on Google Page")
	public void user_is_on_google_page() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.google.com");



	}
	@When("I search Java Tutorial")
	public void i_search_java_tutorial() {
		WebElement srcBox =driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		srcBox.sendKeys("Java Tutorials");
		srcBox.sendKeys(Keys.ENTER);

	}
	@Then("Java Tutorial page displayed")
	public void java_tutorial_page_displayed() {
		Assert.assertEquals(driver.getTitle(),"Java Tutorials - Google Search");
	}
}
