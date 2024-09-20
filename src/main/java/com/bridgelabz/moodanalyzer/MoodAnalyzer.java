package com.bridgelabz.moodanalyzer;

public class MoodAnalyzer {

    private String message;

    public MoodAnalyzer() {
        this.message = "";
    }

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyseMood() {
        if (this.message.toLowerCase().contains("sad")) {
            return "SAD";
        } else {
            return "HAPPY";
        }
    }

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

        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Happy Mood");
        System.out.println("Mood: " + moodAnalyzer.analyseMood());

    }
}
