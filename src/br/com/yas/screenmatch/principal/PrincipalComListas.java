package br.com.yas.screenmatch.principal;

import br.com.yas.screenmatch.modelos.Filme;
import br.com.yas.screenmatch.modelos.Serie;
import br.com.yas.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme filmeTeste = new Filme("Homem aranha", 2002);
        Filme outroFilme = new Filme("Avatar", 2023);
        Filme filmeTeste2 = new Filme("Flash", 2023);
        Serie lost = new Serie("Lost", 2000);

        List<Titulo> lista = new ArrayList<>();
        lista.add(filmeTeste2);
        lista.add(filmeTeste);
        lista.add(outroFilme);
        lista.add(lost);
        for (Titulo item : lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação" + filme.getClassificacao());
            }
        }

        List<String> buscaPorArtista = new LinkedList<>();
        buscaPorArtista.add("Matt");
        buscaPorArtista.add("Pedro");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);
        System.out.println("Lista de titulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(lista);

    }

}
