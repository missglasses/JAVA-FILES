package com.example.lepatanareacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Triangle extends AppCompatActivity {

    Button tb;
    EditText base;
    EditText height;
    TextView is;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangle);

        is = findViewById(R.id.is);
        base = findViewById(R.id.b);
        height = findViewById(R.id.h);
        tb = findViewById(R.id.tribtn);

        tb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate();
            }
        });

    }
    public void calculate(){
        Double dBase =Double.parseDouble(base.getText().toString());
        Double dHeight =Double.parseDouble(height.getText().toString());
        Double  calculateValue = dBase*dHeight/2;
        is.setText(calculateValue.toString());

    }
}