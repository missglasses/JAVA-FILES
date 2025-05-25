package com.example.lepatantrdqexam;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView counter;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counter = (TextView) findViewById(R.id.counter);
    }

    public void increase (View view){
        count++;
        counter.setText(Integer.toString(count));
    }

    public void decrease (View view){
        count--;
        counter.setText(Integer.toString(count));
    }

}