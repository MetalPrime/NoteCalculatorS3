package com.example.notecalculator;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.graphics.Color.BLACK;
import static android.graphics.Color.BLUE;
import static android.graphics.Color.WHITE;

public class ResultScreen extends AppCompatActivity {

    private Button restart;
    private TextView finalNote;
    private TextView placeName;
    private String name;
    private String note;
    private ConstraintLayout mConstraint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_screen);

        restart = findViewById(R.id.restart);
        finalNote = findViewById(R.id.finalNote);
        placeName = findViewById(R.id.placeName);
        mConstraint = findViewById(R.id.mConstraint);

        String color = getSharedPreferences("taller3",MODE_PRIVATE).getString("color","no_color");
        if(color.equals("black")){
            mConstraint.setBackgroundColor(BLACK);
        }
        if(color.equals("white")){
            mConstraint.setBackgroundColor(WHITE);
        }
        if(color.equals("blue")){
            mConstraint.setBackgroundColor(BLUE);
        }

        note = getIntent().getExtras().getString("result");

        finalNote.setText(note);

        name = getSharedPreferences("taller3",MODE_PRIVATE).getString("username","NO_USER");

        placeName.setText(name);

        restart.setOnClickListener(
                (v)->{
                    finish();
                }
        );
    }
}