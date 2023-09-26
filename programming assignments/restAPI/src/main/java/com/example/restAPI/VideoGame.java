/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.restAPI;

class VideoGame {
    
    // attributes of video game
    private String title;
    private int year;
    private String category;

    // default constructor 
    public VideoGame() {
        this.title = "";
        this.year = 0;
        this.category = "";
    }

    // constructor with parameters 
    public VideoGame(String title, int year, String category) {
        this.title = title;
        this.year = year;
        this.category = category;
    }
    
    // getters
    public String getTitle() {
        return title;
    }
    
    public int getYear() {
        return year;
    }
    
    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "VideoGame{" +
        "title: " + title
        + " year: " + year
        + " category: " + category
        +"}";

    }

}
    

