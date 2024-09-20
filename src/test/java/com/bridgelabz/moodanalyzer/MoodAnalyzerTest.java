package com.bridgelabz.moodanalyzer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoodAnalyzerTest {
    //TC1.1 : Given “I am in Sad Mood” message Should Return SAD
    @Test
    public void givenSadMoodMessage_ShouldReturnSadMood(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String message = "I am in Sad Mood";
        String mood = moodAnalyzer.analyseMood(message);
        assertEquals("SAD", mood);
    }

    // TC1.2: Given :  "I am in Any Mood" message should return HAPPY
    @Test
    public void givenAnyMoodMessage_ShouldReturnHappyMood() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String message = "I am in Any Mood";
        String mood = moodAnalyzer.analyseMood(message);
        assertEquals("HAPPY", mood);
    }
    // Repeat : TC1.1 : Given “I am in Sad Mood” message in Constructor Should Return SAD
    @Test
    public void givenSadMoodMessageInConstructor_ShouldReturnSadMood() {

        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Sad Mood");

        String mood = moodAnalyzer.analyseMood();

        assertEquals("SAD", mood);
    }
    @Test
    public void givenHappyMoodMessageInConstructor_ShouldReturnHappyMood() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Happy Mood");
        String mood = moodAnalyzer.analyseMood();
        assertEquals("HAPPY", mood);
    }
}
