package com.dio.Conteudo;

import lombok.Getter;
import lombok.Setter;


@Getter
public class Curso extends Conteudo{

    @Setter
    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO*cargaHoraria;
    }

}
