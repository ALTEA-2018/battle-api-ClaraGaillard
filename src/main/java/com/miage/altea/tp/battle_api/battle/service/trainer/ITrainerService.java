package com.miage.altea.tp.battle_api.battle.service.trainer;

import com.miage.altea.tp.battle_api.battle.bo.Trainer;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public interface ITrainerService {

    List<Trainer> listTrainers();
    Trainer getTrainer(String name);
    void setRestTemplate(RestTemplate restTemplate);
    void setTrainerServiceUrl(String trainerService);
}