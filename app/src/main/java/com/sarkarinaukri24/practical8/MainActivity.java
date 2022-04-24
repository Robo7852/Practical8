package com.sarkarinaukri24.practical8;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{


    Button Red;
    Button Blue;
    Button Green;
    ConstraintLayout constraintLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Red = (Button) findViewById(R.id.Red);
        Blue = (Button) findViewById(R.id.Blue);
        Green = (Button) findViewById(R.id.Green);

        constraintLayout = findViewById(R.id.layout1);



        Red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // set the color to relative layout
                constraintLayout.setBackgroundColor(getResources().getColor(R.color.color1));

            }
        });
        Blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // set the color to relative layout
                constraintLayout.setBackgroundColor(getResources().getColor(R.color.color2));
            }
        });
        Green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // set the color to relative layout
                constraintLayout.setBackgroundColor(getResources().getColor(R.color.color3));
            }
        });

    }



    }
