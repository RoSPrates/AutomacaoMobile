# language: pt
# encoding: utf-8

@tabs @abas
Funcionalidade: Tabs

  @trocarDeAba
  Esquema do Cenario: Trocar de aba
    Dado escolher no menu a opção "abas"
    E estar na "<Aba estar>"
    Quando clicar na "<Aba ir>"
    Entao confirmar estar na "<Aba ir>"

    Exemplos:
      | Aba estar | Aba ir |
      | Aba 2     | Aba 1  |
      | Aba 1     | Aba 2  |