# Desafio Explorando Padrões de Projetos na Prática

### Desafio proposto

Crie uma solução que explore o conceito de Padrões de Projeto na pŕatica. Para isso, você pode reproduzir um dos projetos que criamos durante as aulas ou, caso se sinta preparado, desenvolver uma nova ideia do zero

### Resolução

Para a resolução desse desafio foi utilizado o padrao Strategy abordado no curso e também foi explorado um novo padrão de projeto: O Factory.

O factory é uma interface utilizada para criar objetos, e para a sua demonstração foi criado o seguinte programa:
- Foi criada uma interface Veiculo com os métodos pegarDados() e mostrarValor();
- As classes Carro, Moto e Caminhao implementam a interface Veiculo e possuem os mesmos atributos, porém com valores diferentes;
- Foi criado a classe VeiculoFactory com o método abstract gerarVeiculo, cuja função é gerar um objeto do tipo Veiculo (Carro, Moto ou Caminhao).

Já para abordar o padrão Strategy, foi realizado um código similar ao feito na aula:
- Foi criado uma interface Comportamento e as classes ComportamentoNormal, ComportamentoCauteloso e ComportamentoArriscado que retornam o método dirigir;
- Foi criado uma classe Motorista que vai utilizar o tipo Comportamento como parâmetro para o método dirigir.

A classe Motorista também possui uma Set de Veiculos e método para calcular a soma dos valores dos veículos do Set. 

O código vai rodar a partir da classe Main, onde o veiculofactory cria os veículos, os objetos Comportamento e motorista são instanciados e são impressos alguns resultados dos métodos das classes.

OBS:  A classe FormatacaoLocalizacaoMoeda é utilizada apenas para determinar a formatação de localização para a impressão do double no método mostrarValorVeiculos da classe Motorista.
