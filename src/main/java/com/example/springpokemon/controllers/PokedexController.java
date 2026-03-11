package com.example.springpokemon.controllers;

import com.example.springpokemon.models.Pokemon;
import com.example.springpokemon.services.PokedexService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class PokedexController {
    private PokedexService pokeService = new PokedexService();

    @GetMapping("/fire") 
    public ModelAndView getAllFire(){

        return null;
    }

    @GetMapping("/single")
    public ModelAndView getSingleById(@RequestParam int id){

        Pokemon p = pokeService.getPokemonID(id);

        ModelAndView mav = new ModelAndView("single");
        mav.addObject("pokemon", p);

        return mav;
    }

    @GetMapping("/all-by-primary")
    public ModelAndView getAllByPrimaryType(@RequestParam String type){

        List<Pokemon> pokemon = pokeService.getAllPrimary(type);

        ModelAndView mav = new ModelAndView("by-type");
        mav.addObject("pokemons", pokemon);
        mav.addObject("primaryType", type);

        return mav;
    }

    @GetMapping("/count")
    public ModelAndView getCountPerType(){
        return null;
    }
}