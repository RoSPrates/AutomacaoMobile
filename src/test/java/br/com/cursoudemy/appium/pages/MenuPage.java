package br.com.cursoudemy.appium.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.List;

public class MenuPage extends BasePage {


    public MenuPage(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    @AndroidFindBy(className = "android.widget.TextView")
    private List<MobileElement> menu;

    public void escolheNoMenu(String option) {
        clicar(this.menu, option);
    }

    public boolean verificaTextoNaTela(String text) {
        return verificaTextoPesente(this.menu, text);
    }
}
