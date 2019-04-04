package com.miage.altea.tp.battle_api.battle.service.battle;

import com.miage.altea.tp.battle_api.battle.bo.Battle;
import com.miage.altea.tp.battle_api.battle.config.AttackException;

import java.util.List;
import java.util.UUID;

public interface IBattleService {

    Battle createBattle(String train, String oppo);
    List<Battle> getBattles();
    Battle getBattle(UUID uuid) ;
    Battle attackBattle(UUID uuid, String attackers) throws AttackException;
}