# language: pt
# encoding: utf-8

@formulario
Funcionalidade: Formulario

  Contexto: Acessar o Formulário
    Dado escolher no menu a opção "Formulário"


    @preencheFormularioCompleto
  Cenario: Salvar formulario completo
    Quando preencher o formulario
    Entao visualizar as informações do formulario

  Cenario: Salvar formulario apenas com nome
    Quando preencher o nome
    Entao visualizar o nome salvo

  Esquema do Cenario: Escolher data no calendario
    Quando escolher o dia "<dia>"
    Entao visualizar o dia "<dia>"

    Exemplos:
      | dia |
      | 20  |
      | 15  |
      | 25  |

  Esquema do Cenario: Preencher a hora pelo helper
    Quando escolher "<hora>" e "<minuto>"
    Entao Visualizar "<hora>" e "<minuto>"

    Exemplos:
      | hora | minuto |
      | 22   | 30     |
      | 14   | 20     |
      | 12   | 50     |