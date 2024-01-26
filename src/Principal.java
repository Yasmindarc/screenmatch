import br.com.yas.screenmatch.calculos.CalculadoraDeTempo;
import br.com.yas.screenmatch.calculos.FiltroRecomendacao;
import br.com.yas.screenmatch.modelos.Episodio;
import br.com.yas.screenmatch.modelos.Filme;
import br.com.yas.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme filmeTeste = new Filme();
        filmeTeste.setNome("Homem aranha");
        filmeTeste.setAnoDeLancamento(2002);
        filmeTeste.setDuracaoEmMinutos(120);
        System.out.println("Duração do filme" + filmeTeste.getDuracaoEmMinutos());

        filmeTeste.exibeFichaTecnica();
        filmeTeste.avalia(8);
        filmeTeste.avalia(5);
        filmeTeste.avalia(7);
        System.out.println("Total de avaliações: " + filmeTeste.getTotalDeAvaliacoes());
        System.out.println(filmeTeste.pegaMedia());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2023);
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

    }
}
