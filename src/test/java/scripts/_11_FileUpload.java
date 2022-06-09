package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Waiter;

public class _11_FileUpload extends Base{

    /*

     */

    @Test(priority = 1, description = "File Upload")
    public void testFileUpload1(){
        driver.get("http://the-internet.herokuapp.com/");
        heroAppPage.clickOnLink("File Upload");
        Waiter.pause(2);
        heroAppPage.chooseFileInputBox.sendKeys("/Users/reemalsheikh/IdeaProjects/testng_framework/myFileReem2.xls");
        Waiter.pause(2);
        heroAppPage.uploadFileButton.click();

        Assert.assertEquals(heroAppPage.fileUploadedH3.getText(), "File Uploaded!");
        Assert.assertEquals(heroAppPage.uploadedFileText.getText(), "myFileReem2.xls");

    }

    @Test(priority = 2, description = "File Download")
    public void testFileDownload(){
        driver.get("http://the-internet.herokuapp.com/");
        heroAppPage.clickOnLink("File Download");
        heroAppPage.downloadFileLink.click();

    }
}
