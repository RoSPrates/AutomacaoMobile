package br.com.cursoudemy.appium.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.List;

public class CliquePage extends BasePage {

    public CliquePage(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Clique')]")
    private List<MobileElement> brnClique;

    @AndroidFindBy(xpath = "(//android.widget.TextView)[3]")
    private MobileElement lblselecionado;

    public void clicarCliqueLongo(){
        clicarLongo(this.brnClique,"Clique Longo");
    }

    public String recuperaTextoDoCliqueSelecionado() {
        return super.recuperaTexto(this.lblselecionado);
    }

    public void clicarCliqueDuploLento(){
        clicar(this.brnClique,"Clique Duplo Lento");
        clicar(this.brnClique,"Clique Duplo Lento");
    }

    public void clicarCliqueDuplo(){
        duploClique(this.brnClique,"Clique Duplo");
    }
}
