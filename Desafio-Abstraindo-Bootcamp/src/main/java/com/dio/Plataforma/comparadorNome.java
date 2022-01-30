package com.dio.Plataforma;

import com.dio.Pessoa.Dev;

import java.util.Comparator;

public class comparadorNome implements Comparator<Dev> {

    @Override
    public int compare(Dev dev1, Dev dev2) {
        int nome = dev1.getNome().compareToIgnoreCase(dev2.getNome());
        if (nome!=0) return nome;

        return dev1.getSobrenome().compareToIgnoreCase(dev2.getSobrenome());

    }
}
