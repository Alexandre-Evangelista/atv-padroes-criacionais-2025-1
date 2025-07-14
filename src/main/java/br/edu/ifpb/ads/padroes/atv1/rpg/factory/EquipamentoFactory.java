package br.edu.ifpb.ads.padroes.atv1.rpg.factory;

import br.edu.ifpb.ads.padroes.atv1.rpg.personagem.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.personagem.Armadura;

public interface EquipamentoFactory {
    Arma criarArma();
    Armadura criarArmadura();
}
