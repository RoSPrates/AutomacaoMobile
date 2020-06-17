package br.com.cursoudemy.appium.test;

import br.com.cursoudemy.appium.pages.MenuPage;
import br.com.cursoudemy.appium.pages.OpcaoBemEscondidaPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OpcaoBemEscondidaTest extends BaseTest {

    MenuPage menu;
    OpcaoBemEscondidaPage opcao;

    public OpcaoBemEscondidaTest() {
        menu = new MenuPage();
        opcao = new OpcaoBemEscondidaPage();
    }

    @Before
    public void ultimaopcao() {
        this.menu.escolheNoMenu("Opção bem escondida");
    }


    @Test
    public void Test() {
        Assert.assertEquals(this.opcao.getTituloAlert(), this.opcao.retornaTextoTitleAlert());
        Assert.assertEquals(this.opcao.getMensagemAlert(), this.opcao.retornaTextoMensagemAlert());
        this.opcao.clicarBtnOk();
        Assert.assertTrue(this.menu.verificaTextoNaTela("Opção bem escondida"));
    }

}
