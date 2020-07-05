package br.com.cursoudemy.appium.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.List;

public class SwipeListPage extends BasePage {

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Opção')]")
    private List<MobileElement> option;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='(-)']")
    private List<MobileElement> btnMinus;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='(+)']")
    private List<MobileElement> btnPlus;

    public void leftElementSwipe(String option) {
        sleep(500);
        horizontalSwipeInElementContainsText(this.option, option, 90, 10);
    }

    public void rightElementSwipe(String option) {
        sleep(500);
        horizontalSwipeInElementContainsText(this.option, option, 10, 90);
    }

    public void clicarMais() {
        tap(this.btnPlus.get(0));
    }

    public void clicarMenos() {
        tap(this.btnMinus.get(0));
    }

    public List<String> recuperarOpcoesNaTela() {
        return recuperaTexto(option);
    }

    public boolean verificaTextoNaTela(String text) {
        return verificaTextoPesente(option, text);
    }
}