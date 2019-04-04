package com.miage.altea.tp.battle_api.battle.service.battle;

public interface IStatsCalculator {
    int calculateHp(int base, int level);
    int calculateState(int base, int level);
}
