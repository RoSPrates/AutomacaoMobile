package br.com.cursoudemy.appium.steps;

import br.com.cursoudemy.appium.enuns.Usuarios;
import br.com.cursoudemy.appium.pages.SeuBarrigaHibridoPage;
import io.cucumber.java.pt.Quando;

public class SeuBarrigaHibridoSteps {

    SeuBarrigaHibridoPage seuBarrigaHibridoPage;
    public SeuBarrigaHibridoSteps(){
        seuBarrigaHibridoPage = new SeuBarrigaHibridoPage();
    }

    @Quando("digitar a senha na seu barriga hibrido {string}")
    public void digitarASenhaNaSeuBarrigaHibrido(String user) {
        seuBarrigaHibridoPage.digitarSenha(Usuarios.valueOf(("TEST_USER_" + user).toUpperCase()).senha());
    }
}
