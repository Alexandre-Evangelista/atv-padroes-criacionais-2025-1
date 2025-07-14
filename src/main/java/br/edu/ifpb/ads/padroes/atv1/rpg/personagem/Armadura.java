package br.edu.ifpb.ads.padroes.atv1.rpg.personagem;

public class Armadura implements Cloneable{

    private String nome;
    private int defesa;
    private String tipo;

    public Armadura(String nome, int defesa, String tipo) {
        this.nome = nome;
        this.defesa = defesa;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public int getDefesa() {
        return defesa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setNome(String nome) { this.nome = nome; }

    public void setDefesa(int defesa) { this.defesa = defesa; }

    @Override
    public String toString() {
        return String.format("%s (Defesa: %d, Tipo: %s)", nome, defesa, tipo);
    }

    @Override
    public Armadura clone() throws CloneNotSupportedException {
        return (Armadura) super.clone();
    }
}
