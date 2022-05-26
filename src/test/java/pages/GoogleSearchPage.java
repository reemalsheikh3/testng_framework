package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {

    public GoogleSearchPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "input[class='gLFyf gsfi']")
    public WebElement searchInputBox;

    @FindBy(css = "input[value='Google Search']")
    public WebElement searchButton;
}
