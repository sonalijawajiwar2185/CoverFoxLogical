
public class StaleElementExceptionUseClass 

{
	//how to handle StaleElementReferencedException
	import org.openqa.selenium.StaleElementReferenceException;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class StaleElementExceptionUse {

	    // WebElement annotated with @FindBy
	    @FindBy(id = "elementId")
	    private WebElement myElement;

	    // Constructor to initialize elements using Page Factory
	    public StaleElementExceptionUse(WebDriver driver) {
	        PageFactory.initElements(driver, this);
	    }

	    // Method to interact with the WebElement with StaleElementReferenceException handling
	    public void clickMyElement() {
	        int attempts = 0;
	        while (attempts < 2) {
	            try {
	                // Perform the action on the element
	                myElement.click();
	                break;
	            } catch (StaleElementReferenceException e) {
	                // Re-locate the element and retry
	                myElement = driver.findElement(By.id("elementId"));
	            }
	            attempts++;
	        }
	    }
	}

}
