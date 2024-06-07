package br.com.julio.fipe.main;

import br.com.julio.fipe.models.Dados;
import br.com.julio.fipe.models.Modelos;
import br.com.julio.fipe.models.Veiculo;
import br.com.julio.fipe.services.ConsumoAPI;
import br.com.julio.fipe.services.ConverteDados;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Principal {
    private Scanner leitura = new Scanner(System.in);
    private ConsumoAPI consumoAPI = new ConsumoAPI();
    private ConverteDados conversor = new ConverteDados();
    private String endereco = "https://parallelum.com.br/fipe/api/v1/";

    public void exibeMenu() {
        System.out.println("""
                Selecione o tipo do veículo:
                1 - carros
                2 - motos
                3 - caminhoes
                """);

        var tipoVeiculo = switch(leitura.nextInt()) {
            case 1 -> "carros";
            case 2 -> "motos";
            case 3 -> "caminhoes";
            default -> throw new IllegalArgumentException("Opção Inválida");
        };

        endereco = endereco + tipoVeiculo + "/marcas";

        var json = consumoAPI.obterDados(endereco);
        var marcas = conversor.obterDadosLista(json, Dados.class);

        marcas.stream()
                .sorted(Comparator.comparing(Dados::codigo))
                .forEach(System.out::println);

        System.out.println("Informe o código da marca que deseja consultar:");
        var codMarca = leitura.nextInt();

        endereco = endereco + "/" + codMarca + "/modelos";

        json = consumoAPI.obterDados(endereco);
        var modeloLista = conversor.obterDados(json, Modelos.class);

        System.out.println("\nModelos dessa marca:");
        modeloLista.modelos().stream()
                .sorted(Comparator.comparing(Dados::codigo))
                .forEach(System.out::println);

        System.out.println("Digite um trecho do nome do modelo do veículo para consulta:");
        var nomeModelo = leitura.nextLine();

        List<Dados> modelosFiltrados = modeloLista.modelos().stream()
                .filter(m -> m.descricao().toLowerCase().contains(nomeModelo.toLowerCase()))
                .collect(Collectors.toList());

        System.out.println("\nModelos filtrados");
        modelosFiltrados.forEach(System.out::println);

        System.out.println("Digite o código do modelo que deseja consultar os valores de avaliação:");
        var codModelo = leitura.nextInt();

        endereco = endereco + "/" + codModelo + "/anos";
        json = consumoAPI.obterDados(endereco);
        List<Dados> anos = conversor.obterDadosLista(json, Dados.class);
        List<Veiculo> veiculos = new ArrayList<>();

        for (int i = 0; i < anos.size(); i++) {
            var enderecoAnos = endereco + "/" + anos.get(i).codigo();
            json = consumoAPI.obterDados(enderecoAnos);
            Veiculo veiculo = conversor.obterDados(json, Veiculo.class);
            veiculos.add(veiculo);
        }

        System.out.println("\nTodos os veículo filtrados");
        veiculos.forEach(System.out::println);



    }


}
