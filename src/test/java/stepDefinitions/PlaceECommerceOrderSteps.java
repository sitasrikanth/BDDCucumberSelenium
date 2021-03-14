package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class PlaceECommerceOrderSteps {
	/*
	 * This class is for grey code for PlaceECommerce Order without Parameters and Data Driven
	
	WebDriver driver = null;
	String proj_Path = System.getProperty("user.dir");
	String url = "http://automationpractice.com/index.php";
	String username = "ss@ss.com";
	String password = "ssssss";
	
	@Given("user is logged into e_commerce app")
	public void user_is_logged_into_e_commerce_app() {
		System.out.println("Login yo e-Commerce WebApp");
		System.setProperty("webdriver.chrome.driver", proj_Path + "/src/test/resources/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.get(url);
		//driver.manage().window().maximize();
		
		
	}

	@When("user is on Dresses page")
	public void user_is_on_Dresses_page() {
		//System.out.println("user is on Dresses page");
		driver.findElement(By.xpath("//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]")).click();
	}

	@When("user selects the dressType")
	public void user_selects_the_dressType() {
		//System.out.println("user selects the dress");
		driver.findElement(By.xpath("//div[@id='subcategories']//a[contains(@title,'Casual')]")).click();
	}
	
	@When("user moves the cursor on dress")
	public void user_moves_the_cursor_on_dressName() throws InterruptedException {
		
		//Mouse and Keyboard actions
		Actions builder = new Actions(driver);
		Action moveMouse = builder
							.moveToElement(driver.findElement(By.xpath("//div[@class = 'product-container']/div/div//img[@title='Printed Dress']")))
							.build();
		Thread.sleep(2000);
		moveMouse.perform();
		Thread.sleep(2000);
	}	

	@When("user selects more details link")
	public void user_selects_more_details_link() {
		driver.findElement(By.xpath("//span[text()='More']")).click();
	}
	
	@When("user selects size and quantity and color")
	public void user_selects_size_and_quantity_and_color() {
		WebElement item_quantity = 	driver.findElement(By.xpath("//input[@name='qty']"));
		item_quantity.clear();
		item_quantity.sendKeys("2");
		
		// drop-down box
		WebElement size = driver.findElement(By.xpath("//select[@id='group_1']"));
		Select se = new Select(size);
		se.selectByVisibleText("M");
		
		driver.findElement(By.xpath("//a[@name='Orange']")).click();
		
	}

	@When("user clicks Add to cart button")
	public void user_clicks_Add_to_cart_button() {
		driver.findElement(By.xpath("//span[text()='Add to cart']")).click();
	}

	
	@Then("verify message saying item added successfully to cart")
	public void verify_message_saying_item_added_successfully_to_cart() {
		String actual_msg = driver.findElement(By.xpath("//div[@class='clearfix']//div[1]/h2[1]")).getText();
		System.out.println(actual_msg);
		actual_msg = actual_msg.replace("/n","");
		System.out.println(actual_msg);
		String expected_msg = "Product successfully added to your shopping cart";
//		Assert.assertEquals(expected_msg, actual_msg.trim());
	}
	
	@Then("user clicks proceed to checkout button")
	public void user_clicks_proceed_to_checkout_button() {
		driver.findElement(By.xpath("//span[contains(text(),'Proceed to checkout')]")).click();
	}
	
*/
}
