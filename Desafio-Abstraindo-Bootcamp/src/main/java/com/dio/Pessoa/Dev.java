package com.dio.Pessoa;

import com.dio.Bootcamp.Bootcamp;
import com.dio.Conteudo.Conteudo;
import lombok.*;


import java.util.*;

@EqualsAndHashCode
@ToString
@Getter
@RequiredArgsConstructor
public class Dev {
    @NonNull
    private String nome;
    @NonNull
    private String sobrenome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();


    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);

    }

    public void progredir(){
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if (conteudo.isPresent()){
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        }else{
            System.err.println("você não está matriculado em nenhum conteudo");
        }
    }

    public double calcularTotalXp(){
        return this.conteudosConcluidos.stream().mapToDouble(conteudo -> conteudo.calcularXp()).sum();
    }

}
