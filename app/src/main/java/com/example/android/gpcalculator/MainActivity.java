package com.example.android.gpcalculator;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find the view that shows the calculator
        TextView calculator = (TextView) findViewById(R.id.enter);

        //Set a click listener on that view
        calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create an intent to open the calculator activity
                Intent calculatorIntent = new Intent(MainActivity.this, CalculatorActivity.class);

                //Start the new activity
                startActivity(calculatorIntent);
            }
        });


    }
}
