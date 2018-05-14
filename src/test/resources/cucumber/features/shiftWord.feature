#language: pt
#encoding: utf-8

Funcionalidade: Realizar o circulamento de uma frase no padrão KWIC
  Delineacao do Cenario: Feito circulamento correto da frase
    Dado que eu tenha as frases "<frase>"
    Quando eu usar a função de circular a frase "<frase>"
    Entao eu devo ver a frase circulada corretamente "<frase_circulada>"

    Exemplos:
    |frase                             |frase_circulada                   |
    |Empresa Junior de Alto Crescimento|de Alto Crescimento Empresa Junior|
    |Ser uma empresa de TI referência  |empresa de TI referência Ser uma  |
    |Você já mandou bem hoje           |mandou bem hoje Você já           |