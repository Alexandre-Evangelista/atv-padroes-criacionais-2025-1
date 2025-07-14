package br.edu.ifpb.ads.padroes.atv1.rpg.factory;

import br.edu.ifpb.ads.padroes.atv1.rpg.personagem.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.personagem.Armadura;

public class GuerreiroEquipamentoFactory implements EquipamentoFactory {
    @Override
    public Arma criarArma() {
        return new Arma("Espada de Ferro", 25, "Espada");
    }
    @Override
    public Armadura criarArmadura() {
        return new Armadura("Armadura de Placas", 20, "Pesada");
    }
}
