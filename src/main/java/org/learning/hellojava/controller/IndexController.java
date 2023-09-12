package org.learning.hellojava.controller;

import org.learning.hellojava.model.Movies;
import org.learning.hellojava.model.Songs;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Controller
@RequestMapping("/")

public class IndexController {
    //METODI
    @GetMapping
    public String title(Model model) {
        Scanner scan = new Scanner(System.in);
        System.out.println("inser your name");
        String myName = scan.nextLine();
        model.addAttribute("myname", myName);
        return "homepage";
    }

//metodo che restituisce lista di oggetti movies

    private List<Movies> getBestMovies() {
        List<Movies> movies = new ArrayList<>();
        return movies;
    }


    private List<Songs> getBestSongs() {
        List<Songs> songs = new ArrayList<>();
        return songs;
    }


    @GetMapping("/movies")
    public String bestMovies(Model model) {
        Scanner scan = new Scanner(System.in);
        System.out.println("inser a movies");
        String myMovie = scan.nextLine();
        model.addAttribute("best", myMovie);
        return getBestMovies().toString();
    }



    @GetMapping("/songs")
    public String bestSongs (Model model) {
        Scanner scan = new Scanner(System.in);
        System.out.println("inser a songs");
        String mySong = scan.nextLine();
        model.addAttribute("best", mySong);
        return getBestSongs().toString();
    }

}
