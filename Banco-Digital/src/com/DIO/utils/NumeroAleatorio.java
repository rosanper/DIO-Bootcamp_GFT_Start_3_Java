package com.DIO.utils;

import java.util.Random;

public class NumeroAleatorio {

    public static int gerarNumeroAleatorio(int quantidadeDeNumeros){
        int numeroGerado = 0;
        int n = (int) Math.pow(10,quantidadeDeNumeros);

        Random gerar = new Random();
        numeroGerado = gerar.nextInt(n);

        return numeroGerado;
    }
}
