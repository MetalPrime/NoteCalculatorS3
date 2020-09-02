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
    private double p1,p2,pp1,pp2,q,ej;
    private String passResult;
    private Calculate calculos;

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
                    p1 = Double.parseDouble(parcial1.getText().toString());
                    p2 = Double.parseDouble(parcial2.getText().toString());
                    pp1 = Double.parseDouble(pParcial1.getText().toString());
                    pp2 = Double.parseDouble(pParcial2.getText().toString());
                    q = Double.parseDouble(quices.getText().toString());
                    ej = Double.parseDouble(ejSemanales.getText().toString());
                    calculos = new Calculate(p1,p2,pp1,pp2,q,ej);

                    passResult = calculos.getResult() + "";

                    Intent i = new Intent(this,ResultScreen.class);
                    i.putExtra("result",passResult);
                    startActivity(i);
                    finish();


                }
        );
    }



}