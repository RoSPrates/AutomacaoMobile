package br.com.cursoudemy.appium.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.List;

public class SwipePage extends BasePage {

    public SwipePage(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView")
    private List<MobileElement> lblTela;

    public void swipeDireita() {
        espera("›");
        scrollInScreem(90, 50, 10, 50);
    }

    public void swipeEsquerda() {
        espera("‹");
        scrollInScreem(10, 50, 90, 50);
    }

    public void clicarDiretita() {
        espera("›");
        clicar(this.lblTela, "›");
    }

    public void clicarEsquerda() {
        espera("‹");
        clicar(this.lblTela, "‹");
    }

    public boolean isPresent(String text) {
      return recuperaTextoNaTela().stream().
              anyMatch(s -> s.toLowerCase().contains(text.toLowerCase()));
    }

    public List<String> recuperaTextoNaTela() {
        return recuperaTexto(this.lblTela);
    }

    private void espera(String text) {
        int cont = 0;
        boolean ver = !isPresent(text);
        while (ver && cont < 50) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(cont);
            cont++;
        }
    }


}
