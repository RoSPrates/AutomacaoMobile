package br.com.cursoudemy.appium.pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import static br.com.cursoudemy.appium.core.DriverFactory.getDriver;

public class BasePage {

    WebDriverWait wait;
    TouchAction touchAction;

    public BasePage() {
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
        wait = new WebDriverWait(getDriver(), 40);
        touchAction = new TouchAction(getDriver());
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

    public List<String> recuperaTexto(List<MobileElement> mobileElements) {
        wait.until(ExpectedConditions.visibilityOfAllElements(mobileElements.get(0)));
        return mobileElements.stream().
                filter(m -> !m.getText().isEmpty()).
                collect(Collectors.toList()).
                stream().map(this::recuperaTexto).
                collect(Collectors.toList());
    }

    public void clicar(List<MobileElement> mobileElements, String text) {
        sleep(500);
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
        return mobileElements.stream()
                .anyMatch(m -> m.getText().equalsIgnoreCase(text));
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
        sleep(500);
        wait.until(ExpectedConditions.visibilityOf(this.lblAlertTitle));
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
        sleep(500);
        clicar(btnDia, dia);
    }

    public void clicarNoTimeHelper(String option) {
        sleep(500);
        clicar(btnTimeHelper.stream()
                .filter(m -> m.getAttribute("content-desc").equalsIgnoreCase(option))
                .findFirst().orElseThrow(IllegalArgumentException::new));
    }

    public void tap(int cordenadaX, int cordenadaY) {
        touchAction.press(new PointOption().withCoordinates(cordenadaX, cordenadaY)).perform();
    }

    public boolean textoDoElementoEVisivel(String texto) {
        try {
            return getDriver().findElement(MobileBy.xpath("//*[@text = '" + texto + "']")).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void clicarSeekBar(MobileElement seekBar, int posicao, int delta) {
        int y = seekBar.getLocation().getY() + seekBar.getSize().getHeight() / 2;
        int xInicial = seekBar.getLocation().getX() + delta;
        int xFinal = (int) (xInicial + seekBar.getSize().getWidth() - 2 * delta);
        move(xInicial, y, (int) (xFinal * (posicao / 100.0)), y);
    }

    public void clicarLongo(MobileElement mobileElement) {
        touchAction.longPress(new PointOption().
                withCoordinates(mobileElement.getCenter())).perform();
    }

    public void clicarLongo(List<MobileElement> mobileElements, String text) {
        wait.until(ExpectedConditions.visibilityOfAllElements(mobileElements.get(0)));
        clicarLongo(mobileElements.stream()
                .filter(m -> m.getText().equalsIgnoreCase(text))
                .findFirst().orElseThrow(IllegalArgumentException::new));
    }

    public void duploClique(MobileElement mobileElement) {
        wait.until(ExpectedConditions.visibilityOf(mobileElement));
        mobileElement.click();
        mobileElement.click();
    }

    public void duploClique(List<MobileElement> mobileElements, String text) {
        wait.until(ExpectedConditions.visibilityOfAllElements(mobileElements.get(0)));
        duploClique(mobileElements.stream()
                .filter(m -> m.getText().equalsIgnoreCase(text))
                .findFirst().orElseThrow(IllegalArgumentException::new));
    }

    public void scrollInScreem(int xInicial, int yInicial, int xFinal, int yFinal) {
        Dimension size = getDriver().manage().window().getSize();
        int startX = (int) (size.getWidth() * (xInicial / 100.0));
        int endX = (int) (size.getWidth() * (xFinal / 100.0));
        int startY = (int) (size.getHeight() * (yInicial / 100.0));
        int endY = (int) (size.getHeight() * (yFinal / 100.0));
        move(startX, startY, endX, endY);
    }

    public void move(int startX, int startY, int endX, int endY) {
        touchAction.
                press(new PointOption().withCoordinates(startX, startY)).
                waitAction(WaitOptions.waitOptions(Duration.ofMillis(500))).
                moveTo(new PointOption().withCoordinates(endX, endY)).
                release().
                perform();
    }

    protected void sleep(int time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
