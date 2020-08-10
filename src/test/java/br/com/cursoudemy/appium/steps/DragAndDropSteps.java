package br.com.cursoudemy.appium.steps;

import br.com.cursoudemy.appium.pages.DragAndDropPage;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

public class DragAndDropSteps {

    DragAndDropPage dragAndDropPage;
    String[] posicoesNaTela;
    int start;
    int end;

    public DragAndDropSteps() {
        this.dragAndDropPage = new DragAndDropPage();
        this.posicoesNaTela = new String[]{"Esta", "é uma lista", "Drag em Drop!",
                "Faça um clique longo,", "e arraste para", "qualquer local desejado."};
    }

    private void pegarPosicoes(String de, String para) {
        for (int i = 0; i < this.posicoesNaTela.length; i++) {
            if (this.posicoesNaTela[i].equalsIgnoreCase(de)) this.start = i;
            else if (this.posicoesNaTela[i].equalsIgnoreCase(para)) this.end = i;
        }
    }

    private void organizarPosicoes() {
        String aux = this.posicoesNaTela[this.start];
        if (this.start < this.end) {
            for (int i = this.start; i < this.end; i++) {
                this.posicoesNaTela[i] = this.posicoesNaTela[i + 1];
            }
        } else {
            for (int i = this.start; i > this.end; i--) {
                this.posicoesNaTela[i] = this.posicoesNaTela[i - 1];
            }
        }
        this.posicoesNaTela[this.end] = aux;
    }

    @Quando("arrastar a opção {string} para {string}")
    public void arrastarAOpcaoPara(String de, String para) {
        this.pegarPosicoes(de, para);
        this.dragAndDropPage.moverDragAndDropDeUmParaOutro(de, para);
    }

    @Entao("validar as posições na tela")
    public void validarAsPosicoesNaTela() {
        this.organizarPosicoes();
        Assert.assertArrayEquals(this.posicoesNaTela, this.dragAndDropPage.retornaTextosdaTela());
    }
}
