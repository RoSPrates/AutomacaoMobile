package br.com.cursoudemy.appium.test;

import br.com.cursoudemy.appium.pages.MenuPage;
import br.com.cursoudemy.appium.pages.SwipePage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SwipeTest extends BaseTest {

    MenuPage menuPage;
    SwipePage swipePage;

    public SwipeTest() {
        this.menuPage = new MenuPage();
        this.swipePage = new SwipePage();
    }

    @Before
    public void acessaSwipePage() {
        this.menuPage.escolheNoMenu("Swipe");
    }

    @Test
    public void chegaAoFimEVolta() {
        this.swipePage.swipeDireita();
        Assert.assertTrue(this.swipePage.isPresent("você"));
        this.swipePage.clicarDiretita();
        Assert.assertTrue(this.swipePage.isPresent("fim"));
        this.swipePage.swipeEsquerda();
        this.swipePage.clicarEsquerda();
        Assert.assertTrue(this.swipePage.isPresent("mova"));
    }
}
