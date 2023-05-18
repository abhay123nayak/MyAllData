package hooks;

import ConfigurationFactory.ProjectConfigurations;
import browserFactory.DriverInit;
import io.cucumber.java.*;
import logger.LogReporter;
import utils.DriverUtils;


public class GeneralHooks extends GetPages {

    @Before(order = 1)
    public void suitSetup(){
       driver= DriverInit.getDriver(ProjectConfigurations.browser());
       driver.navigate().to(ProjectConfigurations.URL());
    }

    @Before(value = "not @Login", order = 2)
    public  void login(){
        LogReporter.INFO("Performing Login As prerequisite");
        getLoginPage().isLoginScreenAppear().authenticateByLinkedin();
    }


    @After(order=1)
    public  void stopDriver(){
        LogReporter.INFO("Going for TearDown");
        DriverInit.tearDown();
    }

    @After(order=2)
    public void captureFailureScreenshot(Scenario scenario){
        LogReporter.INFO("Finalizing Result");
        if(scenario.isFailed()){
            LogReporter.INFO("Screenshot for failure scenario: "+scenario.getName());
            LogReporter.captureScreenShot();
            DriverUtils.sleep(1);
        }


    }

}
