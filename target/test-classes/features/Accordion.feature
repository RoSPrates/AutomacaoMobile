# language: pt
# encoding: utf-8

@accordion
Funcionalidade: Accordion

  Esquema do Cenario: Testar os accordins
    Dado escolher no menu a opção "accordion"
    Quando clicar no accordion com o nome "<nome>"
    Entao visualizar as informações do accordion "<nome>"

    Exemplos:
      | nome    |
      | Opção 1 |
      | Opção 2 |
      | Opção 3 |
      | Opção 4 |
      | Opção 5 |