package com.dio.Plataforma;

import com.dio.Pessoa.Dev;
import lombok.Getter;
import lombok.ToString;


import java.util.Set;
import java.util.TreeSet;

@ToString
@Getter
public class Plataforma {
    private Set<Dev> listaDevs = new TreeSet<>(new comparadorNome());

    public void adcionarDev(Dev dev){
        listaDevs.add(dev);
    }



}


