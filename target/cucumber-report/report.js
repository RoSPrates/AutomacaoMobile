$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("formulario.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: pt"
    },
    {
      "line": 2,
      "value": "# encoding: utf-8"
    }
  ],
  "line": 4,
  "name": "Formulario",
  "description": "",
  "id": "formulario",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "line": 5,
  "name": "salvar formulario completo",
  "description": "",
  "id": "formulario;salvar-formulario-completo",
  "type": "scenario",
  "keyword": "Cenario"
});
formatter.step({
  "line": 6,
  "name": "escolher no menu a opção \"Formulario\"",
  "keyword": "Dado "
});
formatter.step({
  "line": 7,
  "name": "preencher o formulario",
  "keyword": "Quando "
});
formatter.step({
  "line": 8,
  "name": "visualizar as informações do formulario",
  "keyword": "Entao "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});