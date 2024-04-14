package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;
import br.com.alura.minhasmusicas.modelos.Ranking;

public class Principal {
    public static void main(String[] args) {
        Musica musica = new Musica();
        Podcast podcast = new Podcast();
        Ranking ranking = new Ranking();

        musica.setTipo("musica");
        musica.setAlbum("Top Brasil");
        musica.setArtista("Matuê");
        musica.setGenero("Trap");
        musica.setTotalDeCurtidas(4021);
        musica.setTotalDeReproducoes(7800);
        ranking.ranking(musica);

        podcast.setTipo("podcast");
        podcast.setNome("Flow");
        podcast.setApresentador("Igor");
        podcast.setDescricao("Neste episodio falaremos sobre a falta de oportunidade no mercado de trabalho.");
        podcast.setTotalDeCurtidas(49);
        podcast.setTotalDeReproducoes(110);
        ranking.ranking(podcast);
    }

}
