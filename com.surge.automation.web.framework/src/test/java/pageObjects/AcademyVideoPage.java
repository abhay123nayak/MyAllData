package pageObjects;


import logger.LogReporter;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.naming.directory.SearchResult;

public class AcademyVideoPage extends BasePage {


    @FindBy(xpath = "//*[@role='presentation']/span[text()='videos']")
    public WebElement videos;

    @FindBy(id = "search")
    public WebElement searchBar;

    @FindBy(xpath = "//*[contains(text(),'Bali in 8k')]")
    public WebElement searchResult;
    public AcademyVideoPage(WebDriver driver){
        super(driver);
    }


    public void searchContent(String content){
        searchBar.clear();
        searchBar.sendKeys(content);
    }

    public void selectVideoTab(){
        Assert.assertTrue(actions.iselementVisible(videos));
        videos.click();
    }

    public void validateSearchResult(String expectedResult){
        Assert.assertTrue(actions.iselementVisible(searchResult,10));
       Assert.assertEquals(expectedResult,searchResult.getText());
    }

}
