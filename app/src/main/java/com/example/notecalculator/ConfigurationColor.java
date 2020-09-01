package com.example.notecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class ConfigurationColor extends AppCompatActivity {

    private Button selectBlue;
    private Button selectWhite;
    private Button selectBlack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuration_color);

        selectBlack = findViewById(R.id.selectBlack);
        selectBlue = findViewById(R.id.selectBlue);
        selectWhite = findViewById(R.id.selectWhite);

        selectWhite.setOnClickListener(
                (v) -> {

                }
        );

        selectBlue.setOnClickListener(
                (v) -> {

                }
        );

        selectBlack.setOnClickListener(
                (v) -> {

                }
        );
    }
}