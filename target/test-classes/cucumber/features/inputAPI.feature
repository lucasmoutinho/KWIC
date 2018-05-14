#language: pt
#encoding: utf-8

  Funcionalidade: Ler texto de uma API frase por frase

    Cenario: Leitura com sucesso de uma API do DBLP
      Dado que tenha acesso a um repositório de títulos de livros com a query de pesquisa 'Rodrigo' na url "http://dblp.org/search/publ/api?q=Rodrigo&format=json"
      Quando eu fizer a requisição para a API com a query 'Rodrigo'
      Entao devo ver uma quantidade não nula de títulos
