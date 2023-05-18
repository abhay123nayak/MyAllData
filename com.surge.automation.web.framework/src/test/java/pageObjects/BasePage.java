package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.DriverUtils;

import java.time.Duration;

public class BasePage {
    protected WebDriver driver;
    public DriverUtils actions;
    public BasePage(WebDriver driver){
    this.driver=driver;
    actions=new DriverUtils(driver);
    init_factory();
    }
    public void init_factory(){
        PageFactory.initElements(driver,this);
    }

}
