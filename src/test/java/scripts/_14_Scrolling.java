package scripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import utilities.Waiter;

public class _14_Scrolling extends Base{
    @Test
    public void testScrolling(){
        driver.get("https://www.techglobalschool.com/");
        Waiter.pause(2);

        // actions.moveToElement(tgHomePage.registerForIntroLink).perform();
       // actions.sendKeys(Keys.PAGE_DOWN).perform();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView({block: 'center'})", tgHomePage.registerForIntroLink);

    }
}
