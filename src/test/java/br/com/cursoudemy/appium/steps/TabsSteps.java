package br.com.cursoudemy.appium.steps;

import br.com.cursoudemy.appium.pages.AbasPage;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

public class TabsSteps {

    AbasPage abasPage;

    public TabsSteps() {
        abasPage = new AbasPage();
    }

    @Quando("clicar na {string}")
    public void clicarNa(String aba) {
        abasPage.clicarNaAba(aba);
    }

    @Entao("confirmar estar na {string}")
    public void confirmarEstarNa(String aba) {
        Assert.assertEquals("Este é o conteúdo da " + aba, abasPage.retornaTextConteudo());
    }

    @E("estar na {string}")
    public void estarNa(String aba) {
        clicarNa(aba);
        confirmarEstarNa(aba);
    }
}
