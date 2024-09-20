package com.bridgelabz.moodanalyzer;

public class MoodAnalyzer {
    public String analyseMood(String message) {

        if (message.toLowerCase().contains("sad")) {
            return "SAD";
        } else {
            return "Happy";
        }
    }

    public static void main(String[] args) {

        MoodAnalyzer moodAnalyser = new MoodAnalyzer();
        String message = "I am in Sad Mood!";
        String mood = moodAnalyser.analyseMood(message);

        System.out.println("Mood: " + mood);
    }
}
