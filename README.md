<h1 align="center">
    Desenvolvimento Backend UNIPAULISTANA -2º Semestre de 2024
</h1>

## Curso
- Tecnólogo em Análise e Desenvolvimento de Sistemas (3º Semestre)

## Carga horária
- 68 horas
  
## Cronograma 

- [x]  Aula 01 - Apresentação da Disciplina 
    - Apresentação do Professor e da Disciplina
    - Revisão de OO
- [x]  Aula 02 - Exercícios de Revisão de OO
- [x]  Aula 03 - Classes Abstratas
    - Exercícios Práticos
- [x]  Aula 04 - Interface Gráfica
    - AWT
- [x]  Aula 05 - Interface Gráfica
    - Swing I
- [x]  Aula 06 - Interface Gráfica
    - Swing II
- [x]  Aula 07 - JDBC
- [x]  Aula 08 - Java DAO
- [x]  Aula 09 - MVC
- [x]  Aula 10 - Desenvolvimento de um CRUD Completo com MVC
- [x]  Aula 11 - Prova Específica
- [x]  Aula 12- Prova Sub

## Atividade 1 

- [x]  Crie um arquivo denominado heroi.java. Esse arquivo deverá ser composto por uma classe pública e apresentar os seguintes atributos privados: nome, poder, altura e idade. Não esqueça de utilizar os getters /setters e fazer as validações necessárias. Na classe testaheroi.java você deverá criar 3 heróis diferentes e exibir todos os atributos de todos os heróis.

- [x]  Crie uma classe chamada Veiculo com os seguintes atributos: marca, modelo, anoFabricacao, combustível, velocidadeAtual. Dentro da classe Veiculo, implemente os seguintes métodos:
    - ligar(): Imprime a mensagem "O veículo foi ligado."
    - acelerar(double velocidade): Incrementa a velocidade atual do veículo com o valor passado como parâmetro.
    - frear(double velocidade): Decrementa a velocidade atual do veículo com o valor passado como parâmetro.
    - exibirInformacoes(): Imprime todas as informações do veículo.
    - Crie uma classe TesteVeiculo com o método main() para testar a classe Veiculo.
    - No método main(), crie dois objetos da classe Veiculo, definindo valores para todos os atributos.
    - Chame os métodos ligar(), acelerar(50.0), frear(20.0) e exibirInformacoes() para cada um dos objetos criados.
     
## Atividade 2

- [x]  Entregar os 4 exercícios sobre AWT do pdf.

## Atividade 3

- [x] Responder as perguntas do pdf (18_09).

## Atividade 4

- [x] Mandar preferencialmente em um arquivo .zip os 4 exercícios do pdf em anexo (Exercícios_Swing).


## Atividade 5

- [x] Parte 1 - Workbench:
    - Criar uma base de dados chamada Cinema.
    - A base de dados contém uma tabela denominada Filmes que possui os seguintes campos: id do filme {chave primária}, nome do filme, duração (minutos) e gênero.

- [x] Parte 2 - JDBC:
    - Criar  um projeto chamado Cinema na IDE de sua preferência;
    - Adicionar o .jar do jdbc no projeto;
    - Criar a string de conexão com o banco de dados;
    - Realizar a modelagem das operações CRUD. É NECESSÁRIO incluir 10 FILMES. Na sequencia você deve atualizar o nome de 2 filmes a sua escolha. Por fim delete um filme a sua escolha. Para finalizar essa etapa não esqueça de executar a operação de READ.
    - Por fim crie os métodos: create, read, update e delete.
    - Teste sua aplicação no terminal da sua IDE e também utilizando o comando: "Select * from Filmes" no Workbench.
    - Entregar o arquivo cinema.java E cinema.sql
     
## Atividade 6

- [x] Parte 1 - Conceitos Básicos de MVC:
    - O que é o padrão MVC? Descreva brevemente cada um dos componentes (Modelo, Visão e Controlador).
    - Fluxo de Dados: Explique como os dados fluem entre os componentes do MVC. Como cada componente interage com os outros?

- [x] Parte 2 - Vantagens e Desvantagens:
    - Quais são as principais vantagens de usar o padrão MVC em aplicativos? Liste pelo menos três benefícios.
    - Quais são algumas desvantagens ou desafios associados ao uso do padrão MVC? Liste pelo menos duas desvantagens.

- [x] Parte 3 - Aplicações Práticas:
    - Pesquise exemplos de frameworks ou bibliotecas em Java que implementam o padrão MVC (por exemplo, Spring MVC, JavaServer Faces). Descreva brevemente como cada um implementa o padrão.

