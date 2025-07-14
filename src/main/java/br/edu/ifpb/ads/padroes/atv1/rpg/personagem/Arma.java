package br.edu.ifpb.ads.padroes.atv1.rpg.personagem;

public class Arma implements Cloneable {

    private String nome;
    private int dano;
    private String tipo;

    public Arma(String nome, int dano, String tipo) {
        this.nome = nome;
        this.dano = dano;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public int getDano() {
        return dano;
    }

    public String getTipo() {
        return tipo;
    }

    public void setNome(String nome) { this.nome = nome; }

    public void setDano(int dano) { this.dano = dano; }

    @Override
    public String toString() {
        return String.format("%s (Dano: %d, Tipo: %s)", nome, dano, tipo);
    }
    @Override
    public Arma clone() throws CloneNotSupportedException {
        return (Arma) super.clone();
    }
}
