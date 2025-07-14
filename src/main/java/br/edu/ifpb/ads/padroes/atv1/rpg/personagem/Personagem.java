package br.edu.ifpb.ads.padroes.atv1.rpg.personagem;

import java.util.Arrays;

public class Personagem implements Cloneable {

    private String nome;
    private String raca;
    private String classe;
    private int forca;
    private int inteligencia;
    private int agilidade;
    private int vida;
    private int mana;
    private Arma arma;
    private Armadura armadura;
    private String[] habilidades;

    private Personagem(Builder builder) {
        this.nome = builder.nome;
        this.raca = builder.raca;
        this.classe = builder.classe;
        this.forca = builder.forca;
        this.inteligencia = builder.inteligencia;
        this.agilidade = builder.agilidade;
        this.vida = builder.vida;
        this.mana = builder.mana;
        this.arma = builder.arma;
        this.armadura = builder.armadura;
        this.habilidades = builder.habilidades;
    }

    public String getNome() { return nome; }
    public Arma getArma() { return arma; }
    public Armadura getArmadura() { return armadura; }
    public void setNome(String nome) { this.nome = nome; }
    public void setArma(Arma arma) { this.arma = arma; }
    public void setArmadura(Armadura armadura) { this.armadura = armadura; }
    public void setHabilidades(String[] habilidades) { this.habilidades = habilidades; }

    public static class Builder {
        private final String nome;
        private final String raca;
        private final String classe;
        private int forca, inteligencia, agilidade, vida, mana;
        private Arma arma;
        private Armadura armadura;
        private String[] habilidades;

        public Builder(String nome, String raca, String classe) {
            this.nome = nome;
            this.raca = raca;
            this.classe = classe;
        }

        public Builder comForca(int forca) { this.forca = forca; return this; }
        public Builder comInteligencia(int inteligencia) { this.inteligencia = inteligencia; return this; }
        public Builder comAgilidade(int agilidade) { this.agilidade = agilidade; return this; }
        public Builder comVida(int vida) { this.vida = vida; return this; }
        public Builder comMana(int mana) { this.mana = mana; return this; }
        public Builder comHabilidades(String[] habilidades) { this.habilidades = habilidades; return this; }
        public Builder comArma(Arma arma) { this.arma = arma; return this; }
        public Builder comArmadura(Armadura armadura) { this.armadura = armadura; return this; }
        public Personagem build() { return new Personagem(this); }
    }

    @Override
    public String toString() {
        return String.format(
                "--- PERSONAGEM ---\n" +
                        "Nome: %s\n" + "Raça/Classe: %s %s\n" + "Atributos: F:%d, I:%d, A:%d, V:%d, M:%d\n" +
                        "Arma: %s\n" + "Armadura: %s\n" + "Habilidades: %s\n" + "------------------\n",
                nome, raca, classe, forca, inteligencia, agilidade, vida, mana,
                arma, armadura, Arrays.toString(habilidades)
        );
    }

    @Override
    public Personagem clone() throws CloneNotSupportedException {
        Personagem personagemClonado = (Personagem) super.clone();
        personagemClonado.setArma(this.arma.clone());
        personagemClonado.setArmadura(this.armadura.clone());
        personagemClonado.setHabilidades(this.habilidades.clone());
        return personagemClonado;
    }
}
