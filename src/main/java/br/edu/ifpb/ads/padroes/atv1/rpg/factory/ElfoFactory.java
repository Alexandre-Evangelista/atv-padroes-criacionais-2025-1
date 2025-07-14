package br.edu.ifpb.ads.padroes.atv1.rpg.factory;

import br.edu.ifpb.ads.padroes.atv1.rpg.personagem.Personagem;

public class ElfoFactory extends PersonagemFactory {
    @Override
    protected Personagem.Builder criarPersonagemBase(String nome, String classe) {
        Personagem.Builder builder = new Personagem.Builder(nome, "Elfo", classe);
        switch (classe) {
            case "Guerreiro":
                builder.comForca(12).comInteligencia(14).comAgilidade(16).comVida(100).comMana(60)
                        .comHabilidades(new String[]{"Dança das Lâminas", "Agilidade Élfica"});
                break;
            case "Mago":
                builder.comForca(4).comInteligencia(20).comAgilidade(14).comVida(70).comMana(180)
                        .comHabilidades(new String[]{"Magia da Natureza", "Teleporte"});
                break;
            case "Arqueiro":
                builder.comForca(8).comInteligencia(16).comAgilidade(20).comVida(90).comMana(100)
                        .comHabilidades(new String[]{"Tiro Múltiplo", "Camuflagem"});
                break;
            default: throw new IllegalArgumentException("Classe inválida para Elfo: " + classe);
        }
        return builder;
    }
}
