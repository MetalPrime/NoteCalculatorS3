package com.example.notecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button goConfig;
    private Button goNotes;
    private EditText inputName;
    private String name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        goConfig = findViewById(R.id.goConfig);
        goNotes = findViewById(R.id.goNotes);
        inputName = findViewById(R.id.inputName);


        goNotes.setOnClickListener(
                (v) -> {
                    name = inputName.getText().toString();

                    SharedPreferences preferences = getSharedPreferences("taller3",MODE_PRIVATE);
                    preferences.edit().putString("username",name).apply();
                    if(name !=""){
                        Intent i = new Intent(this,CalculateInputs.class);
                        startActivity(i);
                    }

                }
        );

        goConfig.setOnClickListener(
                (v) -> {
                    Intent i = new Intent(this,ConfigurationColor.class);
                    startActivity(i);
                }
        );

    }


}