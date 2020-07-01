package br.com.cursoudemy.appium.steps;

import br.com.cursoudemy.appium.pages.CliquePage;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

public class CliquesSteps {

    CliquePage cliquePage;
    public CliquesSteps(){
        cliquePage = new CliquePage();
    }
    @Quando("quando clicar e segurar em clique longo")
    public void quandoClicarESegurarEmCliqueLongo() {
        this.cliquePage.clicarCliqueLongo();
    }

    @Entao("validar na tela {string}")
    public void validarNaTela(String text) {
        Assert.assertEquals(text, this.cliquePage.recuperaTextoDoCliqueSelecionado());
    }

    @Quando("clicar duas vezes rapidas em clique duplo")
    public void clicarDuasVezesRapidasEmCliqueDuplo() {
        this.cliquePage.clicarCliqueDuplo();
    }

    @Quando("clicar duas vezes em clique dublo lento")
    public void clicarDuasVezesEmCliqueDubloLento() {
        this.cliquePage.clicarCliqueDuploLento();
    }
}
