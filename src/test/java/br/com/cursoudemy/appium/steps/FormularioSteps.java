package br.com.cursoudemy.appium.steps;

import br.com.cursoudemy.appium.pages.FormularioPage;
import br.com.cursoudemy.appium.pages.MenuPage;
import com.github.javafaker.Faker;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

import java.util.Random;

public class FormularioSteps {

    private MenuPage menuPage;
    private FormularioPage formularioPage;
    String nome;
    String[] console;
    int num;
    int porcenatgem;

    public FormularioSteps() {
        menuPage = new MenuPage();
        formularioPage = new FormularioPage();
        nome = new Faker().rickAndMorty().character();
        console = new String[]{"PS4", "XBox One", "Nintendo Switch"};
        num = new Random().nextInt(console.length);
        porcenatgem = new Random().nextInt(22) + 78;
    }


    @Dado("^escolher no menu a opção \"([^\"]*)\"$")
    public void escolherNoMenuAOpcao(String opcao) {
        this.menuPage.escolheNoMenu(opcao);
    }

    @Quando("^preencher o formulario$")
    public void preencherOFormulario() {
        this.formularioPage.escreverNome(nome);
        this.formularioPage.escolherNoComboConsoles(console[num]);
        this.formularioPage.ativaDesativaCheck(true);
        this.formularioPage.ativaDesativaSwitch(false);
        this.formularioPage.clicarSeekBarFormulario(porcenatgem);
        this.formularioPage.clicarSalvar();
    }

    @Entao("^visualizar as informações do formulario$")
    public void visualizarAsInformacoesDoFormulario() {
        console[1] = "xone";
        console[2] = "Switch";
        Assert.assertEquals(console[num].toLowerCase(), formularioPage.retornaConsoleCadastrado().toLowerCase());
        if (nome.length() < 20)
            Assert.assertEquals(nome, formularioPage.retornarNomeCadastrado());
        else
            Assert.assertEquals(nome.substring(0, 20), formularioPage.retornarNomeCadastrado());
        Assert.assertTrue(formularioPage.checkIsChecked());
        Assert.assertFalse(formularioPage.switchIsChecked());
        Assert.assertEquals(String.valueOf(porcenatgem), formularioPage.recuperarPorcenatgemSeekBarCadastrado());
    }

    @Quando("preencher o nome")
    public void preencherONome() {
        formularioPage.escreverNome(nome);
        formularioPage.clicarSalvarDemorado();
    }

    @Entao("visualizar o nome salvo")
    public void visualizarONomeSalvo() {
        if (nome.length() < 20)
            Assert.assertEquals(nome, formularioPage.retornarNomeCadastrado());
        else
            Assert.assertEquals(nome.substring(0, 20), formularioPage.retornarNomeCadastrado());
    }

    @Quando("escolher o dia {string}")
    public void escolherODia(String dia) {
        formularioPage.openCalendar();
        formularioPage.escolheDia(dia);
        formularioPage.clicarBtnOk();
    }

    @Entao("visualizar o dia {string}")
    public void visualizarODia(String dia) {
        Assert.assertEquals(dia + "/2/2000", formularioPage.recuperaTextoCalendario());
    }

    @Quando("escolher {string} e {string}")
    public void escolherE(String hora, String minuto) {
        formularioPage.openClock();
        formularioPage.clicarNoTimeHelper(hora);
        formularioPage.clicarNoTimeHelper(minuto);
        formularioPage.clicarBtnOk();
    }

    @Entao("Visualizar {string} e {string}")
    public void visualizarE(String hora, String minuto) {
        Assert.assertEquals(hora + ":" + minuto, formularioPage.recuperaTextoRelogio());
    }
}