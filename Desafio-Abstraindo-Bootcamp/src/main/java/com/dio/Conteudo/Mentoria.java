package com.dio.Conteudo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class Mentoria extends Conteudo{
    private LocalDate data;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 40d;
    }

    @Override
    public String toString() {
        return "Mentoria{" + super.toString() +
                "data=" + data +
                "} "  ;
    }
}
