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
    private SharedPreferences preferences;

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
                    if(name !=""){
                        Intent i = new Intent(this,CalculateInputs.class);
                        startActivity(i);
                    }

                }
        );

    }


}