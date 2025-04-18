package com.pluralsight;
import java.util.*;
import java.util.regex.Pattern;

public class HighScoreWins {
    public static void main(String[] args) {
        // The input will be a single string that contains
        // both team names and the final score of the match
        // Example: Home:Visitor|21:9

        // Split by the pipe first - get team names, scores
        String input = "Home:Visitor|21:22";
        String[] tokens = input.split(Pattern.quote("|"));

        // Parse each variable by :
        // TEAM NAMES - array of strings
        String[] team_names = tokens[0].split(Pattern.quote(":"));
        String team_one = team_names[0];
        String team_two = team_names[1];

        // GAME SCORES - array of strings with ints
        String[] team_scores = tokens[1].split(Pattern.quote(":"));

        // Display team by matching index
        int score_one = Integer.parseInt((team_scores[0]));
        int score_two = Integer.parseInt((team_scores[1]));

        if (score_one > score_two) {
            System.out.println("The winner of the game is " + team_one + " with " + score_one + " points!");
        } else {
            System.out.println("The winner of the game is " + team_two + " with " + score_two + " points!");
        }
    }
}
