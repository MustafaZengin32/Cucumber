package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BrcPAge {

    public BrcPAge() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[normalize-space()='Login']//*[name()='svg']")
    public WebElement loginIlk;

    @FindBy(xpath = "//input[@id='formBasicEmail']")
    public WebElement userName;


    @FindBy(xpath = "//button[normalize-space()='Login']")
    public WebElement ikinciLogin;












}
