package com.bridgelabz.moodanalyzer;

public class MoodAnalyzer {

    private String message;

    public MoodAnalyzer() {
        this.message = "";
    }

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyseMood(String message) {

        if (message.toLowerCase().contains("sad")) {
            return "SAD";
        } else {
            return "HAPPY";
        }
    }

    public String analyseMood() throws MoodAnalysisException {
        if (this.message == null) {
            throw new MoodAnalysisException("Invalid Mood: Mood message cannot be null");
        }
        if (this.message.toLowerCase().contains("sad")) {
            return "SAD";
        } else {
            return "HAPPY";
        }
    }

    public static void main(String[] args) {
        try {
            MoodAnalyzer moodAnalyser = new MoodAnalyzer();
            String message = "I am in any Mood!";
            String mood = moodAnalyser.analyseMood(message);
            System.out.println("Mood: " + mood);

            MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Happy Mood");
            System.out.println("Mood: " + moodAnalyzer.analyseMood());

            // Example with null message (should throw exception)
            MoodAnalyzer moodAnalyzerWithNull = new MoodAnalyzer(null);
            System.out.println("Mood: " + moodAnalyzerWithNull.analyseMood());

        } catch (MoodAnalysisException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
