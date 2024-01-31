package br.com.yas.screenmatch.principal;

import br.com.yas.screenmatch.modelos.Filme;
import br.com.yas.screenmatch.modelos.Serie;
import br.com.yas.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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
        for (Titulo item: lista) {
            System.out.println(item.getNome());
        }

        Collections.sort(lista);
        System.out.println(lista);

        //Ordenando com o Comparator
        lista.sort(Comparator.comparing(Titulo:: getAnoDeLancamento));
        System.out.println(lista);
    }

}
