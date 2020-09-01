package com.example.notecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class ResultScreen extends AppCompatActivity {

    private Button restart;
    private TextView finalNote;
    private TextView placeName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_screen);

        restart = findViewById(R.id.restart);
        finalNote = findViewById(R.id.finalNote);
        placeName = findViewById(R.id.placeName);

        restart.setOnClickListener(
                (v)->{
                    finish();
                }
        );
    }
}