package com.codeclan.amymorrison.wordcounter;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

/**
 * Created by amymorrison on 22/01/2018.
 */

public class WordCountTest {


    WordCount wordCounter;
    HashMap<String, Integer> wordFrequency;

    @Before
    public void before(){
        wordCounter = new WordCount();
        wordFrequency = new HashMap<>();


    }

    @Test
    public void canCountWordFrequency(){
        String sampleText = "Why do people get especially passionate about pronunciation, using language that we might think more appropriate as a reaction to a terrorist attack than to an intruded “r” (as in “law(r) and order”)? One reason is that pronunciation isn’t like the other areas of speech which generate complaints, such as vocabulary and grammar. You may not like the way people use a particular word, such as disinterested, but you’re not going to meet that problem frequently. Similarly, if you don’t like split infinitives, you won’t hear one very often. But every word has to be pronounced, so if you don’t like the sound of an accent, or the way someone drops consonants, stresses words, or intones a sentence with a rising inflection, there’s no escape. Pronunciation is always there, in your ears.";
        wordCounter.buildWordCounter(sampleText);
        //assertEquals(wordFrequency, wordCounter.getWordFrequency());
        wordCounter.sortWordFrequency();
        System.out.println(wordCounter.getWordFrequency());
    }
}
