package com.kodilla.good.patterns.challanges;

import java.util.*;
import java.util.stream.Collectors;

public class MainMoves {
    public static void main(String[] args) {


        MovieStore movieStore = new MovieStore();
        Map<String, List<String>> movieMap = movieStore.getMovies();


        final String showMovies = movieMap.values()
                .stream()
                .flatMap(Collection::stream)
                .collect((Collectors.joining(" ! ")));

        System.out.println(showMovies);
    }
}