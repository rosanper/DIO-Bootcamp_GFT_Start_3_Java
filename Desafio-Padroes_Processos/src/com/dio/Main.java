package com.dio;

import com.dio.Comportamento.Comportamento;
import com.dio.Comportamento.ComportamentoArriscado;
import com.dio.Comportamento.ComportamentoCauteloso;
import com.dio.Comportamento.ComportamentoNormal;
import com.dio.Pessoa.Motorista;
import com.dio.Veiculo.Veiculo;
import com.dio.Veiculo.VeiculoFactory;

public class Main {
    public static void main(String[] args) {
        Veiculo carro1 = VeiculoFactory.gerarVeiculo("4","Tipo");
        Veiculo carro2 = VeiculoFactory.gerarVeiculo("4","Opala");
        Veiculo moto1 = VeiculoFactory.gerarVeiculo("2","Scooter");
        Veiculo caminhao1 = VeiculoFactory.gerarVeiculo("8", "Carreta");

        System.out.println(carro1.pegarDados());

        Motorista motorista = new Motorista("Rodrigo");
        motorista.adicionarVeiculo(carro2);
        motorista.adicionarVeiculo(moto1);
        motorista.adicionarVeiculo(caminhao1);
        motorista.mostrarValorVeiculos();

        Comportamento normal = new ComportamentoNormal();
        Comportamento veloz = new ComportamentoArriscado();
        Comportamento devagar = new ComportamentoCauteloso();

        motorista.setFormaDeDirigir(normal);
        System.out.println(" --- Forma de dirigir do motorista: ");
        motorista.dirigir();

        motorista.setFormaDeDirigir(devagar);
        System.out.println(" --- Forma de dirigir do motorista: ");
        motorista.dirigir();

        motorista.setFormaDeDirigir(veloz);
        System.out.println(" --- Forma de dirigir do motorista: ");
        motorista.dirigir();



    }
}
