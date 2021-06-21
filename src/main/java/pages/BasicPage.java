package pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class BasicPage {
    @FindBy(xpath = "//input[@type='search']")
    WebElement searchBar;

    @FindBy(xpath = "//div[@id='myAccountDropdown']/button")
    WebElement accountItem;

    @FindBy(xpath = "//a[@data-testid='myaccount-link']")
    WebElement myAccountLink;

    @FindBy(xpath = "//button[@data-testid='myAccountIcon']/span[@type='accountFilled']")
    WebElement myAccountIconFilled;

    @FindBy(xpath = "//a[@data-testid='signin-link']")
    WebElement signInLink;


}
