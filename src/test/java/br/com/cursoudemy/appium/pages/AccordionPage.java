package br.com.cursoudemy.appium.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.List;

public class AccordionPage extends BasePage {

    public AccordionPage(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Opção')]")
    private List<MobileElement> options;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'descrição')]")
    private MobileElement description;

    public void clicaNoAccordionPorNome(String accordionName) {
        clicar(options, accordionName);
    }

    public String retornaTextoDaDescricao() {
        return recuperaTexto(description);
    }
}
