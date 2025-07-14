package br.edu.ifpb.ads.padroes.atv1.rpg.factory;

import br.edu.ifpb.ads.padroes.atv1.rpg.personagem.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.personagem.Armadura;

public class MagoEquipamentoFactory implements EquipamentoFactory {
    @Override
    public Arma criarArma() {
        return new Arma("Cajado Mágico", 15, "Cajado");
    }
    @Override
    public Armadura criarArmadura() {
        return new Armadura("Vestes Mágicas", 8, "Leve");
    }
}
