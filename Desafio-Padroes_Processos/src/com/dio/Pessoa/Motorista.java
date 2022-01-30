package com.dio.Pessoa;

import com.dio.Comportamento.Comportamento;
import com.dio.Formatacao.FormatacaoLocalizacaoMoeda;
import com.dio.Veiculo.Veiculo;

import java.text.NumberFormat;
import java.util.LinkedHashSet;
import java.util.Set;

public class Motorista {
    private String nome;
    private Set<Veiculo> veiculosPossuidos = new LinkedHashSet<>();
    private Comportamento formaDeDirigir;

    public void adicionarVeiculo(Veiculo veiculo){
        veiculosPossuidos.add(veiculo);
    }

    public double calcularValorVeiculos(){
        return veiculosPossuidos.stream().mapToDouble(veiculo -> veiculo.mostrarValor()).sum();
    }

    public void mostrarValorVeiculos(){
        NumberFormat formatoBr = FormatacaoLocalizacaoMoeda.determinar();
        System.out.println("O motorista "+ nome +" gastou " + formatoBr.format(calcularValorVeiculos()) +" comprando seus veículos.");
    }

    public Motorista(String nome) {
        this.nome = nome;
    }

    public void setFormaDeDirigir(Comportamento formaDeDirigir) {
        this.formaDeDirigir = formaDeDirigir;
    }

    public void dirigir(){
        formaDeDirigir.dirigir();
    }
}
