package com.br.dio.desafio.dominio;
//Classe de dominio
//Qnd a calasse é abstract, não é possivel instanciar-la
// ou seja atribuir valor (no construtor da main )
public abstract class Conteudo {

    //Classe MÃE de Curso e Mentoria, ela pussui os atributos incomuns.

    // Atributos dessa classe:
    // Protect (pode ser acessado por as filhas)
    // static ( pode ser acessado fora da classe)
    // final ( não pode ser alterado, atribuiçao final)
     protected final double XP_PADRAO = 10d;
    private String titulo;
    private  String descricao;

    public abstract double calcularXp();

    // Na hora de criar os getts e setts, O XP_padrao nao entra pq ele é "final".
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
