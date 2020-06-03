package br.com.cursoudemy.appium.test;

import br.com.cursoudemy.appium.core.DriverFactory;
import br.com.cursoudemy.appium.pages.AccordionPage;
import br.com.cursoudemy.appium.pages.MenuPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AccordionTest extends BaseTest {

    private MenuPage menuPage;
    private AccordionPage accordionPage;

    public AccordionTest() {
        menuPage = new MenuPage(DriverFactory.getDriver());
        accordionPage = new AccordionPage(DriverFactory.getDriver());
    }

    @Before
    public void accordionTest() {
        menuPage.escolheNoMenu("accordion");
    }

    @Test
    public void acessarOpcao1() {
        accordionPage.clicaNoAccordionPorNome("Opção 1");
        Assert.assertEquals("Esta é a descrição da opção 1", accordionPage.retornaTextoDaDescricao());
    }

    @Test
    public void acessarOpcao2() {
        accordionPage.clicaNoAccordionPorNome("Opção 2");
        Assert.assertEquals("Esta é a descrição da opção 2", accordionPage.retornaTextoDaDescricao());
    }

    @Test
    public void acessarOpcao3() {
        accordionPage.clicaNoAccordionPorNome("Opção 3");
        Assert.assertEquals("Esta é a descrição da opção 3. Que pode, inclusive ter mais que uma linha", accordionPage.retornaTextoDaDescricao());
    }

    @Test
    public void acessarOpcao4() {
        accordionPage.clicaNoAccordionPorNome("Opção 4");
        Assert.assertEquals("Esta é a descrição da opção 4", accordionPage.retornaTextoDaDescricao());
    }

    @Test
    public void acessarOpcao5() {
        accordionPage.clicaNoAccordionPorNome("Opção 5");
        Assert.assertEquals("Esta é a descrição da opção 5", accordionPage.retornaTextoDaDescricao());
    }

    @Test
    public void acessarOpcao6() {
        accordionPage.clicaNoAccordionPorNome("Opção 6");
        Assert.assertEquals("Esta é a descrição da opção 6", accordionPage.retornaTextoDaDescricao());
    }
}
