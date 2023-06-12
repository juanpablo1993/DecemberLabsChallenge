package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AustinPage extends BasePage{

    WebDriverWait waits = new WebDriverWait(driver, 5);

    @FindBy(xpath = "//a[@class='button transparent-button schedule-consultation launch-modal-calendar']")
    protected WebElement scheduleButton;


    @FindBy(xpath = "//img[@alt='December Labs']")
    protected WebElement loadedElement;

    @FindBy(xpath = "//iframe[contains(@src, 'https://cal.mixmax.com/elisabethbohlmann/healthtech?sdkV=1.5.2')]")
    protected WebElement scheduleiFrame;

    @FindBy(xpath = "//div[@class='public-calendar__container  flex-fill  flex-no-shrink  pt+++-  pr++  pl++']")
    protected WebElement calendar;

    @FindBy(xpath = "//div[@class='dl-modal calendar-modal open']//div[@class='btn-close-modal']")
    protected WebElement closeModalButton;


    public AustinPage(WebDriver driver) {
        super(driver);
        if(!isLoaded()){
            getLogger().error("This is not Austin Page");
        }
    }

    public boolean isLoaded(){
        return loadedElement.isDisplayed();
    }

    public void scheduleButtonClick(){
        scheduleButton.click();
        swichtScheduleiFrame();
    }

    public void swichtScheduleiFrame(){
        wait.waitForElementToBeVisible(driver, closeModalButton, 5);
        driver.switchTo().frame(scheduleiFrame);
    }
    public boolean calendarIsDisplayed(){
        return elementIsDisplayed(calendar);
    }

    public boolean calendarIsNotDisplayed(){
        return  waits.until(ExpectedConditions.invisibilityOf(calendar));
    }

    public void closeModal(){
        driver.switchTo().defaultContent();
        closeModalButton.click();
    }

}
