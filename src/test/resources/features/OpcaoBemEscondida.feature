# language: pt
# encoding: utf-8

@opcaoBemEscondida
Funcionalidade: OpcaoBemEscondida

  Cenario: entrar e sair da tela de splash
    Dado escolher no menu a opção "Opção bem escondida"
    Quando confirmar o alerta da ultima opção
    Entao volto para o menu e vejo "Opção bem escondida"