#language: pt
#encoding: utf-8

Funcionalidade: Ler arquivo texto frase por frase

  Cenario: Leitura com sucesso de arquivo texto
    Dado que eu tenha um arquivo texto denominado "teste.txt" com 4 linhas
    Quando eu abrir este arquivo e ler os dados
    Entao a quantidade de linhas deve ser 4