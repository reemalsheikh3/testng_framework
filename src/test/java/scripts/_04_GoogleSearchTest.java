package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _04_GoogleSearchTest extends Base {

    @Test (priority = 1, description = "TC765: Validate Google search")
    public void testGoogleSearch(){
    driver.get("https://www.google.com/");
    googleSearchPage.searchInputBox.sendKeys("Selenium");
    googleSearchPage.searchButton.click();

        Assert.assertTrue(Long.parseLong(googleSearchResultPage.resultsTag.getText().replaceAll("[^0-9]", "")) > 0);

        /*
        Assert.assertTrue(Long.parseLong(results.substring(results.indexOf(" ")+1, results.indexOf("results")-1).replace(",", "")) > 0);
         */
    }
}
