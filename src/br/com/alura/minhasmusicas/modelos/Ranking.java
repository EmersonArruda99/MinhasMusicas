package br.com.alura.minhasmusicas.modelos;

public class Ranking {
    public void ranking(Audio audio) {
        switch (audio.getTipo()){
            case "musica":
                if (audio.getTotalDeReproducoes() >= 1000 && audio.getTotalDeCurtidas() >= 500){
                    System.out.println("Essa musica está entre a 10 mais ouvidas do momento.");
                } else {
                    System.out.println("Essa musica ainda não está rankiada.");
                }
                break;
            case "podcast":
                if (audio.getTotalDeReproducoes() >= 100 && audio.getTotalDeCurtidas() >= 50){
                    System.out.println("Esse podcast está entre a 10 mais ouvidas do momento.");
                } else {
                    System.out.println("Esse podcast ainda não está rankiada.");
                }
                break;
            default:
                System.out.println("tipo não encontrado!");
        }
    }
}
