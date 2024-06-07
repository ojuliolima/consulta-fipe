# Consulta na API FIPE
O projeto foi desenvolvido em Java, utilizando Spring Framework para realizar a consulta de uma lista de veículos com suas respectivas informações, através de uma API. 
O projeto faz parte do desafio final do curso Java: trabalhando com lambdas, streams e Spring Framework da [Alura](https://cursos.alura.com.br/).

## API
A API utilizada foi fornecida por Deivid Fortuna https://deividfortuna.github.io/fipe/

## Utilização
* Para testar a aplicação, basta clona-la e baixar as dependências do projeto através do maven. Ao executar o projeto, o terminal apresentará a seguinte mensagem:
```
Selecione o tipo do veículo:
1. carros
2. motos
3. caminhoes
```
Ao selecionar um número, o sistema, irá apresentar as opções de consulta de veículo.
* Próximo passo, será solicitado o código da marca que deseja consultar, por exemplo, Cod: 101 (YAMAHA) caso o tipo de veículo escolhido tenha sido a opção de **motos**.
* Os modelos dessa marca serão apresentados e será solicitado que se digite um trecho do nome do modelo do veículo para a consulta. Seguindo o exemplo do passo anterior, pode se digitar "factor".
* Os modelos filtrados pela palavra digitada aparecerão e por último o sistema solicitará o código do modelo que deseja consultar os valores de avaliação, por exemplo, Cod: 7388 (YBR 150 FACTOR ED/FLEX).
* O sistema irá buscar e apresentar todos os dados de todos os anos desse veículo, da seguinte forma:

```
Todos os veículo filtrados
Veiculo[valor=R$ 17.276,00, marca=YAMAHA, modelo=YBR 150 FACTOR ED/FLEX, ano=32000, tipoCombustivel=Gasolina]
Veiculo[valor=R$ 15.493,00, marca=YAMAHA, modelo=YBR 150 FACTOR ED/FLEX, ano=2024, tipoCombustivel=Gasolina]
Veiculo[valor=R$ 14.820,00, marca=YAMAHA, modelo=YBR 150 FACTOR ED/FLEX, ano=2023, tipoCombustivel=Gasolina]
Veiculo[valor=R$ 13.605,00, marca=YAMAHA, modelo=YBR 150 FACTOR ED/FLEX, ano=2022, tipoCombustivel=Gasolina]
Veiculo[valor=R$ 12.404,00, marca=YAMAHA, modelo=YBR 150 FACTOR ED/FLEX, ano=2021, tipoCombustivel=Gasolina]
Veiculo[valor=R$ 12.069,00, marca=YAMAHA, modelo=YBR 150 FACTOR ED/FLEX, ano=2020, tipoCombustivel=Gasolina]
Veiculo[valor=R$ 11.767,00, marca=YAMAHA, modelo=YBR 150 FACTOR ED/FLEX, ano=2019, tipoCombustivel=Gasolina]
Veiculo[valor=R$ 11.044,00, marca=YAMAHA, modelo=YBR 150 FACTOR ED/FLEX, ano=2018, tipoCombustivel=Gasolina]
Veiculo[valor=R$ 10.314,00, marca=YAMAHA, modelo=YBR 150 FACTOR ED/FLEX, ano=2017, tipoCombustivel=Gasolina]
Veiculo[valor=R$ 10.062,00, marca=YAMAHA, modelo=YBR 150 FACTOR ED/FLEX, ano=2016, tipoCombustivel=Gasolina]
```
Finalizando assim, a aplicação.
  
## Conteúdo praticado:
* Orientação à Objetos
* Consumo de API
* Utilização de Lambdas
* Utilização de steam
* Criação de classes Record
* Utilização da biblioteca Jackson
* Utilização de method reference
* Desenvolvimento através da implementação da interface CommandLineRunner
