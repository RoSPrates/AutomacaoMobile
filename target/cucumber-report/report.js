$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/DragAndDrop.feature");
formatter.feature({
  "name": "Drag And Drop",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@DragAndDrop"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Arrastar o drag and drop",
  "description": "",
  "keyword": "Esquema do Cenario"
});
formatter.step({
  "name": "escolher no menu a opção \"Drag and drop\"",
  "keyword": "Dado "
});
formatter.step({
  "name": "arrastar a opção \"\u003cde\u003e\" para \"\u003cpara\u003e\"",
  "keyword": "Quando "
});
formatter.step({
  "name": "validar as posições na tela",
  "keyword": "Entao "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Exemplos",
  "rows": [
    {
      "cells": [
        "de",
        "para"
      ]
    },
    {
      "cells": [
        "Esta",
        "Faça um clique longo,"
      ]
    },
    {
      "cells": [
        "Faça um clique longo,",
        "Esta"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Arrastar o drag and drop",
  "description": "",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "name": "@DragAndDrop"
    }
  ]
});
formatter.step({
  "name": "escolher no menu a opção \"Drag and drop\"",
  "keyword": "Dado "
});
formatter.match({
  "location": "br.com.cursoudemy.appium.steps.FormularioSteps.escolherNoMenuAOpcao(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "arrastar a opção \"Esta\" para \"Faça um clique longo,\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "br.com.cursoudemy.appium.steps.DragAndDropSteps.arrastarAOpcaoPara(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validar as posições na tela",
  "keyword": "Entao "
});
formatter.match({
  "location": "br.com.cursoudemy.appium.steps.DragAndDropSteps.validarAsPosicoesNaTela()"
});
formatter.result({
  "error_message": "arrays first differed at element [0]; expected:\u003c[é uma li]sta\u003e but was:\u003c[E]sta\u003e\n\tat org.junit.internal.ComparisonCriteria.arrayEquals(ComparisonCriteria.java:78)\n\tat org.junit.internal.ComparisonCriteria.arrayEquals(ComparisonCriteria.java:28)\n\tat org.junit.Assert.internalArrayEquals(Assert.java:534)\n\tat org.junit.Assert.assertArrayEquals(Assert.java:285)\n\tat org.junit.Assert.assertArrayEquals(Assert.java:300)\n\tat br.com.cursoudemy.appium.steps.DragAndDropSteps.validarAsPosicoesNaTela(DragAndDropSteps.java:51)\n\tat ✽.validar as posições na tela(file:///Users/rodrigoprates/Desktop/Projetos/AutomacaoMobile/src/test/resources/features/DragAndDrop.feature:10)\nCaused by: org.junit.ComparisonFailure: expected:\u003c[é uma li]sta\u003e but was:\u003c[E]sta\u003e\n\tat org.junit.Assert.assertEquals(Assert.java:117)\n\tat org.junit.Assert.assertEquals(Assert.java:146)\n\tat org.junit.internal.ExactComparisonCriteria.assertElementsEqual(ExactComparisonCriteria.java:8)\n\tat org.junit.internal.ComparisonCriteria.arrayEquals(ComparisonCriteria.java:76)\n\tat org.junit.internal.ComparisonCriteria.arrayEquals(ComparisonCriteria.java:28)\n\tat org.junit.Assert.internalArrayEquals(Assert.java:534)\n\tat org.junit.Assert.assertArrayEquals(Assert.java:285)\n\tat org.junit.Assert.assertArrayEquals(Assert.java:300)\n\tat br.com.cursoudemy.appium.steps.DragAndDropSteps.validarAsPosicoesNaTela(DragAndDropSteps.java:51)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:564)\n\tat io.cucumber.java.Invoker.invoke(Invoker.java:27)\n\tat io.cucumber.java.JavaStepDefinition.execute(JavaStepDefinition.java:27)\n\tat io.cucumber.core.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:63)\n\tat io.cucumber.core.runner.TestStep.executeStep(TestStep.java:64)\n\tat io.cucumber.core.runner.TestStep.run(TestStep.java:49)\n\tat io.cucumber.core.runner.PickleStepTestStep.run(PickleStepTestStep.java:46)\n\tat io.cucumber.core.runner.TestCase.run(TestCase.java:51)\n\tat io.cucumber.core.runner.Runner.runPickle(Runner.java:66)\n\tat io.cucumber.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:149)\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:83)\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:24)\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:185)\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:83)\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\n\tat io.cucumber.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:219)\n\tat org.junit.internal.runners.statements.RunBefores.evaluate(RunBefores.java:26)\n\tat org.junit.internal.runners.statements.RunAfters.evaluate(RunAfters.java:27)\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)\n\tat com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:33)\n\tat com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:230)\n\tat com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:58)\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Arrastar o drag and drop",
  "description": "",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "name": "@DragAndDrop"
    }
  ]
});
formatter.step({
  "name": "escolher no menu a opção \"Drag and drop\"",
  "keyword": "Dado "
});
formatter.match({
  "location": "br.com.cursoudemy.appium.steps.FormularioSteps.escolherNoMenuAOpcao(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "arrastar a opção \"Faça um clique longo,\" para \"Esta\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "br.com.cursoudemy.appium.steps.DragAndDropSteps.arrastarAOpcaoPara(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validar as posições na tela",
  "keyword": "Entao "
});
formatter.match({
  "location": "br.com.cursoudemy.appium.steps.DragAndDropSteps.validarAsPosicoesNaTela()"
});
formatter.result({
  "error_message": "arrays first differed at element [0]; expected:\u003c[Faça um clique longo,]\u003e but was:\u003c[Esta]\u003e\n\tat org.junit.internal.ComparisonCriteria.arrayEquals(ComparisonCriteria.java:78)\n\tat org.junit.internal.ComparisonCriteria.arrayEquals(ComparisonCriteria.java:28)\n\tat org.junit.Assert.internalArrayEquals(Assert.java:534)\n\tat org.junit.Assert.assertArrayEquals(Assert.java:285)\n\tat org.junit.Assert.assertArrayEquals(Assert.java:300)\n\tat br.com.cursoudemy.appium.steps.DragAndDropSteps.validarAsPosicoesNaTela(DragAndDropSteps.java:51)\n\tat ✽.validar as posições na tela(file:///Users/rodrigoprates/Desktop/Projetos/AutomacaoMobile/src/test/resources/features/DragAndDrop.feature:10)\nCaused by: org.junit.ComparisonFailure: expected:\u003c[Faça um clique longo,]\u003e but was:\u003c[Esta]\u003e\n\tat org.junit.Assert.assertEquals(Assert.java:117)\n\tat org.junit.Assert.assertEquals(Assert.java:146)\n\tat org.junit.internal.ExactComparisonCriteria.assertElementsEqual(ExactComparisonCriteria.java:8)\n\tat org.junit.internal.ComparisonCriteria.arrayEquals(ComparisonCriteria.java:76)\n\tat org.junit.internal.ComparisonCriteria.arrayEquals(ComparisonCriteria.java:28)\n\tat org.junit.Assert.internalArrayEquals(Assert.java:534)\n\tat org.junit.Assert.assertArrayEquals(Assert.java:285)\n\tat org.junit.Assert.assertArrayEquals(Assert.java:300)\n\tat br.com.cursoudemy.appium.steps.DragAndDropSteps.validarAsPosicoesNaTela(DragAndDropSteps.java:51)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:564)\n\tat io.cucumber.java.Invoker.invoke(Invoker.java:27)\n\tat io.cucumber.java.JavaStepDefinition.execute(JavaStepDefinition.java:27)\n\tat io.cucumber.core.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:63)\n\tat io.cucumber.core.runner.TestStep.executeStep(TestStep.java:64)\n\tat io.cucumber.core.runner.TestStep.run(TestStep.java:49)\n\tat io.cucumber.core.runner.PickleStepTestStep.run(PickleStepTestStep.java:46)\n\tat io.cucumber.core.runner.TestCase.run(TestCase.java:51)\n\tat io.cucumber.core.runner.Runner.runPickle(Runner.java:66)\n\tat io.cucumber.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:149)\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:83)\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:24)\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:185)\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:83)\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\n\tat io.cucumber.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:219)\n\tat org.junit.internal.runners.statements.RunBefores.evaluate(RunBefores.java:26)\n\tat org.junit.internal.runners.statements.RunAfters.evaluate(RunAfters.java:27)\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)\n\tat com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:33)\n\tat com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:230)\n\tat com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:58)\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});