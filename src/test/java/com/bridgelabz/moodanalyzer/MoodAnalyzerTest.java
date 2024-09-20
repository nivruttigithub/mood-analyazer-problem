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
}
