# language: pt
# encoding: utf-8

@alert
Funcionalidade: Alert

  Contexto: Acessar a tela de alert
    Dado escolher no menu a opção "alertas"

  @alertConfirm
  Cenario: validar o Alert Confirm
    E clicar no alerta "alerta confirm"
    Quando Confirmar o alerta
    E clicar no botão sair do alerta
    Entao confirmar que saiu do alerta

  @alertSimples
  Cenario: validar o Alerta Simples
    E clicar no alerta "alerta simples"
    Quando Confirmar o alerta simples
    Entao confirmar que saiu do alerta simples