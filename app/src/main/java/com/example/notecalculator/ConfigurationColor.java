package com.example.notecalculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import static android.graphics.Color.*;

public class ConfigurationColor extends AppCompatActivity {

    private Button selectBlue;
    private Button selectWhite;
    private Button selectBlack;
    private ConstraintLayout mConstraint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuration_color);

        selectBlack = findViewById(R.id.selectBlack);
        selectBlue = findViewById(R.id.selectBlue);
        selectWhite = findViewById(R.id.selectWhite);
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

        selectWhite.setOnClickListener(
                (v) -> {
                    Intent i = new Intent();
                    i.putExtra("color","white");
                    mConstraint.setBackgroundColor(WHITE);
                    setResult(RESULT_OK,i);
                    finish();

                }
        );

        selectBlue.setOnClickListener(
                (v) -> {
                    Intent i = new Intent();
                    i.putExtra("color","blue");
                    mConstraint.setBackgroundColor(BLUE);
                    setResult(RESULT_OK,i);
                    finish();

                }
        );

        selectBlack.setOnClickListener(
                (v) -> {
                    Intent i = new Intent();
                    i.putExtra("color","black");
                    mConstraint.setBackgroundColor(BLACK);
                    setResult(RESULT_OK,i);
                    finish();

                }
        );
    }
}