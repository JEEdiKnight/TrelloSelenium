package pe.com.test.seleniumwd.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TrelloHeaderPage {
    private By homeButton = By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/a/span");
    private By tablerosButton = By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/a/span");

    private WebDriver webDriver = null;

    public TrelloHeaderPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

}
