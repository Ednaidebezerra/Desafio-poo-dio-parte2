package com.br.dio.desafio.dominio;

public class Curso extends Conteudo {
    private int cargaHoraria;
    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }


    // Por defaul, existe em off o construtor vazio da classe.
    public Curso() {
    }
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    // Fazer os toStrings de tds os atributos. Alterar para getts pq o atributo esta "private".
    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }


}
