package br.com.cursoudemy.appium.steps;

import br.com.cursoudemy.appium.pages.SwipePage;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

public class SwipeSteps {

    SwipePage swipePage;

    public SwipeSteps() {
        swipePage = new SwipePage();
    }

    @E("ir para proxima tela do swipe deslizando para direita")
    public void irParaProximaTelaDoSwipeDeslizandoParaDireita() {
        this.swipePage.swipeDireita();
        Assert.assertTrue(this.swipePage.isPresent("você"));
    }

    @E("ir para proxima tela do swipe clicando no botão da direita")
    public void irParaProximaTelaDoSwipeClicandoNoBotaoDaDireita() {
        this.swipePage.clicarDiretita();
        Assert.assertTrue(this.swipePage.isPresent("fim"));
    }

    @Quando("voltar da ultima para primeira tela do swipe")
    public void voltarDaUltimaParaPrimeiraTelaDoSwipe() {
        this.swipePage.swipeEsquerda();
        this.swipePage.clicarEsquerda();
    }

    @Entao("validar se estou na primeira tela do swipe")
    public void validarSeEstouNaPrimeiraTelaDoSwipe() {
        Assert.assertTrue(this.swipePage.isPresent("mova"));
    }
}
