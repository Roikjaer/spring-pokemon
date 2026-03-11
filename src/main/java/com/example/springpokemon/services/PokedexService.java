package com.example.springpokemon.services;

import com.example.springpokemon.models.Pokemon;
import com.example.springpokemon.repositories.PokedexRepository;

import java.util.List;

public class PokedexService {
    private PokedexRepository repo = new PokedexRepository();

    public Pokemon getPokemonID(int id){
       return repo.getSinglePokemon(id);
    }

    public List<Pokemon> getAllPrimary(String type){
        return repo.getAllByPrimary(type);
    }
}
