#language: pt
#encoding: utf-8

Funcionalidade: Escrever uma sequencia de linhas em um arquivo

  Cenario: Escrever com sucesso uma sequencia de linhas em um arquivo
    Dado que eu tenha uma lista com 4 linhas
    Quando eu requisitar a escrita destas linhas em um arquivo
    Entao a quantidade de linhas na "saida.txt" deve ser 4
