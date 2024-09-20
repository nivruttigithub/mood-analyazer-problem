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
        try {
            if (this.message == null) {
                throw new MoodAnalysisException("Invalid Mood: Mood message cannot be null");
            }
            if (this.message.toLowerCase().contains("sad")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        } catch (MoodAnalysisException e) {
            // Handle null mood scenario and return HAPPY
            return "HAPPY";
        }
    }

    // Method to analyze mood with a passed message
    public String analyseMood(String message) {
        try {
            if (message == null) {
                throw new MoodAnalysisException("Invalid Mood: Mood message cannot be null");
            }
            if (message.toLowerCase().contains("sad")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        } catch (MoodAnalysisException e) {
            // Handle null mood scenario and return HAPPY
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

        moodAnalyzer = new MoodAnalyzer(null);
        System.out.println("Mood: " + moodAnalyzer.analyseMood());
    }
}
