package org.project.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VerifPage extends BasePage {

    @FindBy(xpath = "//div[contains(text(), 'Verify')]")
    private WebElement verifText;

    @FindBy(xpath = "//h2[contains(text(),'Protecting')]")
    private WebElement protectText;

    @FindBy(xpath = "//p[contains(text(),'puzzle')]")
    private WebElement puzzleText;

    @FindBy(xpath = "//button[contains(text(),'Verify')]")
    private WebElement verifyButton;

    @FindBy(xpath = "//p[contains(text(),'Audio')]")
    private WebElement audioButton;

    @Step("Show element from 'Sign Up' page")
    public Boolean verifyPageElementDisplayed() throws InterruptedException {
        Thread.sleep(5000);
        try {
            return verifText.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

}
