package br.com.cursoudemy.appium.pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BasePage {

    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;

    public BasePage(AndroidDriver<MobileElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        this.driver = driver;
        wait = new WebDriverWait(driver, 40);
    }

    @AndroidFindBy(id = "android:id/message")
    private MobileElement lblConfirmAlertMessage;

    @AndroidFindBy(id = "android:id/alertTitle")
    private MobileElement lblAlertTitle;

    @AndroidFindBy(xpath = "//android.widget.Button[@text = 'CONFIRMAR']")
    private MobileElement btnConfirmar;

    @AndroidFindBy(xpath = "//android.widget.Button[@text = 'NEGAR']")
    private MobileElement btnNegar;

    @AndroidFindBy(xpath = "//android.widget.Button[@text = 'OK']")
    private MobileElement btnOk;

    @AndroidFindBy(xpath = "//android.widget.Button[@text = 'CANCEL']")
    private MobileElement btnCancel;

    @AndroidFindBy(xpath = "//android.widget.Button[@text = 'SAIR']")
    private MobileElement btnSair;

    @AndroidFindBy(xpath = "//android.view.View")
    private List<MobileElement> btnDia;

    @AndroidFindBy(className = "android.widget.RadialTimePickerView$RadialPickerTouchHelper")
    private List<MobileElement> btnTimeHelper;


    public void escrever(MobileElement mobileElement, String text) {
        wait.until(ExpectedConditions.visibilityOf(mobileElement));
        mobileElement.sendKeys(text);
    }

    public void clicar(MobileElement mobileElement) {
        wait.until(ExpectedConditions.visibilityOf(mobileElement));
        mobileElement.click();
    }

    public String recuperaTexto(MobileElement mobileElement) {
        wait.until(ExpectedConditions.visibilityOf(mobileElement));
        return mobileElement.getText();
    }

    public void clicar(List<MobileElement> mobileElements, String text) {
        wait.until(ExpectedConditions.visibilityOfAllElements(mobileElements.get(0)));
        clicar(mobileElements.stream()
                .filter(m -> m.getText().equalsIgnoreCase(text))
                .findFirst().orElseThrow(IllegalArgumentException::new));
    }

    public void ativaOuDesativaSwitchECheckBox(MobileElement checkOrSwitch, boolean ativaOuDesativa) {
        wait.until(ExpectedConditions.visibilityOf(checkOrSwitch));
        if (!isChecked(checkOrSwitch) == ativaOuDesativa) clicar(checkOrSwitch);
    }

    public boolean isChecked(MobileElement mobileElement) {
        wait.until(ExpectedConditions.visibilityOf(mobileElement));
        return mobileElement.getAttribute("checked").toLowerCase().equals("true");
    }

    public boolean verificaTextoPesente(List<MobileElement> mobileElements, String text) {
        mobileElements.stream()
                .filter(m -> m.getText().equalsIgnoreCase(text))
                .findFirst().orElseThrow(IllegalArgumentException::new);
        return true;
    }

    public void aguardaSairDaTela(MobileElement mobileElement) {
        wait.until(ExpectedConditions.invisibilityOf(mobileElement));
    }

    public void aguardaSairDaTela(List<MobileElement> mobileElements, String text) {
        aguardaSairDaTela(mobileElements.stream()
                .filter(m -> m.getText().equalsIgnoreCase(text))
                .findFirst().orElseThrow(IllegalArgumentException::new));
    }

    public String retornaTextoMensagemAlert() {
        return recuperaTexto(this.lblConfirmAlertMessage);
    }

    public String retornaTextoTitleAlert() {
        return recuperaTexto(this.lblAlertTitle);
    }

    public void clicarBtnConfirmar() {
        clicar(this.btnConfirmar);
    }

    public void clicarBtnNegar() {
        clicar(this.btnNegar);
    }

    public void clicarBtnOk() {
        clicar(this.btnOk);
    }

    public void clicarBtnCancel() {
        clicar(this.btnCancel);
    }

    public void clicarBtnSair() {
        clicar(this.btnSair);
    }


    public void esperarElemento(MobileElement mobileElement) {
        wait.until(ExpectedConditions.visibilityOf(mobileElement));
    }

    public boolean btnOkIsPesent() {
        return btnOk.isDisplayed();
    }

    public void escolheDia(String dia) {
        clicar(btnDia, dia);
    }

    public void clicarNoTimeHelper(String option) {
        clicar(btnTimeHelper.stream()
                .filter(m -> m.getAttribute("content-desc").equalsIgnoreCase(option))
                .findFirst().orElseThrow(IllegalArgumentException::new));
    }

    public void tap(int cordenadaX, int cordenadaY) {
        new TouchAction<>(driver).press(new PointOption().withCoordinates(cordenadaX, cordenadaY)).perform();
    }

    public boolean textoDoElementoEVisivel(String texto) {
        try {
            return driver.findElement(MobileBy.xpath("//*[@text = '" + texto + "']")).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}