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
        String primeiraOpcaoNaTela = recuperaTexto(this.menu.get(0));
        boolean chegouAoFim = false;
        while(!verificaTextoNaTela(option) && !chegouAoFim){
            scrollMenu();
            chegouAoFim = primeiraOpcaoNaTela.equalsIgnoreCase(recuperaTexto(this.menu.get(0)));
            primeiraOpcaoNaTela = recuperaTexto(this.menu.get(0));
        }
        clicar(this.menu, option);
    }

    public boolean verificaTextoNaTela(String text) {
        try {
            return verificaTextoPesente(this.menu, text);
        } catch (IllegalArgumentException ex) {
            return false;
        }
    }

    public void scrollMenu() {
        scrollInScreem(50, 90,50,10);
    }
}
