package com.bridgelabz.moodanalyzer;

public class MoodAnalyzer {
    public String analyseMood(String message) {

        if (message.toLowerCase().contains("sad")) {
            return "SAD";
        } else {
            return "HAPPY";
        }
    }

    public static void main(String[] args) {

        MoodAnalyzer moodAnalyser = new MoodAnalyzer();
        String message = "I am in any Mood!";
        String mood = moodAnalyser.analyseMood(message);

        System.out.println("Mood: " + mood);
    }
}
