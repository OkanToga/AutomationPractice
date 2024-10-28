package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverManager;

public class ContactUsPage {

    public ContactUsPage() {
        PageFactory.initElements(DriverManager.getDriver(),this);
    }

    @FindBy(xpath = "(//h2[normalize-space()='Get In Touch'])[1]")
    public WebElement contactPageGetInTouchText;

    @FindBy(xpath = "(//input[@placeholder='Name'])[1]")
    public WebElement contactPageName;

    @FindBy(xpath = "(//input[@placeholder='Email'])[1]")
    public WebElement contactPageEmail;

    @FindBy(xpath = "(//input[@placeholder='Subject'])[1]")
    public WebElement contactPageSubject;

    @FindBy(xpath = "(//textarea[@id='message'])[1]")
    public WebElement contactPageMessage;

    @FindBy(xpath = "(//input[@name='upload_file'])[1]")
    public WebElement contactPageUploadFile;

    @FindBy(xpath = "(//input[@name='submit'])[1]")
    public WebElement contactPageSubmit;
}
