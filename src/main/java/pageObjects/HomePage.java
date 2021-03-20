package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Then;

public class HomePage {
	
	protected WebDriver driver;
	
	private By lnk_Dresss = By.xpath("//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]");	
	private By lnk_more = By.xpath("//span[text()='More']");
	private By txt_Quantity = By.xpath("//input[@name='qty']");
	private By dlst_size = By.xpath("//select[@id='group_1']");
	private By btn_AddToCart = By.xpath("//span[text()='Add to cart']");
	private By btn_ProceedToCheckout = By.xpath("//span[contains(text(),'Proceed to checkout')]");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void selectDressesMenu() {
		driver.findElement(lnk_Dresss).click();
	}
	
	public void selectDressType(String dressType) {
		driver.findElement(By.xpath("//div[@id='subcategories']//a[contains(@title,'"+dressType+"')]")).click();		
	}
	
	public void moveCursor(String dressName) {
		try {
		Actions builder = new Actions(driver);
		Action moveMouse = builder
							.moveToElement(driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div//img[@title='"+dressName+"']")))
							.build();

			Thread.sleep(2000);
			moveMouse.perform();
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
;		
	}
	
	public void clickMoreDetails() {
		 driver.findElement(lnk_more).click();;
		
	}
	
	public void enterQuantity(String quantity) {
		WebElement webElement_txt_Quantity = driver.findElement(txt_Quantity);
		webElement_txt_Quantity.clear();
		webElement_txt_Quantity.sendKeys(quantity);
		
	}

	public void selectSize(String size) {
	
		WebElement item_size = driver.findElement(dlst_size);
		Select se = new Select(item_size);
		se.selectByVisibleText(size);
	}

	public void selectColor(String color) {
		driver.findElement(By.xpath("//a[@name='"+color+"']")).click();
	}

	
	
	public void clickAddToCart() {
		driver.findElement(btn_AddToCart).click();
	}
	
	
	public String getMessageAfterAddingItemToCart() {
			String actual_msg = driver.findElement(By.xpath("//div[@class='clearfix']//div[1]/h2[1]")).getText();
			System.out.println(actual_msg);
			actual_msg = actual_msg.replace("/n","");
			System.out.println(actual_msg);
			return actual_msg;
	}		
	
	public void clickOnProceedToCheckout() {
		driver.findElement(btn_ProceedToCheckout).click();		
	}
}
