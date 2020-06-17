package br.com.cursoudemy.appium.steps;

import br.com.cursoudemy.appium.pages.MenuPage;
import br.com.cursoudemy.appium.pages.SplashPage;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

public class SplashSteps {

    SplashPage splashPage;
    MenuPage menuPage;

    public SplashSteps() {
        splashPage = new SplashPage();
        menuPage = new MenuPage();
    }

    @Quando("^Visualizar a tela de splash$")
    public void visualizarATelaDeSplash() {
        splashPage.verificaTextoNaTela("esta");
        splashPage.verificaTextoNaTela("é");
        splashPage.verificaTextoNaTela("uma");
        splashPage.verificaTextoNaTela("tela");
        splashPage.verificaTextoNaTela("splash!");
    }

    @Entao("volto para o menu")
    public void voltoParaOMenu() {
        splashPage.aguardaSairDaTela("é");
        Assert.assertTrue(menuPage.verificaTextoNaTela("about..."));
    }
}
