package com.example.lepatanareacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Rectangle2 extends AppCompatActivity {

    Button rb;
    EditText length;
    EditText width;
    TextView is;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangle2);

        is = findViewById(R.id.is);
        length = findViewById(R.id.l);
        width = findViewById(R.id.w);
        rb = findViewById(R.id.rectbtn);

    }

    public void BTNClick (View v){
        int l,w,area;

        l =Integer.parseInt(length.getText().toString());
        w =Integer.parseInt(width.getText().toString());

        area =l*w;

        is.setText("Area: " +area);

    }
}