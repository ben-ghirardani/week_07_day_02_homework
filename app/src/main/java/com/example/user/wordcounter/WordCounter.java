package com.example.user.wordcounter;

import java.lang.reflect.Array;
import java.util.*;


/**
 * Created by user on 08/08/2017.
 */

class WordCounter {

    private String words;

    public WordCounter(String words) {
        this.words = words;
    }

    public String checkForWords() {
        return this.words;
    }

    public String[] splitStringIntoWordsInAnArray() {
        String[] wordArray = this.words.split(" ");
        return wordArray;
    }

//    does the method below work? I'm trying to say for every element in the array (named "word")
//    add +1 to the count. Seems to pass the test but I wanted to be sure.

    public int splitWordsIntoAnArrayAndCountThem() {
        String[] wordArray = this.words.split(" ");
        int count = 0;
        for(String word : wordArray) {
                count++;
            }
        return count;
    }





}
