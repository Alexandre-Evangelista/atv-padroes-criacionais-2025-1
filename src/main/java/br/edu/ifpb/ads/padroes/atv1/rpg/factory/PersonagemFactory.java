package br.edu.ifpb.ads.padroes.atv1.rpg.factory;

import br.edu.ifpb.ads.padroes.atv1.rpg.personagem.Personagem;

public abstract class PersonagemFactory {

    public Personagem montarPersonagem(String nome, String classe) {
        Personagem.Builder builder = criarPersonagemBase(nome, classe);
        EquipamentoFactory equipamentoFactory = selecionarEquipamentoFactory(classe);
        builder.comArma(equipamentoFactory.criarArma())
                .comArmadura(equipamentoFactory.criarArmadura());
        return builder.build();
    }

    protected abstract Personagem.Builder criarPersonagemBase(String nome, String classe);

    private EquipamentoFactory selecionarEquipamentoFactory(String classe) {
        switch (classe) {
            case "Guerreiro": return new GuerreiroEquipamentoFactory();
            case "Mago": return new MagoEquipamentoFactory();
            case "Arqueiro": return new ArqueiroEquipamentoFactory();
            default: throw new IllegalArgumentException("Classe desconhecida: " + classe);
        }
    }
}
