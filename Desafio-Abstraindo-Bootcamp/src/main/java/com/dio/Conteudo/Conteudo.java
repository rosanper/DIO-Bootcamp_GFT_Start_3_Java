package com.dio.Conteudo;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public abstract class Conteudo implements ICalcularXP{
    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricap;

    public abstract double calcularXp();

    @Override
    public String toString() {
        return  "titulo='" + titulo + '\'' +
                ", descricap='" + descricap + '\''+", ";
    }
}
