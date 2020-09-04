package com.example.notecalculator;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;

import static android.graphics.Color.*;

public class ConfigurationColor extends AppCompatActivity {

    private Button selectBlue;
    private Button selectWhite;
    private Button selectBlack;
    private ConstraintLayout mConstraint;
    private String color="blanco";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuration_color);
        color = getIntent().getExtras().getString("background");
        selectBlack = findViewById(R.id.selectBlack);
        selectBlue = findViewById(R.id.selectBlue);
        selectWhite = findViewById(R.id.selectWhite);
        mConstraint = findViewById(R.id.mConstraint);



        selectWhite.setOnClickListener(
                (v) -> {

                    Intent i = new Intent();
                    i.putExtra("color","white");
                    setResult(RESULT_OK,i);
                    finish();
                    color = "blanco";
                    mConstraint.setBackgroundColor(WHITE);
                    color=getIntent().getExtras().getString("background");


                }
        );

        selectBlue.setOnClickListener(
                (v) -> {
                    Intent i = new Intent();
                    i.putExtra("color","blue");
                    setResult(RESULT_OK,i);
                    finish();
                    color = "azul";
                    mConstraint.setBackgroundColor(BLUE);
                    color=getIntent().getExtras().getString("background");

                }
        );

        selectBlack.setOnClickListener(
                (v) -> {
                    Intent i = new Intent();
                    i.putExtra("color","black");
                    setResult(RESULT_OK,i);
                    finish();
                    color = "negro";
                    mConstraint.setBackgroundColor(BLACK);
                    color=getIntent().getExtras().getString("background");

                }
        );

        changeColor();
    }
    public void changeColor(){
        if(color.equals("white")) mConstraint.setBackgroundColor(Color.WHITE);
        if(color.equals("blue")) mConstraint.setBackgroundColor(Color.BLUE);
        if(color.equals("black")) mConstraint.setBackgroundColor(Color.BLACK);
    }

}