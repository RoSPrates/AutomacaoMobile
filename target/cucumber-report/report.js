$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Alert.feature");
formatter.feature({
  "name": "Alert",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@alert"
    }
  ]
});
formatter.background({
  "name": "Acessar a tela de alert",
  "description": "",
  "keyword": "Contexto"
});
formatter.step({
  "name": "escolher no menu a opção \"alertas\"",
  "keyword": "Dado "
});
formatter.match({
  "location": "br.com.cursoudemy.appium.steps.FormularioSteps.escolherNoMenuAOpcao(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "validar o Alert Confirm",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@alert"
    },
    {
      "name": "@alertConfirm"
    }
  ]
});
formatter.step({
  "name": "clicar no alerta \"alerta confirm\"",
  "keyword": "E "
});
formatter.match({
  "location": "br.com.cursoudemy.appium.steps.AlertSteps.clicarNoAlerta(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Confirmar o alerta",
  "keyword": "Quando "
});
formatter.match({
  "location": "br.com.cursoudemy.appium.steps.AlertSteps.confirmarOAlerta()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar no botão sair do alerta",
  "keyword": "E "
});
formatter.match({
  "location": "br.com.cursoudemy.appium.steps.AlertSteps.clicarNoBotaoSairDoAlerta()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "confirmar que saiu do alerta",
  "keyword": "Entao "
});
formatter.match({
  "location": "br.com.cursoudemy.appium.steps.AlertSteps.confirmarQueSaiuDoAlerta()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "Acessar a tela de alert",
  "description": "",
  "keyword": "Contexto"
});
formatter.step({
  "name": "escolher no menu a opção \"alertas\"",
  "keyword": "Dado "
});
formatter.match({
  "location": "br.com.cursoudemy.appium.steps.FormularioSteps.escolherNoMenuAOpcao(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "validar o Alerta Simples",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@alert"
    },
    {
      "name": "@alertSimples"
    }
  ]
});
formatter.step({
  "name": "clicar no alerta \"alerta simples\"",
  "keyword": "E "
});
formatter.match({
  "location": "br.com.cursoudemy.appium.steps.AlertSteps.clicarNoAlerta(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Confirmar o alerta simples",
  "keyword": "Quando "
});
formatter.match({
  "location": "br.com.cursoudemy.appium.steps.AlertSteps.confirmarOAlertaSimples()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "confirmar que saiu do alerta simples",
  "keyword": "Entao "
});
formatter.match({
  "location": "br.com.cursoudemy.appium.steps.AlertSteps.confirmarQueSaiuDoAlertaSimples()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});