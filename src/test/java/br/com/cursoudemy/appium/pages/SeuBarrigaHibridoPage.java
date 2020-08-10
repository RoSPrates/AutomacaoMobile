package br.com.cursoudemy.appium.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SeuBarrigaHibridoPage extends BasePage{

    @AndroidFindBy(accessibility = "senha")
    private MobileElement inputSenha;

    public void digitarSenha(String senha){
        escrever(this.inputSenha,senha);
    }
}
