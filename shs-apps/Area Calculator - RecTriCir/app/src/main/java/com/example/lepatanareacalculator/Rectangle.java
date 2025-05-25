package com.example.lepatanareacalculator;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class Rectangle extends AppCompatActivity {
    TextView showans;
    EditText length;
    EditText width;
    Button rectbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showans = findViewById(R.id.showans);
        length = findViewById(R.id.editl1);
        width = findViewById(R.id.editw1);
       rectbtn = findViewById(R.id.rectbtn);

    }


    public void BTNClick(View view) {

     int l,w,area;

     l = Integer.parseInt(length.getText().toString());
     w = Integer.parseInt(width.getText().toString());

     area =l*w;

     showans.setText("The area is + area");

        }
    }
