package br.com.cursoudemy.appium.test;

import br.com.cursoudemy.appium.pages.MenuPage;
import br.com.cursoudemy.appium.pages.SplashPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SplashTest extends BaseTest {


    MenuPage menuPage;
    SplashPage splashPage;


    public SplashTest() {
        menuPage = new MenuPage();
        splashPage = new SplashPage();
    }

    @Before
    public void splashTest() {
        menuPage.escolheNoMenu("Splash");
    }


    @Test
    public void aguardarSplashSumir() {
        splashPage.verificaTextoNaTela("esta");
        splashPage.verificaTextoNaTela("é");
        splashPage.verificaTextoNaTela("uma");
        splashPage.verificaTextoNaTela("tela");
        splashPage.verificaTextoNaTela("splash!");

        splashPage.aguardaSairDaTela("é");
        Assert.assertTrue(menuPage.verificaTextoNaTela("about..."));

    }
}
