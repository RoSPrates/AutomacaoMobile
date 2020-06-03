package br.com.cursoudemy.appium.test;

import br.com.cursoudemy.appium.core.DriverFactory;
import br.com.cursoudemy.appium.pages.FormularioPage;
import br.com.cursoudemy.appium.pages.MenuPage;
import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

public class FormularioTest extends BaseTest {

    private MenuPage menuPage;
    private FormularioPage formularioPage;

    public FormularioTest() {
        menuPage = new MenuPage(DriverFactory.getDriver());
        formularioPage = new FormularioPage(DriverFactory.getDriver());
    }

    @Before
    public void formularioTest() {
        menuPage.escolheNoMenu("formulário");
    }

    @Test
    public void salvarFormulario() {

        String nome = new Faker().rickAndMorty().character();
        String[] console = {"PS4", "XBox One", "Nintendo Switch"};
        int num = new Random().nextInt(console.length);

        formularioPage.escreverNome(nome);

        formularioPage.escolherNoComboConsoles(console[num]);

        formularioPage.ativaDesativaCheck(true);
        formularioPage.ativaDesativaSwitch(false);

        formularioPage.clicarSalvar();

        console[1] = "xone";
        console[2] = "Switch";

        Assert.assertEquals(console[num].toLowerCase(), formularioPage.retornaConsoleCadastrado().toLowerCase());
        Assert.assertEquals(nome, formularioPage.retornarNomeCadastrado());
        Assert.assertTrue(formularioPage.checkIsChecked());
        Assert.assertFalse(formularioPage.switchIsChecked());


    }

    @Test
    public void castrarApenasONome() {
        String nome = new Faker().zelda().character();

        formularioPage.escreverNome(nome);
        formularioPage.clicarSalvarDemorado();
        Assert.assertEquals(nome, formularioPage.retornarNomeCadastrado());
    }

    @Test
    public void escolerDiaCalendario() {
        formularioPage.openCalendar();
        formularioPage.escolheDia("20");
        formularioPage.clicarBtnOk();
        Assert.assertEquals("20/2/2000", formularioPage.recuperaTextoCalendario());
    }

    @Test
    public void escolerHoraPorHelper() {
        formularioPage.openClock();
        formularioPage.clicarNoTimeHelper("22");
        formularioPage.clicarNoTimeHelper("30");
        formularioPage.clicarBtnOk();
        Assert.assertEquals("22:30", formularioPage.recuperaTextoRelogio());

    }
}
