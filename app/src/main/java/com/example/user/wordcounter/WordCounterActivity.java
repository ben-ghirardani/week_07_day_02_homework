package com.example.user.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WordCounterActivity extends AppCompatActivity {

    EditText writeHereEditText;
    TextView answerText;
    Button pressButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_counter);
    }



}
