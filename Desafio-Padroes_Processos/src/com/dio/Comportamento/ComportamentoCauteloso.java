package com.dio.Comportamento;

public class ComportamentoCauteloso implements Comportamento{
    @Override
    public void dirigir() {
        System.out.println("Andando de forma devagar!");
    }
}
