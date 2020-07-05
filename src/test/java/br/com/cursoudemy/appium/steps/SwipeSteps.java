package br.com.cursoudemy.appium.steps;

import br.com.cursoudemy.appium.pages.SwipeListPage;
import br.com.cursoudemy.appium.pages.SwipePage;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

public class SwipeSteps {

    SwipePage swipePage;
    SwipeListPage swipeListPage;

    public SwipeSteps() {
        swipePage = new SwipePage();
        swipeListPage = new SwipeListPage();
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

    @E("fazer swipe para {string} na opção {string}")
    public void fazerSwipeParaNaOpcao(String lado, String option) {
        if (lado.equalsIgnoreCase("esquerda")) swipeListPage.leftElementSwipe(option);
        else if (lado.equalsIgnoreCase("direita")) swipeListPage.rightElementSwipe(option);
        else throw new IllegalArgumentException();
    }

    @Quando("clicar no {string} do + ou -")
    public void clicarNoDo(String plusOrminus) {
        if (plusOrminus.equals("+")) swipeListPage.clicarMais();
        else if (plusOrminus.equals("-")) swipeListPage.clicarMenos();
        else throw new IllegalArgumentException();
    }

    @Entao("visualizar {string} na tela")
    public void visualizarNaTela(String resultado) {
        Assert.assertTrue(swipeListPage.verificaTextoNaTela(resultado));
    }

    @Quando("resetar todos os swipes da swipe list")
    public void resetarTodosOsSwipesDaSwipeList() {
        swipeListPage.recuperarOpcoesNaTela().forEach(option -> fazerSwipeParaNaOpcao("direita",
                        option.replaceAll("\\D","")));
    }

    @Entao("visialisar que não tem mais nenhum marcado")
    public void visialisarQueNaoTemMaisNenhumMarcado() {
        swipeListPage.recuperarOpcoesNaTela().forEach(option ->
                Assert.assertFalse(option.contains("+") || option.contains("-")));
    }
}
