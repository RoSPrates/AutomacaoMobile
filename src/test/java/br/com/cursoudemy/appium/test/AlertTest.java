package br.com.cursoudemy.appium.test;

import br.com.cursoudemy.appium.core.DriverFactory;
import br.com.cursoudemy.appium.pages.AlertPage;
import br.com.cursoudemy.appium.pages.MenuPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AlertTest extends BaseTest {

    private MenuPage menuPage;
    private AlertPage alertPage;

    public AlertTest() {
        menuPage = new MenuPage(DriverFactory.getDriver());
        alertPage = new AlertPage(DriverFactory.getDriver());
    }

    @Before
    public void alertTest() {
        menuPage.escolheNoMenu("alertas");
    }


    @Test
    public void deveConfirmarAlertConfirm() {
        alertPage.clicarBtnAlertaPorTexto("alerta confirm");

        Assert.assertEquals("Info", alertPage.retornaTextoTitleAlert());
        Assert.assertEquals("Confirma a operação?", alertPage.retornaTextoMensagemAlert());
        alertPage.clicarBtnConfirmar();

        Assert.assertEquals("Info", alertPage.retornaTextoTitleAlert());
        Assert.assertEquals("Confirmado", alertPage.retornaTextoMensagemAlert());
        alertPage.clicarBtnSair();

        Assert.assertTrue(alertPage.verificaTextoNaTela("ALERTA CONFIRM"));
    }

    @Test
    public void deveConfirmarAlertAlertaSimples(){
        alertPage.clicarBtnAlertaPorTexto("alerta simples");
        Assert.assertEquals("Info", alertPage.retornaTextoTitleAlert());
        Assert.assertEquals("Pode clicar no OK ou fora da caixa para sair", alertPage.retornaTextoMensagemAlert());
        alertPage.tap(257,257);

        Assert.assertFalse(alertPage.textoDoElementoEVisivel("Pode clicar no OK ou fora da caixa para sair"));
    }
}
