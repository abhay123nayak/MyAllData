package logger;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utils.DriverUtils;


public class LogReporter {

    private final static Logger logger = LoggerFactory.getLogger(LogReporter.class);

    public static void INFO(String message){
        logger.info(message);
    }

    public static void captureScreenShot(){
        ExtentCucumberAdapter.getCurrentStep().log(Status.INFO, MediaEntityBuilder.createScreenCaptureFromBase64String(DriverUtils.getBase64SnapShot()).build());

    }


}
