package com.codeclan.amymorrison.wordcounter;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by amymorrison on 22/01/2018.
 */

public class WordCount {

    HashMap<String, Integer> wordCount;

    public WordCount(){
        wordCount = new HashMap<>();
    }

    public void buildWordCounter(String paragraph){
        String[] words = paragraph.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
      for (int i = 0; i < words.length; i++) {
          Integer count = this.wordCount.get(words[i]);
          if (count == null) {
            this.wordCount.put(words[i], 1);
          } else {
              this.wordCount.put(words[i], count+1);
          }
      }
    }

    public HashMap<String,Integer> getWordFrequency() {
        return this.wordCount;
    }

    public Map<String, Integer> sortWordFrequency() {
        //doesnt work
        Map<String, Integer> wordCounter = getWordFrequency();
        MyComparator comparator = new MyComparator(wordCounter);
        Map<String, Integer> newMap = new TreeMap<String, Integer>(comparator);
        newMap.putAll(wordCounter);
        return newMap;
    }
}

class MyComparator implements Comparator<Object> {

    Map<String, Integer> map;

    public MyComparator(Map<String, Integer> map) {
        this.map = map;
    }

    public int compare(Object o1, Object o2) {

        if (map.get(o2) == map.get(o1))
            return 1;
        else
            return ((Integer) map.get(o2)).compareTo((Integer)
                    map.get(o1));

    }
}
