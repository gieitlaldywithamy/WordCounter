package com.codeclan.amymorrison.wordcounter;

import java.util.HashMap;

/**
 * Created by amymorrison on 22/01/2018.
 */

public class WordCount {

    HashMap<String, Integer> wordCount;

    public WordCount(){
        wordCount = new HashMap<>();
    }

    public void buildWordCounter(){
        wordCount();
    }
}
