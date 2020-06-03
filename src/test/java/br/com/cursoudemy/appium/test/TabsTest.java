package br.com.cursoudemy.appium.test;

import br.com.cursoudemy.appium.core.DriverFactory;
import br.com.cursoudemy.appium.pages.AbasPage;
import br.com.cursoudemy.appium.pages.MenuPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TabsTest extends BaseTest {

    MenuPage menuPage;
    AbasPage abasPage;

    public TabsTest() {
        menuPage = new MenuPage(DriverFactory.getDriver());
        abasPage = new AbasPage(DriverFactory.getDriver());
    }

    @Before
    public void tabsTest() {
        menuPage.escolheNoMenu("abas");
    }

    @Test
    public void goToTab2() {
        Assert.assertEquals("Este é o conteúdo da Aba 1", abasPage.retornaTextConteudo());
        abasPage.clicarNaAba("ABA 2");
        Assert.assertEquals("Este é o conteúdo da Aba 2", abasPage.retornaTextConteudo());
    }

    @Test
    public void goToTab1() {
        abasPage.clicarNaAba("ABA 2");
        Assert.assertEquals("Este é o conteúdo da Aba 2", abasPage.retornaTextConteudo());
        abasPage.clicarNaAba("ABA 1");
        Assert.assertEquals("Este é o conteúdo da Aba 1", abasPage.retornaTextConteudo());
    }
}
