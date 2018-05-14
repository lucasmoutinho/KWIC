#language: pt
#encoding: utf-8

Funcionalidade: Ler arquivo texto e transformar num KWIC

  Cenario: Transformação com sucesso de uma série de linha em um KWIC
    Dado que eu tenha um arquivo texto denominado "teste.txt" com 4 linhas
    E um arquivo de stop_words "stop_words.txt"
    Quando eu abrir este arquivo e ler os dados e requisitar o KWIC destes dados
    Entao eu devo ter como saída uma lista alfabética de todas as linhas do arquivo original em KWIC
