package PageTest;

import Pages.HomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
import java.util.concurrent.TimeUnit;


public class HomePageTest {
    private static WebDriver driver = null;
    //static ExtentHtmlReporter htmlReporter;
    //static ExtentReports extent;
    //static ExtentTest test;
    static HomePage Hpages = new HomePage(driver);

    @BeforeTest
    public void setup(){

        System.setProperty("webdriver.chrome.driver", "C:/Users/manu_s4/Downloads/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://familiar.lsac.org/");
        driver.manage().window().maximize();
    }

    @Test //Scenario 1 answering all the questions in section 1 and clicking on Complete section
    public static void SelectTest(){
        Hpages.SelectTest();
        Hpages.SelectSection();
        driver.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);
        Hpages.Questions();
        for (int i = 0; i<= 22; i++){
            Hpages.OptionA();
            Hpages.NextPage();
        }
        Hpages.CompleteSection();
    }

    @Test(priority = 1)//For selecting Tutorial and playing the suggestion video and clicking on Home Button available
    //in suggestion video
    public static void Tutorial()
    {
        Hpages.SelectTutorial();
        Hpages.AnsweringQuestions();
        Hpages.PlayVideo();
        Hpages.PlayHomeButton();
    }

    @AfterTest
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}
