package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _02_TechGlobalTest extends Base {

    /*
1. Go to "https://www.techglobalschool.com/apply-now"
2. Validate the heading1 is displayed and the text for it is ="Application Form"
 */


    //2. Validate test
    @Test(description = "TC123: Validate Application form heading")
    public void testApplicationFormHeading() {
        driver.get("https://www.techglobalschool.com/apply-now");

        WebElement heading1 = driver.findElement(By.xpath("//span[text()='Application Form']"));

        Assert.assertTrue(heading1.isDisplayed());
        Assert.assertEquals(heading1.getText(), "Application Form");
    }


}