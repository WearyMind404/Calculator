package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    private EditText e1, e2;
    private Button b1, b2,b3,b4;
    private TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = findViewById(R.id.e1);
        e2 = findViewById(R.id.e2);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        t1 = findViewById(R.id.t1);
        t2 = findViewById(R.id.t2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(e1.getText().toString());
                double num2 = Double.parseDouble(e2.getText().toString());
                double result =num1+num2;
                t2.setText(String.valueOf(result));
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(e1.getText().toString());
                double num2 = Double.parseDouble(e2.getText().toString());
                double result =num1-num2;
                t2.setText(String.valueOf(result));
            }
        });


        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(e1.getText().toString());
                double num2 = Double.parseDouble(e2.getText().toString());
                double result =num1*num2;
                t2.setText(String.valueOf(result));
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(e1.getText().toString());
                double num2 = Double.parseDouble(e2.getText().toString());
                double result =num1/num2;
                t2.setText(String.valueOf(result));
            }
        });

            }

        }
