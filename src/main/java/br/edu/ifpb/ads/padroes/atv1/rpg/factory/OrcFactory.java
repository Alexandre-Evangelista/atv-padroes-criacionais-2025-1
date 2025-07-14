package br.edu.ifpb.ads.padroes.atv1.rpg.factory;

import br.edu.ifpb.ads.padroes.atv1.rpg.personagem.Personagem;

public class OrcFactory extends PersonagemFactory {
    @Override
    protected Personagem.Builder criarPersonagemBase(String nome, String classe) {
        Personagem.Builder builder = new Personagem.Builder(nome, "Orc", classe);
        switch (classe) {
            case "Guerreiro":
                builder.comForca(20).comInteligencia(6).comAgilidade(8).comVida(150).comMana(20)
                        .comHabilidades(new String[]{"Fúria", "Pancada Devastadora"});
                break;
            case "Mago":
                builder.comForca(10).comInteligencia(14).comAgilidade(6).comVida(100).comMana(120)
                        .comHabilidades(new String[]{"Magia Sombria", "Invocação"});
                break;
            case "Arqueiro":
                builder.comForca(14).comInteligencia(8).comAgilidade(12).comVida(120).comMana(40)
                        .comHabilidades(new String[]{"Tiro Brutal", "Intimidação"});
                break;
            default: throw new IllegalArgumentException("Classe inválida para Orc: " + classe);
        }
        return builder;
    }
}
