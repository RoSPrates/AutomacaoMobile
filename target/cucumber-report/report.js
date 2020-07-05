$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Swipe.feature");
formatter.feature({
  "name": "Swipe",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@swipe"
    }
  ]
});
formatter.scenario({
  "name": "Resetar todoas as opções",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@swipe"
    },
    {
      "name": "@swipeListPage"
    },
    {
      "name": "@resetarSwipeList"
    }
  ]
});
formatter.step({
  "name": "escolher no menu a opção \"Swipe List\"",
  "keyword": "Dado "
});
formatter.match({
  "location": "br.com.cursoudemy.appium.steps.FormularioSteps.escolherNoMenuAOpcao(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "resetar todos os swipes da swipe list",
  "keyword": "Quando "
});
formatter.match({
  "location": "br.com.cursoudemy.appium.steps.SwipeSteps.resetarTodosOsSwipesDaSwipeList()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "visialisar que não tem mais nenhum marcado",
  "keyword": "Entao "
});
formatter.match({
  "location": "br.com.cursoudemy.appium.steps.SwipeSteps.visialisarQueNaoTemMaisNenhumMarcado()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});