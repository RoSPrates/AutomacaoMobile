package br.com.cursoudemy.appium.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.List;

public class AlertPage extends BasePage {

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'ALERTA')]")
    private List<MobileElement> btnAlert;


    public void clicarBtnAlertaPorTexto(String text) {
        clicar(this.btnAlert, text);
    }

    public boolean verificaTextoNaTela(String text) {
        return verificaTextoPesente(this.btnAlert, text);
    }

}
