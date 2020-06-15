package br.com.cursoudemy.appium.test;

import br.com.cursoudemy.appium.core.DriverFactory;
import br.com.cursoudemy.appium.pages.CliquePage;
import br.com.cursoudemy.appium.pages.MenuPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CliquesTest extends BaseTest {

    MenuPage menuPage;
    CliquePage cliquePage;

    public CliquesTest(){
        menuPage = new MenuPage(DriverFactory.getDriver());
        cliquePage = new CliquePage(DriverFactory.getDriver());

    }

    @Before
    public void alertTest() {
        menuPage.escolheNoMenu("Cliques");
    }

    @Test
    public void testCliqueLongo(){
        this.cliquePage.clicarCliqueLongo();

        Assert.assertEquals("Clique Longo",this.cliquePage.recuperaTextoDoCliqueSelecionado());
    }

    @Test
    public void testCliqueDuplo(){
        this.cliquePage.clicarCliqueDuplo();

        Assert.assertEquals("Duplo Clique",this.cliquePage.recuperaTextoDoCliqueSelecionado());
    }

    @Test
    public void testCliqueDuploLento(){
        this.cliquePage.clicarCliqueDuploLento();

        Assert.assertEquals("Duplo Clique lento",this.cliquePage.recuperaTextoDoCliqueSelecionado());
    }
}
