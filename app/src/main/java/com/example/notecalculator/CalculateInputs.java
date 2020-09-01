package com.example.notecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CalculateInputs extends AppCompatActivity {

    private EditText pParcial1;
    private EditText pParcial2;
    private EditText quices;
    private EditText parcial1;
    private EditText parcial2;
    private EditText ejSemanales;
    private Button putNotes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate_inputs);

        pParcial1 = findViewById(R.id.pParcial1);
        pParcial2 = findViewById(R.id.pParcial2);
        quices = findViewById(R.id.quices);
        parcial1 = findViewById(R.id.parcial1);
        parcial2 = findViewById(R.id.parcial2);
        ejSemanales = findViewById(R.id.ejSemanales);
        putNotes = findViewById(R.id.putNotes);


        putNotes.setOnClickListener(
                (v) ->{
                    Intent i = new Intent(this,ResultScreen.class);
                    startActivity(i);
                    finish();
                }
        );
    }



}