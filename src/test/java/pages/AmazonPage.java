package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {

    public AmazonPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "")
    public WebElement cookies ;

    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    public WebElement searchbox ;

    @FindBy(xpath = "//span[@class='a-color-state a-text-bold']")
    public WebElement result;









}
