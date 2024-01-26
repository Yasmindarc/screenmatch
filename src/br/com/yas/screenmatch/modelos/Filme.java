package br.com.yas.screenmatch.modelos;

import br.com.yas.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @java.lang.Override
    public int getClassificacao() {
        return (int)pegaMedia() / 2;
    }
}
