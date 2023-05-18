package hooks;
import org.openqa.selenium.WebDriver;
import pageObjects.AcademyVideoPage;
import pageObjects.EventPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class GetPages   {
    public static WebDriver driver;
    LoginPage page;
    HomePage homePage;
    AcademyVideoPage videoPage;

    EventPage eventPage;

    public  LoginPage getLoginPage(){
        if(page==null) {
         page=   new LoginPage(driver);
        }
        return page;
    }

    public  HomePage getHomePage(){
        if(homePage==null) {
            homePage=   new HomePage(driver);
        }
        return homePage;
    }

    public  AcademyVideoPage getAcademyVideoPage(){
        if(videoPage==null) {
            videoPage=   new AcademyVideoPage(driver);
        }
        return videoPage;
    }

    public  EventPage getEventPage(){
        if(eventPage==null) {
            eventPage=   new EventPage(driver);
        }
        return eventPage;
    }
}
