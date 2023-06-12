package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class HomePage extends BasePage{

    @FindBy(xpath = "//a[normalize-space()='Austin']")
    protected WebElement austinPageButton;

    @FindBy(xpath = "//ul[@id='menu-header-main-menu']")
    protected WebElement mainMenu;

    @FindBy(xpath = "//img[@alt='DL Logo']")
    protected WebElement loadedElement;


    public HomePage(WebDriver driver) {
        super(driver);
        if(!isLoaded()){
            getLogger().error("This is not Home Page");
        }
    }

    public boolean isLoaded(){
        return loadedElement.isDisplayed();
    }

    public boolean mainMenuIsPresent() {
        return mainMenu.isDisplayed();
    }

    public AustinPage austinPageClickLink() {
        austinPageButton.click();
        return new AustinPage(driver);
    }
}
