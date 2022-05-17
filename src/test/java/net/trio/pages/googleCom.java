package net.trio.pages;

import net.trio.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class googleCom {

    public googleCom() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "q")
    public WebElement searchInput;


    @FindBy(name = "btnK")
    public WebElement searchBtn;

}
