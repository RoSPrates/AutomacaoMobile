package br.com.cursoudemy.appium.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.List;

public class DragAndDropPage extends  BasePage{

    @AndroidFindBy(className = "android.widget.TextView")
    private List<MobileElement> lblDragAndDrop;

    public void moverDragAndDropDeUmParaOutro(String de, String para){
        mover(lblDragAndDrop,de,para);
    }

    public String[] retornaTextosdaTela(){
        String[] a = new String[6];
        return recuperaTexto(lblDragAndDrop).toArray(a);
    }
}
