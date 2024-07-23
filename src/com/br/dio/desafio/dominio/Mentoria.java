package com.br.dio.desafio.dominio;
import java.time.LocalDate;
public class Mentoria extends Conteudo {
    LocalDate data;

    //A classe "mãe" obriga os filhos usarem os seus metodos.
    //
    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public Mentoria() {
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }


}
