# language: pt
# encoding: utf-8

@swipe
Funcionalidade: Swipe

  @percorrerTodasTelasDoSwipe @swipePage
  Cenario: Percorrer todas as telas do swipe
    Dado escolher no menu a opção "Swipe"
    E ir para proxima tela do swipe deslizando para direita
    E ir para proxima tela do swipe clicando no botão da direita
    Quando voltar da ultima para primeira tela do swipe
    Entao validar se estou na primeira tela do swipe

  @swipeListPage @clicarMais
  Esquema do Cenario: Clicar no + da Swipe List
    Dado escolher no menu a opção "Swipe List"
    E fazer swipe para "esquerda" na opção "<numero>"
    Quando clicar no "<+/->" do + ou -
    Entao visualizar "<resultado>" na tela

    Exemplos:
      | numero | +/- | resultado   |
      | 1      | +   | Opção 1 (+) |
      | 2      | +   | Opção 2 (+) |
      | 3      | +   | Opção 3 (+) |
      | 4      | +   | Opção 4 (+) |
      | 5      | +   | Opção 5 (+) |
      | 6      | +   | Opção 6 (+) |
      | 7      | +   | Opção 7 (+) |
      | 8      | +   | Opção 8 (+) |

  @swipeListPage @clicarMenos
  Esquema do Cenario: Clicar no - da Swipe List
    Dado escolher no menu a opção "Swipe List"
    E fazer swipe para "esquerda" na opção "<numero>"
    Quando clicar no "<+/->" do + ou -
    Entao visualizar "<resultado>" na tela

    Exemplos:
      | numero | +/- | resultado   |
      | 1      | -   | Opção 1 (-) |
      | 2      | -   | Opção 2 (-) |
      | 3      | -   | Opção 3 (-) |
      | 4      | -   | Opção 4 (-) |
      | 5      | -   | Opção 5 (-) |
      | 6      | -   | Opção 6 (-) |
      | 7      | -   | Opção 7 (-) |
      | 8      | -   | Opção 8 (-) |

    @swipeListPage @resetarSwipeList
    Cenario: Resetar todoas as opções
      Dado escolher no menu a opção "Swipe List"
      Quando resetar todos os swipes da swipe list
      Entao visialisar que não tem mais nenhum marcado
