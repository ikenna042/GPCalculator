package com.example.android.gpcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        //Find the view that shows the calculator
        TextView main = (TextView) findViewById(R.id.back);

        //Set a click listener on that view
        main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create an intent to open the calculator activity
                Intent mainIntent = new Intent(CalculatorActivity.this, MainActivity.class);

                //Start the new activity
                startActivity(mainIntent);
            }
        });
    }
}
