package br.com.cursoudemy.appium.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.List;

public class MenuPage extends BasePage {


    @AndroidFindBy(className = "android.widget.TextView")
    private List<MobileElement> menu;

    public void escolheNoMenu(String option) {
        sleep(1750);
        String primeiraOpcaoNaTela = recuperaTexto(this.menu.get(0));
        boolean chegouAoFim = false;
        while (!verificaTextoNaTela(option) && !chegouAoFim) {
            scrollMenu();
            chegouAoFim = primeiraOpcaoNaTela.equalsIgnoreCase(recuperaTexto(this.menu.get(0)));
            primeiraOpcaoNaTela = recuperaTexto(this.menu.get(0));
        }
        clicar(this.menu, option);
    }

    public boolean verificaTextoNaTela(String text) {
        sleep(500);
        return verificaTextoPesente(this.menu, text);
    }

    public void scrollMenu() {
        scrollInScreem(50, 90, 50, 10);
    }

}
