package br.com.cursoudemy.appium.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.List;

public class AbasPage extends BasePage {

    public AbasPage(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'ABA')]")
    private List<MobileElement> btnAbas;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'conteúdo')]")
    private MobileElement txtConteudo;

    public void clicarNaAba(String nomeDaAba) {
        clicar(btnAbas, nomeDaAba);
    }

    public String retornaTextConteudo() {
        return recuperaTexto(txtConteudo);
    }
}
