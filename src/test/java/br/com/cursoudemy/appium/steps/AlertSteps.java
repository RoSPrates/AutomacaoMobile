package br.com.cursoudemy.appium.steps;

import br.com.cursoudemy.appium.pages.AlertPage;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

public class AlertSteps {
    AlertPage alertPage;
    public AlertSteps(){
        alertPage = new AlertPage();
    }

    @E("clicar no alerta {string}")
    public void clicarNoAlerta(String alert) {
        alertPage.clicarBtnAlertaPorTexto(alert);
    }

    @Quando("Confirmar o alerta")
    public void confirmarOAlerta() {
        Assert.assertEquals("Info", alertPage.retornaTextoTitleAlert());
        Assert.assertEquals("Confirma a operação?", alertPage.retornaTextoMensagemAlert());
        alertPage.clicarBtnConfirmar();
    }

    @E("clicar no botão sair do alerta")
    public void clicarNoBotaoSairDoAlerta() {
        Assert.assertEquals("Info", alertPage.retornaTextoTitleAlert());
        Assert.assertEquals("Confirmado", alertPage.retornaTextoMensagemAlert());
        alertPage.clicarBtnSair();
    }

    @Entao("confirmar que saiu do alerta")
    public void confirmarQueSaiuDoAlerta() {
        Assert.assertTrue(alertPage.verificaTextoNaTela("ALERTA CONFIRM"));
    }

    @Quando("Confirmar o alerta simples")
    public void confirmarOAlertaSimples() {
        Assert.assertEquals("Info", alertPage.retornaTextoTitleAlert());
        Assert.assertEquals("Pode clicar no OK ou fora da caixa para sair", alertPage.retornaTextoMensagemAlert());
        alertPage.tapOutTheBox(257, 257);
    }

    @Entao("confirmar que saiu do alerta simples")
    public void confirmarQueSaiuDoAlertaSimples() {
        Assert.assertFalse(alertPage.textoDoElementoEVisivel("Pode clicar no OK ou fora da caixa para sair"));
    }
}
