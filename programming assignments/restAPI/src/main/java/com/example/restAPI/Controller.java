/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.restAPI;

import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class Controller {
    
    // video games 
    // video game: title, year, category
    @RequestMapping("/videogames")
    public List<VideoGame> retrieveVideoGames() {
        return Arrays.asList(
                new VideoGame("Night in the Woods", 2017, "Mystery"),
                new VideoGame("Zelda Tears of the Kingdom", 2023, "Adventure"),
                new VideoGame("Unpacking", 2021, "Puzzle"),
                new VideoGame("Wandersong", 2018, "Adventure"),
                new VideoGame("Stardew Valley", 2016, "Life Simulation"),
                new VideoGame("Kentucky Route Zero", 2013, "Adventure"),
                new VideoGame("Animal Crossing New Horizons", 2020, "Social Simulation"),
                new VideoGame("The Last Campfire", 2020, "Puzzle"),
                new VideoGame("Beacon Pines", 2022, "Mystery"),
                new VideoGame("Toem", 2021, "Adventure")
        );
    
    }
    
    
    
}
