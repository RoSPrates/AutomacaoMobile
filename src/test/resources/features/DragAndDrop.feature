# language: pt
# encoding: utf-8

@DragAndDrop
Funcionalidade: Drag And Drop

  Esquema do Cenario: Arrastar o drag and drop
    Dado escolher no menu a opção "Drag and drop"
    Quando arrastar a opção "<de>" para "<para>"
    Entao validar as posições na tela

    Exemplos:
      | de                    | para                  |
      | Esta                  | Faça um clique longo, |
      | Faça um clique longo, | Esta                  |