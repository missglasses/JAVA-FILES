package com.example.lepatanareacalculator;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rect = findViewById(R.id.rect);
        Button tria = findViewById(R.id.tria);
        Button circ = findViewById(R.id.circ);



        circ.setOnClickListener(view -> {
            Intent i = new Intent(MainActivity.this, Circle.class);
            startActivity(i);
        });

        rect.setOnClickListener(view -> {
            Intent i = new Intent(MainActivity.this, Rectangle2.class);
            startActivity(i);
        });

        tria.setOnClickListener(view -> {
            Intent i = new Intent(MainActivity.this, Triangle.class);
            startActivity(i);
        });

    }
}