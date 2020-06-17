package br.com.cursoudemy.appium.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.List;

public class SplashPage extends BasePage {

    @AndroidFindBy(xpath = "//android.widget.TextView")
    List<MobileElement> textSplashPage;

    public boolean verificaTextoNaTela(String option) {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return verificaTextoPesente(this.textSplashPage, option);
    }

    public void aguardaSairDaTela(String text) {
        aguardaSairDaTela(this.textSplashPage, text);
    }
}
