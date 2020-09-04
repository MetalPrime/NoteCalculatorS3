package com.example.notecalculator;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.graphics.Color.BLACK;
import static android.graphics.Color.BLUE;
import static android.graphics.Color.WHITE;

public class MainActivity extends AppCompatActivity {

    private Button goConfig;
    private Button goNotes;
    private EditText inputName;
    private String name;
    private ConstraintLayout mConstraint;
    SharedPreferences preferences;
    private String backgroundColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        goConfig = findViewById(R.id.goConfig);
        goNotes = findViewById(R.id.goNotes);
        inputName = findViewById(R.id.inputName);
        mConstraint = findViewById(R.id.mConstraint);


        //preferences.edit().putString("no_color",backgroundColor).apply();

        goNotes.setOnClickListener(
                (v) -> {
                    name = inputName.getText().toString();

                    preferences = getSharedPreferences("taller3",MODE_PRIVATE);
                    preferences.edit().putString("username",name).apply();

                    if(name !=""){
                        Intent i = new Intent(this,CalculateInputs.class);
                        startActivityForResult(i,9);
                    }

                }
        );

        goConfig.setOnClickListener(
                (v) -> {
                    Intent a = new Intent(this,ConfigurationColor.class);
                    a.putExtra("background",backgroundColor);
                    startActivityForResult(a,11);
                }
        );


    }

    //  Ctrl + O


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);



        if(requestCode == 11 && resultCode == RESULT_OK){
            backgroundColor = data.getExtras().getString("color");

            Toast.makeText(this, backgroundColor, Toast.LENGTH_LONG).show();


            if(backgroundColor.equals("black")){
                mConstraint.setBackgroundColor(BLACK);
            }
            if(backgroundColor.equals("white")){
                mConstraint.setBackgroundColor(WHITE);
            }
            if(backgroundColor.equals("blue")){
                mConstraint.setBackgroundColor(BLUE);
            }
        } else {
            Log.e("back", "No está entrando");
            Toast.makeText(this, "nigga", Toast.LENGTH_LONG).show();
        }

    }
}