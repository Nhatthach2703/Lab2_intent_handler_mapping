package com.nhatthach.lab2_intent_handler_mapping;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Calculator extends AppCompatActivity {

    //1.
    TextView tvResult;
    EditText edNumberA,edNumberB;
    Button btnAdd, btnSubtract, btnMultiply, btnDivide;
    Button btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        //2. mapping UI components
        tvResult =(TextView) findViewById(R.id.tvResult);
        edNumberA =(EditText) findViewById(R.id.edNumberA);
        edNumberB = findViewById(R.id.edNumberB);
        btnAdd = findViewById(R.id.btnAdd);
        btnSubtract = findViewById(R.id.btnSub);
        btnMultiply = findViewById(R.id.btnMul);
        btnDivide = findViewById(R.id.btnDiv);
        btnBack = findViewById(R.id.btnBackToMain);
        //3
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strNumberA =
                        edNumberA.getText().toString();
                String strNumberB =
                        edNumberB.getText().toString();
                if (strNumberA.isEmpty() ||
                        strNumberB.isEmpty()) {
                    Toast.makeText(getApplicationContext(),"Please enter both numbers", Toast.LENGTH_SHORT).show();
                    return;
                }else {
                    double numberA =
                            Double.parseDouble(strNumberA);
                    double numberB =
                            Double.parseDouble(strNumberB);
                    double result = numberA + numberB;
                    tvResult.setText(numberA + " + " + numberB + " = " + result);
                    Toast.makeText(getApplicationContext(),"Result: " + result, Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strNumberA = edNumberA.getText().toString();
                String strNumberB = edNumberB.getText().toString();
                if (strNumberA.isEmpty() || strNumberB.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Please enter both numbers", Toast.LENGTH_SHORT).show();
                    return;
                } else {
                    double numberA = Double.parseDouble(strNumberA);
                    double numberB = Double.parseDouble(strNumberB);
                    double result = numberA - numberB;
                    tvResult.setText(numberA + " - " + numberB + " = " + result);
                    Toast.makeText(getApplicationContext(), "Result: " + result, Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strNumberA = edNumberA.getText().toString();
                String strNumberB = edNumberB.getText().toString();
                if (strNumberA.isEmpty() || strNumberB.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Please enter both numbers", Toast.LENGTH_SHORT).show();
                    return;
                } else {
                    double numberA = Double.parseDouble(strNumberA);
                    double numberB = Double.parseDouble(strNumberB);
                    double result = numberA * numberB;
                    tvResult.setText(numberA + " * " + numberB + " = " + result);
                    Toast.makeText(getApplicationContext(), "Result: " + result, Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strNumberA = edNumberA.getText().toString();
                String strNumberB = edNumberB.getText().toString();
                if (strNumberA.isEmpty() || strNumberB.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Please enter both numbers", Toast.LENGTH_SHORT).show();
                    return;
                } else {
                    double numberA = Double.parseDouble(strNumberA);
                    double numberB = Double.parseDouble(strNumberB);
                    if (numberB == 0) {
                        Toast.makeText(getApplicationContext(), "Cannot divide by zero", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    double result = numberA / numberB;
                    tvResult.setText(numberA + " / " + numberB + " = " + result);
                    Toast.makeText(getApplicationContext(), "Result: " + result, Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}