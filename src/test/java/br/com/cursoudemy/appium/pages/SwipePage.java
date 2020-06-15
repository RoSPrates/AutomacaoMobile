package br.com.cursoudemy.appium.pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class SwipePage extends BasePage {

    public SwipePage(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView")
    private List<MobileElement> lblTela;

    public void swipeDireita() {
        scrollInScreem(90,50,10,50);
    }

    public void swipeEsquerda() {
        scrollInScreem(10,50,90,50);
    }

    public void clicarDiretita() {
        clicar(this.lblTela, "›");
    }

    public void clicarEsquerda() {
        clicar(this.lblTela, "‹");
    }
}
