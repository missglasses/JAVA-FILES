package com.example.lepatanfrthqexam;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.View;


public class Proceed extends AppCompatActivity {

    private TextView r1;
    private EditText balance;
    private EditText expenses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proceed);

        r1 = findViewById(R.id.res);
        balance = findViewById(R.id.bal);
        expenses = findViewById(R.id.exp);


    }
    public void chk (View view){
        int b = Integer.parseInt(balance.getText().toString());
        int e = Integer.parseInt(expenses.getText().toString());
        int diff = b - e;

        if (diff>0) {
            r1.setText("Your remaining balance: "+diff);
        } else{
            r1.setText("Spend your money wisely!");
        }
    }

}