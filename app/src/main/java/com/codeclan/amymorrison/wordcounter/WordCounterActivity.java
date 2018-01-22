package com.codeclan.amymorrison.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Set;

public class WordCounterActivity extends AppCompatActivity {

    EditText userText;
    Button wordFrequencyBtn;
    TextView wordFrequencyView;
    WordCount wordCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_counter);
        userText = findViewById(R.id.userTextInput);
        wordFrequencyBtn = findViewById(R.id.wordFrequencyBtn);
        wordFrequencyView = findViewById(R.id.wordFrequencyAnalysis);
        wordCounter = new WordCount();

    }


    public void getWordFrequency(View view) {
        String userInput = userText.getText().toString();
        wordCounter.buildWordCounter(userInput);
        HashMap<String, Integer> wordFrequency = wordCounter.getWordFrequency();
        Set<String> keys = wordFrequency.keySet();
        for (String word: keys) {
            wordFrequencyView.append(word + ": " + wordFrequency.get(word) + " ");
        }


    }
}
