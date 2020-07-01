package br.com.cursoudemy.appium.steps;

import br.com.cursoudemy.appium.pages.OpcaoBemEscondidaPage;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

public class OpcaoBemEscondidaSteps {

    OpcaoBemEscondidaPage opcao;

    public OpcaoBemEscondidaSteps(){
        opcao = new OpcaoBemEscondidaPage();
    }

    @Quando("confirmar o alerta da ultima opção")
    public void confirmarOAlertaDaUltimaOpcao() {
        Assert.assertEquals(this.opcao.getTituloAlert(), this.opcao.retornaTextoTitleAlert());
        Assert.assertEquals(this.opcao.getMensagemAlert(), this.opcao.retornaTextoMensagemAlert());
        this.opcao.clicarBtnOk();
    }
}
