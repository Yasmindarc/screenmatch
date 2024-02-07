package br.com.yas.screenmatch.principal;

import br.com.yas.screenmatch.calculos.CalculadoraDeTempo;
import br.com.yas.screenmatch.calculos.FiltroRecomendacao;
import br.com.yas.screenmatch.modelos.Episodio;
import br.com.yas.screenmatch.modelos.Filme;
import br.com.yas.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme filmeTeste = new Filme("Homem aranha", 2002);
        filmeTeste.setDuracaoEmMinutos(120);
        System.out.println("Duração do filme" + filmeTeste.getDuracaoEmMinutos());

        filmeTeste.exibeFichaTecnica();
        filmeTeste.avalia(8);
        filmeTeste.avalia(5);
        filmeTeste.avalia(7);
        System.out.println("Total de avaliações: " + filmeTeste.getTotalDeAvaliacoes());
        System.out.println(filmeTeste.pegaMedia());

        Serie lost = new Serie("Lost", 2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filmeTeste);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filmeTeste);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        Filme filmeTeste2 = new Filme("Flash", 2023);
        filmeTeste2.avalia(7);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeTeste2);
        listaDeFilmes.add(filmeTeste);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista " + listaDeFilmes.size());
        System.out.println(listaDeFilmes);
        System.out.println("toString do filme" + listaDeFilmes.get(0).toString());

    }
}
