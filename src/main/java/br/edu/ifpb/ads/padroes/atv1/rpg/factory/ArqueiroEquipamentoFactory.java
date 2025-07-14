package br.edu.ifpb.ads.padroes.atv1.rpg.factory;

import br.edu.ifpb.ads.padroes.atv1.rpg.personagem.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.personagem.Armadura;

public class ArqueiroEquipamentoFactory implements EquipamentoFactory {
    @Override
    public Arma criarArma() {
        return new Arma("Arco Élfico", 20, "Arco");
    }
    @Override
    public Armadura criarArmadura() {
        return new Armadura("Armadura de Couro", 12, "Média");
    }
}
