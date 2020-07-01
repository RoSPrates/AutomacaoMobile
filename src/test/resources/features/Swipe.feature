# language: pt
# encoding: utf-8

@swipe
Funcionalidade: Swipe

  @percorrerTodasTelasDoSwipe
  Cenario: Percorrer todas as telas do swipe
    Dado escolher no menu a opção "Swipe"
    E ir para proxima tela do swipe deslizando para direita
    E ir para proxima tela do swipe clicando no botão da direita
    Quando voltar da ultima para primeira tela do swipe
    Entao validar se estou na primeira tela do swipe