package scripts;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class _13_Tables extends Base{

    /*
    Go to http://the-internet.herokuapp.com/
    Click on "Sortable Data Tables" link
    Validate the table 1 headers to be displayed as below
    Last Name
    First Name
    Email
    Due
    Web Site
    Action
     */

    @Test(priority = 1, description = "Tables | headers")
    public void testTableHeaders(){
        driver.get("http://the-internet.herokuapp.com/");

        heroAppPage.clickOnLink("Sortable Data Tables");

        String[] expectedTextTableHeaders = {"Last Name",
                "First Name",
                "Email",
                "Due",
                "Web Site",
                "Action"};

        for (int i = 0; i < 6; i++) {
            Assert.assertEquals(heroAppPage.tableHeaderText.get(i).getText(), expectedTextTableHeaders[i]);
        }
    }

    /*
    Go to http://the-internet.herokuapp.com/
    Click on "Sortable Data Tables" link
    Validate the table 1 row 1 to be displayed as below
    Smith
    John
    jsmith@gmail.com
    $50.00
    http://www.jsmith.com
    edit delete
     */
    @Test(priority = 2, description = "Tables | first row")
    public void testFirstRow(){
        driver.get("http://the-internet.herokuapp.com/");
        heroAppPage.clickOnLink("Sortable Data Tables");
        String[] firstRowFirstTableText = {"Smith", "John", "jsmith@gmail.com", "$50.00", "http://www.jsmith.com", "edit delete"};

        for (int i = 0; i < 6; i++) {
            Assert.assertEquals(heroAppPage.firstRowFirstTable.get(i).getText(), firstRowFirstTableText[i]);
        }
    }

      /*
    Go to http://the-internet.herokuapp.com/
    Click on "Sortable Data Tables" link
    Validate the table 1 column 2 (First Name) to be displayed as below
    John
    Frank
    Jason
    Tim
     */

    @Test(priority = 3, description = "Tables | 2nd Column")
    public void testSecondColumn(){
        driver.get("http://the-internet.herokuapp.com/");
        heroAppPage.clickOnLink("Sortable Data Tables");
        String[] secondColumnFirstTableText = {"John", "Frank", "Jason", "Tim"};

        for (int i = 0; i < 4; i++) {
            Assert.assertEquals(heroAppPage.tableOneSecondColumn.get(i).getText(), secondColumnFirstTableText[i]);
        }
    }


    @Test(priority = 4, description = "Tables | All Cells")
    public void testAllCells() {
        driver.get("http://the-internet.herokuapp.com/");
        heroAppPage.clickOnLink("Sortable Data Tables");

        for (WebElement element : heroAppPage.allCellsOfTableOne) {
            Assert.assertNotEquals(element.getText(), "");
        }
    }
}
