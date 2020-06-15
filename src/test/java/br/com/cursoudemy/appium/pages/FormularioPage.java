package br.com.cursoudemy.appium.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.List;

public class FormularioPage extends BasePage {


    public FormularioPage(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    @AndroidFindBy(accessibility = "console")
    private MobileElement abrirCombo;

    @AndroidFindBy(id = "android:id/text1")
    private List<MobileElement> consoles;

    @AndroidFindBy(accessibility = "nome")
    private MobileElement nome;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text = 'SALVAR']")
    private MobileElement btnSalvar;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text = 'SALVAR DEMORADO']")
    private MobileElement btnSalvarDemorado;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@package = 'com.ctappium']")
    private MobileElement check;

    @AndroidFindBy(xpath = "//android.widget.Switch[@package = 'com.ctappium']")
    private MobileElement swit;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Console:')]")
    private MobileElement consoleSalvo;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Nome:')]")
    private MobileElement salvedName;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Slider:')]")
    private MobileElement seekBarSalvo;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'/')]")
    private MobileElement openCalendar;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,':')]")
    private MobileElement openClock;

    @AndroidFindBy(accessibility = "slid")
    private MobileElement seekFormulario;

    public void escolherNoComboConsoles(String option) {
        clicar(abrirCombo);
        clicar(this.consoles, option);
    }

    public void escreverNome(String text) {
        escrever(nome, text);
    }

    public void clicarSalvar() {
        clicar(btnSalvar);
    }

    public void ativaDesativaCheck(boolean ativaDesativa) {
        ativaOuDesativaSwitchECheckBox(check, ativaDesativa);
    }

    public void ativaDesativaSwitch(boolean ativaDesativa) {
        ativaOuDesativaSwitchECheckBox(swit, ativaDesativa);
    }

    public boolean checkIsChecked() {
        return isChecked(check);
    }

    public boolean switchIsChecked() {
        return isChecked(swit);
    }

    public String retornarNomeCadastrado() {
        return recuperaTexto(salvedName).substring(6);
    }

    public String retornaConsoleCadastrado() {
        return recuperaTexto(consoleSalvo).substring(9).toLowerCase();
    }

    public String recuperarPorcenatgemSeekBarCadastrado() {
        return recuperaTexto(this.seekBarSalvo).substring(8);
    }

    public void clicarSalvarDemorado() {
        clicar(this.btnSalvarDemorado);
    }

    public void openCalendar() {
        clicar(openCalendar);
    }

    public String recuperaTextoCalendario() {
        return recuperaTexto(openCalendar);
    }

    public void openClock() {
        clicar(openClock);
    }

    public String recuperaTextoRelogio() {
        return recuperaTexto(openClock);
    }

    public void clicarSeekBarFormulario(int porcentagem) {
        clicarSeekBar(this.seekFormulario, porcentagem, 30);
    }
}
