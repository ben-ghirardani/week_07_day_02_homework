package com.example.user.wordcounter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 08/08/2017.
 */

public class WordCounterTest {

    WordCounter wordCounter;

    @Before
    public void before() {
        wordCounter = new WordCounter("there are some words here");
    }

    @Test
    public void areThereWords() {
        assertEquals("there are some words here", wordCounter.checkForWords());
    }

    @Test
    public void testCanConvertToArray(){
        String[] result = {"there", "are", "some", "words", "here"};
        assertArrayEquals( result, wordCounter.splitStringIntoWordsInAnArray());
    }

    @Test
    public void testCanCountArray() {
        String[] result = {"there", "are", "some", "words", "here"};
        assertEquals(5, wordCounter.splitWordsIntoAnArrayAndCountThem());
    }
}
