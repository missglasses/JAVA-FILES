package com.example.lepatanareacalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Circle extends AppCompatActivity {

    private TextView is;
    private EditText radius;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle);


        Button cb = findViewById(R.id.cb);
        is = findViewById(R.id.is);
        radius = findViewById(R.id.r);



        cb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ra = radius.getText().toString();
                double r = Double.parseDouble(ra);
                double area = 3.14*r*r;
                is.setText("Area: " + area);

            }
        });

    }
}
