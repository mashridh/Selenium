package Pages;
import com.google.common.base.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.util.concurrent.TimeUnit;

public class HomePage {
    WebDriver driver = null;

    By first_set = By.id("practiceTestLink");
    By SelectFirstSession  = By.xpath("//*[@id=\"ApolloContainerInner\"]/div/div/div/div[2]/div[3]/div/button/div/span");
    By go_to_questions  = By.xpath("//*[@id=\"questionButton\"]/span");
    By select_option = By.xpath("//*[@id=\"stem\"]/div/div/div[2]/div[1]/div[1]/div[1]/button/div[1]/div");
    By NextPage = By.xpath("//*[@id=\"ApolloContainerInner\"]/div/div[3]/nav[2]/ul[2]/li[2]/img");
    By Complete_Section = By.xpath("//*[@id=\"masterTopBarButtonContainer\"]/button[2]");
    By Tutorials = By.xpath("//*[@id=\"tutorialsLink\"]");
    By AnsweringTestQuestions = By.xpath("//*[@id=\"videoLink\"]");
    By PlayButton = By.xpath("//*[@id=\"playButton\"]");
    By HomeButton = By.xpath("//*[@id=\"homeIcon\"]");





    public  HomePage(WebDriver driver){
        this.driver = driver;
    }
    public  void SelectTest(){

        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(30, TimeUnit.SECONDS)
                .pollingEvery(5, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class);

        wait.until(ExpectedConditions.visibilityOfElementLocated(first_set));
        driver.findElement(first_set).click();
    }

    public  void SelectSection(){
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(30, TimeUnit.SECONDS)
                .pollingEvery(5, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class);

        wait.until(ExpectedConditions.visibilityOfElementLocated(SelectFirstSession));
        driver.findElement(SelectFirstSession).click();
    }

    public  void Questions(){
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(30, TimeUnit.SECONDS)
                .pollingEvery(5, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class);

        wait.until(ExpectedConditions.visibilityOfElementLocated(go_to_questions));
        wait.until(ExpectedConditions.presenceOfElementLocated(go_to_questions));
        driver.findElement(go_to_questions).click();
    }

    public  void OptionA(){

        driver.findElement(select_option).click();
    }

    public  void NextPage(){
        driver.findElement(NextPage).click();
    }

    public  void CompleteSection(){
        driver.findElement(Complete_Section).click();
    }


    public  void SelectTutorial(){
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(30, TimeUnit.SECONDS)
                .pollingEvery(5, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class);

        wait.until(ExpectedConditions.visibilityOfElementLocated(Tutorials));
        driver.findElement(Tutorials).click();
    }

    public  void AnsweringQuestions(){
        driver.findElement(AnsweringTestQuestions).click();
    }

    public  void PlayVideo(){
        driver.findElement(PlayButton).click();
    }

    public  void PlayHomeButton(){
        driver.findElement(HomeButton).click();
    }


}
