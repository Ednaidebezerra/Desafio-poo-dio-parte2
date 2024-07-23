package com.br.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
//Classe de dominio
public class Dev {
    private  String nome;

    // setar uma lista de conteudos LinkedHashSet modelo de (ordenação elementos unicos)
    // diferente de arrayList que os objetos podem se repetir.
    //aqui esta sendo usado herança e polimorfismo.
    private final Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    //metodo para inscrição:
    //pega tudo que tem no Set(lista) e coloca dentro de conteudosInscritos
    // no bootcamp, peguei todos os os Devs inscritos e adicionei ao (Bootcamp)
    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    //metodo que mostra a progressao do incrito Dev
    // pega tudo de conteudosInscritos e coloca dentro de conteudosConcluidos.
    // Se o conteudo existe, add (get) e remove da lista (para pegar) se nao "err".

    public void progredir (){
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if(conteudo.isPresent()){
            this.conteudosConcluidos.add(conteudo .get());
        }else {
            System.err.println("Voce nao esta inscrito em nenhum conteudo");
        }
    }

    //metodo para pegar cada parametro do conteudo e somar.
    public double calcularTotalXp(){
        return this.conteudosConcluidos
                .stream()
                .mapToDouble(Conteudo::calcularXp)
                .sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    // quando se trabalha com set e Hash precisa implementar equal() end hashCod().
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dev dev)) return false;
        return Objects.equals(getNome(), dev.getNome()) && Objects.equals(getConteudosInscritos(), dev.getConteudosInscritos()) && Objects.equals(getConteudosConcluidos(), dev.getConteudosConcluidos());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getConteudosInscritos(), getConteudosConcluidos());
    }

}
