# language: pt
# encoding: utf-8

@cliques
Funcionalidade: Cliques

  Contexto: Acessar a Pagina de Cliques
    Dado escolher no menu a opção "Cliques"

  @cliqueLongo
  Cenario: Validar clique longo
    Quando quando clicar e segurar em clique longo
    Entao validar na tela "Clique Longo"

  @cliqueDuploRapido
  Cenario: Validar clique dublo rapido
    Quando clicar duas vezes rapidas em clique duplo
    Entao validar na tela "Duplo Clique"

  @cliqueDuploLento
  Cenario: Validar clique duplo lento
    Quando clicar duas vezes em clique dublo lento
    Entao validar na tela "Duplo Clique lento"