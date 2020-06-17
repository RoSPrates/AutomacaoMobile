package br.com.cursoudemy.appium.steps;

import br.com.cursoudemy.appium.pages.AccordionPage;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

public class AccordionSteps {

    AccordionPage accordionPage;

    public AccordionSteps() {
        accordionPage = new AccordionPage();
    }


    @Quando("clicar no accordion com o nome {string}")
    public void clicarNoAccordionComNome(String option) {
        accordionPage.clicaNoAccordionPorNome(option);
    }

    @Entao("visualizar as informações do accordion {string}")
    public void visualizarAsInformaçõesDoAccordion(String option) {
        if (option.contains("3"))
            Assert.assertEquals("Esta é a descrição da " + option.toLowerCase() + ". Que pode, inclusive ter mais que uma linha", accordionPage.retornaTextoDaDescricao());
        else
            Assert.assertEquals("Esta é a descrição da " + option.toLowerCase(), accordionPage.retornaTextoDaDescricao());
    }
}
