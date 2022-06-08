package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _09_IFrames extends Base{

    @Test(priority = 1)
    public void testIFrame1(){
        driver.get("http://the-internet.herokuapp.com/");

        heroAppPage.clickOnLink("Frames");
        heroAppPage.iFrameLink.click();

        //switch to inner html - iframe
        driver.switchTo().frame(0);
        heroAppPage.contentBox.clear();
        heroAppPage.contentBox.sendKeys("Hello World");
        Assert.assertEquals(heroAppPage.contentBox.getText(), "Hello World");

        //switch back to parent html - outer
       // driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();
        Assert.assertEquals(heroAppPage.iFrameHeader3.getText(), "An iFrame containing the TinyMCE WYSIWYG Editor");

    }

    @Test(priority = 2)
    public void testIFrame2(){
        driver.get("https://www.rediff.com/");

        driver.switchTo().frame(0);
        Assert.assertTrue(rediffHomePage.cellOneIFrame.isDisplayed());
        Assert.assertTrue(rediffHomePage.cellTwoIFrame.isDisplayed());
        driver.switchTo().parentFrame();

    }
}
