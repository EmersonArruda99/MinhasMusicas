package br.com.alura.minhasmusicas.modelos;

public class Audio {
    private String tipo;
    private int totalDeReproducoes;
    private int totalDeCurtidas;

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setTotalDeReproducoes(int totalDeReproducoes) {
        this.totalDeReproducoes = totalDeReproducoes;
    }

    public void setTotalDeCurtidas(int totalDeCurtidas) {
        this.totalDeCurtidas = totalDeCurtidas;
    }

    public String getTipo() {
        return tipo;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getTotalDeCurtidas() {
        return totalDeCurtidas;
    }
}
