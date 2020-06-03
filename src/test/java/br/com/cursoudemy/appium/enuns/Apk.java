package br.com.cursoudemy.appium.enuns;

import java.io.File;

public enum Apk {
    CTAPPIUM(new File("./apks/CT-Appium.apk")),
    CAULCULADORA_MI(new File("apks/calculator-mi.apk"));

    private File caminho;


    Apk(File caminho) {
        this.caminho = caminho;
    }

    public File getCaminho() {
        return caminho;
    }
}
