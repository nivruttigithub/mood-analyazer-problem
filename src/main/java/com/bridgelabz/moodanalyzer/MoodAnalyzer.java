package com.bridgelabz.moodanalyzer;

public class MoodAnalyzer {
    public String analyseMood(String message) {

        if (message.contains("Sad")) {
            return "Sad";
        } else {
            return "Happy";
        }
    }

    public static void main(String[] args) {

        MoodAnalyzer moodAnalyser = new MoodAnalyzer();
        String message = "I am feeling so sad today!";
        String mood = moodAnalyser.analyseMood(message);

        System.out.println("Mood: " + mood);
    }
}
