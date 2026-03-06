package com.example.springpokemon.controllers;

import com.example.springpokemon.models.Pokemon;
import com.example.springpokemon.services.PokedexService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class PokedexController {
    private PokedexService pokeService = new PokedexService();

    @GetMapping("/fire")
    public ModelAndView getAllFire(){
        //Todo
        return null;
    }

    @GetMapping("/single")
    public ModelAndView getSingleById(){
        return null;
    }

    @GetMapping("/all-by-primary")
    public ModelAndView getAllByPrimaryType(){
        //Note: Remember to also send a primary type String to the model and view
        return null;
    }

    @GetMapping("/count")
    public ModelAndView getCountPerType(){
        return null;
    }
}