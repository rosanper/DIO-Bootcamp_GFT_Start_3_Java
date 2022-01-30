package com.dio.Veiculo;

public class VeiculoFactory {
    public static Veiculo gerarVeiculo(String numeroRodas, String nomeVeiculo){
        Veiculo veiculoCriado = null;
            switch (numeroRodas){
                case "2":
                    veiculoCriado = new Moto(nomeVeiculo);
                    break;
                case "4":
                    veiculoCriado =  new Carro(nomeVeiculo);
                    break;
                case "8":
                    veiculoCriado = new Caminhao(nomeVeiculo);
                    break;
                default:
                    System.out.println("Digite um valor válido: 2, 4 ou 8.");
            }
            return veiculoCriado;



    }
}
