package br.com.cursoudemy.appium.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.List;

public class SplashPage extends BasePage {

    public SplashPage(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView")
    List<MobileElement> textSplashPage;

    public boolean verificaTextoNaTela(String option) {
        return verificaTextoPesente(this.textSplashPage, option);
    }

    public void aguardaSairDaTela(String text){
        aguardaSairDaTela(this.textSplashPage,text);
    }
}
