package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;

import org.junit.Assert;


/*
 * This class is for grey code for PlaceECommerce Order with Parameters and Data Driven
 */

public class PlaceECommerceOrderSteps_DDT_simplePOM {
	
	WebDriver driver = null;
	HomePage homePage = null;
	
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
		//driver.findElement(By.xpath("//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]")).click();
		
		homePage = new HomePage(driver);
		homePage.selectDressesMenu();
		
		
	}

	@When("^user selects the (.*)$")
	public void user_selects_the_dressType(String dressType) {
		/*
		System.out.println("Dress Type parameter:"+dressType);
		driver.findElement(By.xpath("//div[@id='subcategories']//a[contains(@title,'"+dressType+"')]")).click();
		*/
		
		homePage.selectDressType(dressType);
		
	}
	
	@When("^user moves the cursor on (.*)$")
	public void user_moves_the_cursor_on_dressName(String dressName) throws InterruptedException {
		/*
		//Mouse and Keyboard actions
		Actions builder = new Actions(driver);
		Action moveMouse = builder
							.moveToElement(driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div//img[@title='"+dressName+"']")))
							.build();
		Thread.sleep(2000);
		moveMouse.perform();
		Thread.sleep(2000);
		*/
		homePage.moveCursor(dressName);
		
	}	

	@When("user selects more details link")
	public void user_selects_more_details_link() {
		homePage.clickMoreDetails();
	}
	
	@When("^user selects (.*) and (.*) and (.*)$")
	public void user_selects_quantity_and_size_and_color(String quantity, String size, String color) {
		/*
		WebElement item_qty = 	driver.findElement(By.xpath("//input[@name='qty']"));
		item_qty.clear();
		item_qty.sendKeys(quantity);
		
		// drop-down box
		WebElement item_size = driver.findElement(By.xpath("//select[@id='group_1']"));
		Select se = new Select(item_size);
		se.selectByVisibleText(size);
		
		driver.findElement(By.xpath("//a[@name='"+color+"']")).click();
		*/
		homePage.enterQuantity(quantity);
		homePage.selectSize(size);
		homePage.selectColor(color);
		
		
	}

	@When("user clicks Add to cart button")
	public void user_clicks_Add_to_cart_button() {
		// driver.findElement(By.xpath("//span[text()='Add to cart']")).click();
		homePage.clickAddToCart();
	}

	
	@Then("verify message saying item added successfully to cart")
	public void verify_message_saying_item_added_successfully_to_cart() {
		String actual_msg = homePage.getMessageAfterAddingItemToCart();
		String expected_msg = "Product successfully added to your shopping cart";
	//	Assert.assertEquals(expected_msg, actual_msg.trim());
	}
	
	@Then("user clicks proceed to checkout button")
	public void user_clicks_proceed_to_checkout_button() {
		//driver.findElement(By.xpath("//span[contains(text(),'Proceed to checkout')]")).click();
		homePage.clickOnProceedToCheckout();
	}
	

}
