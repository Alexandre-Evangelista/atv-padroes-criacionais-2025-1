package br.edu.ifpb.ads.padroes.atv1.rpg.factory;

import br.edu.ifpb.ads.padroes.atv1.rpg.personagem.Personagem;

public class HumanoFactory extends PersonagemFactory {
    @Override
    protected Personagem.Builder criarPersonagemBase(String nome, String classe) {
        Personagem.Builder builder = new Personagem.Builder(nome, "Humano", classe);
        switch (classe) {
            case "Guerreiro":
                builder.comForca(15).comInteligencia(8).comAgilidade(10).comVida(120).comMana(30)
                        .comHabilidades(new String[]{"Investida", "Bloqueio"});
                break;
            case "Mago":
                builder.comForca(6).comInteligencia(18).comAgilidade(8).comVida(80).comMana(150)
                        .comHabilidades(new String[]{"Bola de Fogo", "Cura"});
                break;
            case "Arqueiro":
                builder.comForca(10).comInteligencia(12).comAgilidade(16).comVida(100).comMana(70)
                        .comHabilidades(new String[]{"Tiro Certeiro", "Chuva de Flechas"});
                break;
            default: throw new IllegalArgumentException("Classe inválida para Humano: " + classe);
        }
        return builder;
    }
}
