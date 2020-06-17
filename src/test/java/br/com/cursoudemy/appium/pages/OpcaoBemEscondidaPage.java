package br.com.cursoudemy.appium.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class OpcaoBemEscondidaPage extends BasePage {

    private String tituloAlert = "Sucesso";
    private String mensagemAlert = "Você achou essa opção";


    public String getTituloAlert() {
        return this.tituloAlert;
    }

    public String getMensagemAlert() {
        return this.mensagemAlert;
    }
}
