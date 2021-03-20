package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWebOrderSteps {

	WebDriver driver = null;
	String proj_Path = System.getProperty("user.dir");
	String url = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";


	@Given("user is on web order login page") public void
	user_is_on_web_order_login_page() { System.out.println(proj_Path);
	System.setProperty("webdriver.chrome.driver", proj_Path +
			"/src/test/resources/drivers/chromedriver");

	driver = new ChromeDriver(); driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); 
	driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS); driver.get(url); driver.manage().window().maximize();

	}


	@When("user enter username and password")
	public void user_enter_username_and_password() {
		driver.findElement(By.xpath(".//input[@id='ctl00_MainContent_username']")).sendKeys("Tester");
		driver.findElement(By.xpath(".//input[@id='ctl00_MainContent_password']")).sendKeys("test");
	}

	@And("user clicks on login button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.xpath(".//input[@id='ctl00_MainContent_login_button']")).click();
	}

	@Then("welcome text is displayed on user account")
	public void welcome_text_is_displayed_on_user_account() {
		String txt_Login = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]")).getText();
		System.out.println(txt_Login);

	}

	@And("web orders home page is displayed.")
	public void web_orders_home_page_is_displayed() {
		System.out.println(driver.getTitle());

		driver.close();
		driver.quit();
	}

}
