package com.example.springpokemon.repositories;

import com.example.springpokemon.models.Pokemon;
import com.example.springpokemon.utility.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PokedexRepository {
    private ConnectionManager conn = new ConnectionManager();


    public List<Pokemon> getALlFirePokemon() {
        List<Pokemon> allFirePokemon = new ArrayList<>();

        Connection database = conn.getConnection();
        try {

            PreparedStatement preparedStatement = database.prepareStatement("SELECT * FROM pokemon WHERE primary_type = ?");
            preparedStatement.setString(1, "Fire");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                Pokemon p = new Pokemon(
                        resultSet.getInt("pokedex_number"),
                        resultSet.getString("name"),
                        resultSet.getInt("speed"),
                        resultSet.getInt("special_defence"),
                        resultSet.getInt("special_attack"),
                        resultSet.getInt("defence"),
                        resultSet.getInt("attack"),
                        resultSet.getInt("hp"),
                        resultSet.getString("primary_type"),
                        resultSet.getString("secondary_type")
                );

                allFirePokemon.add(p);
            }

        }
        catch(Exception e){
            System.out.println("Could not prepare statement");
            e.printStackTrace();
        }

        return allFirePokemon;
    }

    public Pokemon getSinglePokemon(int id){

        Pokemon p = null;

        Connection database = conn.getConnection();
        try {

            PreparedStatement preparedStatement = database.prepareStatement("SELECT * FROM pokemon WHERE pokedex_number = ?");
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                p = new Pokemon(
                        resultSet.getInt("pokedex_number"),
                        resultSet.getString("name"),
                        resultSet.getInt("speed"),
                        resultSet.getInt("special_defence"),
                        resultSet.getInt("special_attack"),
                        resultSet.getInt("defence"),
                        resultSet.getInt("attack"),
                        resultSet.getInt("hp"),
                        resultSet.getString("primary_type"),
                        resultSet.getString("secondary_type")
                );

            }

        }
        catch(Exception e){
            System.out.println("Could not prepare statement");
            e.printStackTrace();
        }

        return p;
    }

    public List<Pokemon> getAllByPrimary(String type) {
        List<Pokemon> allPrimaryPokemon = new ArrayList<>();

        Connection database = conn.getConnection();
        try {

            PreparedStatement preparedStatement = database.prepareStatement("SELECT * FROM pokemon WHERE primary_type = ?");
            preparedStatement.setString(1, type);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                Pokemon p = new Pokemon(
                        resultSet.getInt("pokedex_number"),
                        resultSet.getString("name"),
                        resultSet.getInt("speed"),
                        resultSet.getInt("special_defence"),
                        resultSet.getInt("special_attack"),
                        resultSet.getInt("defence"),
                        resultSet.getInt("attack"),
                        resultSet.getInt("hp"),
                        resultSet.getString("primary_type"),
                        resultSet.getString("secondary_type")
                );

                allPrimaryPokemon.add(p);
            }

        }
        catch(Exception e){
            System.out.println("Could not prepare statement");
            e.printStackTrace();
        }

        return allPrimaryPokemon;
    }


}