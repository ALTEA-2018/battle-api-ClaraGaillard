package com.miage.altea.tp.battle_api.battle.service.pokemonType;

import com.miage.altea.tp.battle_api.battle.bo.PokemonType;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public interface IPokemonTypeService {
    List<PokemonType> listPokemonsTypes();
    PokemonType getPokemonId(int id);
    void setPokemonTypeServiceUrl(String pokemonServiceUrl);
    PokemonType getPokemonType(int id);
    List<PokemonType> getVoidlistPokemons();
    void setRestTemplate(RestTemplate restTemplate);
}
